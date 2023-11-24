package elctricity;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FinalBilling", urlPatterns = {"/FinalBilling"})
public class FinalBilling extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FinalBilling</title>");            
            out.println("</head>");
            out.println("<body>");
            String p=request.getParameter("pr");
            String c=request.getParameter("cr");
            
            double rate=(Double)request.getAttribute("unitRate");
            if(!p.equals("") || !c.equals("")){
                int pre=Integer.parseInt(p);
                int cur=Integer.parseInt(c);
               out.println("Previous month Reading was "+pre+"<br/>");
            out.println("Current month Reading is "+cur+"<br/>");
            out.println("Total unit consume "+(cur-pre)+"<br/>");
            out.println("Per unit rate is INR "+rate+"/-<br/>");
            out.println("Payble amount is INR "+(cur-pre)*rate+"/-<br/>");
            }
            else{
             response.sendRedirect("error.html");
            }
            out.println("</body>");
            out.println("</html>");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
