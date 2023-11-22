
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;

public class ServletLifeCycle implements Servlet{

    @Override
    public void init(ServletConfig sc) throws ServletException {
        System.out.println("Init method()");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        System.out.println("service method()");
    }

    @Override
    public String getServletInfo() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("destroy method()");
    }

}