/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package busApp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="routeServlet", urlPatterns = "/routeServlet")
public class routeServlet extends HttpServlet {

     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String source = request.getParameter("source");
        String destination = request.getParameter("destination");
        String busType = request.getParameter("busType");

        
        double distance = calculateDistance(source, destination);

       
        double fare = calculateFare(distance, busType);

        try (PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Route Information</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Route Information:</h2>");
            out.println("<p>Source: " + source + "</p>");
            out.println("<p>Destination: " + destination + "</p>");
            out.println("<p>Bus Type: " + (busType.equals("ac") ? "AC" : "Non-AC") + "</p>");
            out.println("<p>Distance: " + distance + " km</p>");
            out.println("<p>Fare: Rs. " + fare + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    private double calculateDistance(String source, String destination) {
        
        return 500.0; 
    }

    private double calculateFare(double distance, String busType) {
        
        double rate = (busType.equals("ac")) ? 12.0 : 7.0;
        return distance * rate;
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
