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

@WebServlet(name = "routeServlet", urlPatterns = "/routeServlet")
public class routeServlet extends HttpServlet {

    private static final double DELHI_MUMBAI_DISTANCE = 1220.0;
    private static final double DELHI_NAGPUR_DISTANCE = 1040.0;
    private static final double DELHI_BANGALORE_DISTANCE = 2540.0;
    private static final double DELHI_PUNE_DISTANCE = 1480.0;
    private static final double DELHI_RAIPUR_DISTANCE = 1250.0;
    private static final double MUMBAI_NAGPUR_DISTANCE = 720.0;
    private static final double MUMBAI_BANGALORE_DISTANCE = 980.0;
    private static final double MUMBAI_PUNE_DISTANCE = 740.0;
    private static final double MUMBAI_RAIPUR_DISTANCE = 1050.0;
    private static final double NAGPUR_BANGALORE_DISTANCE = 1490.0;
    private static final double NAGPUR_PUNE_DISTANCE = 720.0;
    private static final double NAGPUR_RAIPUR_DISTANCE = 280.0; 
    private static final double BANGALORE_PUNE_DISTANCE = 1140.0;
    private static final double BANGALORE_RAIPUR_DISTANCE = 1470.0;
    private static final double PUNE_RAIPUR_DISTANCE = 1120.0;

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
        
        switch (source.toLowerCase() + "_" + destination.toLowerCase()) {
            case "delhi_mumbai":
                return DELHI_MUMBAI_DISTANCE;
            case "delhi_nagpur":
                return DELHI_NAGPUR_DISTANCE;
            case "delhi_bangalore":
                return DELHI_BANGALORE_DISTANCE;
            case "delhi_pune":
                return DELHI_PUNE_DISTANCE;
            case "delhi_raipur":
                return DELHI_RAIPUR_DISTANCE;
            case "mumbai_nagpur":
                return MUMBAI_NAGPUR_DISTANCE;
            case "mumbai_bangalore":
                return MUMBAI_BANGALORE_DISTANCE;
            case "mumbai_pune":
                return MUMBAI_PUNE_DISTANCE;
            case "mumbai_raipur":
                return MUMBAI_RAIPUR_DISTANCE;
            case "nagpur_bangalore":
                return NAGPUR_BANGALORE_DISTANCE;
            case "nagpur_pune":
                return NAGPUR_PUNE_DISTANCE;
            case "nagpur_raipur":
                return NAGPUR_RAIPUR_DISTANCE;
            case "bangalore_pune":
                return BANGALORE_PUNE_DISTANCE;
            case "bangalore_raipur":
                return BANGALORE_RAIPUR_DISTANCE;
            case "pune_raipur":
                return PUNE_RAIPUR_DISTANCE;
            default:
                return 0.0; 
        }
    }

    private double calculateFare(double distance, String busType) {
        double rate = (busType.equals("ac")) ? 7.0 : 3.0;
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
