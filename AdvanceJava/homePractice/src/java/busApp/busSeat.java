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
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "busSeat", urlPatterns = "/busSeat")
public class busSeat extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String selectedSeats = request.getParameter("selectedSeat");
        if (selectedSeats != null && !selectedSeats.isEmpty()) {
            HttpSession session = request.getSession();
            session.setAttribute("selectedSeats", selectedSeats);

            int numberOfSeats = selectedSeats.split(",").length;

           
            session.setAttribute("numberOfSeats", String.valueOf(numberOfSeats));

            response.sendRedirect("busTicketServlet");
        } else {
            response.sendRedirect("error.html");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}


////@WebServlet(name="busSeat",urlPatterns = "/busSeat")
////public class busSeat extends HttpServlet {
//@WebServlet(name = "busSeat", urlPatterns = "/busSeat")
//public class busSeat extends HttpServlet {

//
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//        }
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
////    @Override
////    protected void doPost(HttpServletRequest request, HttpServletResponse response)
////            throws ServletException, IOException {
////        String selectedSeats = request.getParameter("selectedSeat");
////        if (selectedSeats != null) {
////            HttpSession session = request.getSession();
////            session.setAttribute("selectedSeats", selectedSeats);
////
////            response.sendRedirect("busTicketServlet");
////        } else {
////           
////            response.sendRedirect("error.html");
////        }
////    }
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String selectedSeats = request.getParameter("selectedSeat");
//        if (selectedSeats != null) {
//            HttpSession session = request.getSession();
//            session.setAttribute("selectedSeats", selectedSeats);
//
//            // Also set the numberOfSeats in the session
//            session.setAttribute("numberOfSeats", String.valueOf(selectedSeats.split(",").length));
//
//            response.sendRedirect("busTicketServlet");
//        } else {
//            response.sendRedirect("error.html");
//        }
//    }
//
//
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }
//}
