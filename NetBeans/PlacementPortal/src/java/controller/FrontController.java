package controller;

import dao.StudentDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

@WebServlet(name = "FrontController", urlPatterns = {"/"})
public class FrontController extends HttpServlet {
    StudentDao sd=null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FrontController</title>");            
            out.println("</head>");
            out.println("<body>");
            //request.getContextPath();//PlacementPortal
            String action=request.getServletPath();//insert
            switch(action){
                case "/new":
                    newStudent(request,response);
                    break;
                case "/insert":
                    insertStudent(request,response);
                    break;
                case "/update":
                    updateStudent(request,response);
                    break;
                case "/edit":
                    editStudent(request,response);
                    break;
                case "/showStudent":
                    showStudent(request,response);
                    break;
                case "/delete":
                    deleteStudent(request,response);
                    break;
                default:
                    showAllStudent(request,response);
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void insertStudent(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
       String name=request.getParameter("nm");
       String email=request.getParameter("em");
       String city=request.getParameter("ct");
       String password=request.getParameter("pass");
       Student student=new Student(name, email,city, password);
       sd.insertStudent(student);
        showAllStudent(request, response);
    }

    private void showStudent(HttpServletRequest request, HttpServletResponse response) {
       int id=Integer.parseInt(request.getParameter("id"));
       Student student=sd.showStudent(id);
    }

    private void showAllStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        sd=new StudentDao();
        List<Student> studList=sd.showAllStudents();
        request.setAttribute("students",studList);
        RequestDispatcher rd=request.getRequestDispatcher("displayRecord.jsp");
        rd.forward(request, response);
    }

    private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        sd=new StudentDao();
        int id=Integer.parseInt(request.getParameter("id"));
        sd.deleteStudent(id);
        showAllStudent(request, response);
    }

    private void newStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student=new Student();
        request.setAttribute("student", student);
        RequestDispatcher rd=request.getRequestDispatcher("newStudent.jsp");
        rd.forward(request, response);
    }

    private void editStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       int id=Integer.parseInt(request.getParameter("id"));
       sd=new StudentDao();
       Student stud=sd.showStudent(id);
       request.setAttribute("student", stud);
        RequestDispatcher rd=request.getRequestDispatcher("newStudent.jsp");
        rd.forward(request, response);
    }

    private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       sd=new StudentDao();
       int id=Integer.parseInt(request.getParameter("id"));
       String name=request.getParameter("nm");
       String email=request.getParameter("em");
       String city=request.getParameter("ct");
       String pass=request.getParameter("pass");
       Student student=new Student(id,name,email,city,pass);
       sd.updateStudent(student);
       showAllStudent(request, response);
    }

}
