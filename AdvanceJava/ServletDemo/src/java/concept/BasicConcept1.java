package concept;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "concept1", urlPatterns = {"/conc","/con"})
public class BasicConcept1 extends HttpServlet {
    
    public void doGet(HttpServletRequest sr, HttpServletResponse sr1) throws ServletException, IOException {
        doPost(sr, sr1);
    }
     @Override
    public void doPost(HttpServletRequest sr, HttpServletResponse sr1) throws ServletException, IOException {
        PrintWriter out=sr1.getWriter();
        sr1.setContentType("text/html");
        String name=sr.getParameter("nm");
        
        out.println("<body bgcolor='cyan'><center>");
        for(int i=0;i<7;i++){
        out.println("<h"+i+">Hello "+name+"....</h"+i+">");
        }
        out.println("</center></body>");
    }
    
}
