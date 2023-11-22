package concept;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BasicConcept extends GenericServlet{

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        PrintWriter out=sr1.getWriter();
        sr1.setContentType("text/html");
        
        out.println("<body bgcolor='cyan'><center>");
        for(int i=0;i<7;i++){
        out.println("<h"+i+">Hello Servlet....</h"+i+">");
        }
        out.println("</center></body>");
    }
    
}