package ecommerce;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "productPage", urlPatterns = {"/productPage"})
public class productPage extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        List<Product> shoppingCart = (List<Product>) request.getSession().getAttribute("cart");
        if (shoppingCart == null) {
            shoppingCart = new ArrayList<>();
            request.getSession().setAttribute("cart", shoppingCart);
        }

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");

            out.println("<title>Shopping Cart</title>");
            out.println("<style>");
            // (Your CSS styles here)
            out.println("</style>");
            out.println("</head>");

            out.println("<body>");

            if (request.getParameter("atc") != null) {
                String productName = request.getParameter("pn");
                String quantityStr = request.getParameter("pq");
                int quantity = 0;

                if (quantityStr != null && !quantityStr.isEmpty()) {
                    quantity = Integer.parseInt(quantityStr);
                }

                if (productName != null && quantity > 0) {
                    Product product = new Product(productName, quantity);
                    updateCart(shoppingCart, product);
                    out.println("<p>Product added to the cart: " + product.getName() + ", Quantity: " + product.getQuantity() + "</p>");
                }
            } else if (request.getParameter("bill") != null) {
                out.println("<h1>Shopping Cart</h1>");
                out.println("<table border=\"1\">");
                out.println("<tr><th>Product</th><th>Quantity</th><th>Price</th></tr>");

                int totalBill = 0;

                for (Product product : shoppingCart) {
                    int qty = product.getQuantity();
                    int price = getProductPrice(product.getName());

                    out.println("<tr><td>" + product.getName() + "</td><td>" + qty + "</td><td>" + price + "</td></tr>");

                    totalBill += price * qty;
                }

                out.println("</table>");
                out.println("<p>Total Bill: " + totalBill + "</p>");
            } else if (request.getParameter("logout") != null) {
                request.getSession().invalidate();
                response.sendRedirect("login.html");
                return;
            }

            out.println("<form >");
            out.println("<div class=\"mb-3\">");
            out.println("<label for=\"productSelect\" class=\"form-label\">Select Body Care Product</label>");
            out.println("<select class=\"form-select\" id=\"productSelect\" name=\"pn\">");
            out.println("<option value=\"shampoo\">Shampoo</option>");
            out.println("<option value=\"bodywash\">Body Wash</option>");
            out.println("<option value=\"lotion\">Body Lotion</option>");
            out.println("</select>");
            out.println("</div>");
            out.println("<div class=\"mb-3\">");
            out.println("<label for=\"quantityInput\" class=\"form-label\">Product Quantity</label>");
            out.println("<input type=\"text\" class=\"form-control\" id=\"quantityInput\" name=\"pq\">");
            out.println("</div>");
            out.println("<button type=\"submit\" name=\"atc\" class=\"btn btn-primary\">Add To Cart</button>");
            out.println("<button type=\"submit\" name=\"bill\" class=\"btn btn-success\">Generate Bill</button>");
            out.println("</form>");

            out.println("<div class=\"mb-3\">");
            out.println("<form method=\"post\" action=\"logoutSe\">");
            out.println("<button type=\"submit\" name=\"logout\" class=\"btn btn-danger\">Logout</button>");
            out.println("</form>");
            out.println("</div>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    private void updateCart(List<Product> cart, Product newProduct) {
        for (Product product : cart) {
            if (product.getName().equals(newProduct.getName())) {
                int newQuantity = product.getQuantity() + newProduct.getQuantity();
                product.setQuantity(newQuantity);
                return;
            }
        }

        cart.add(newProduct);
    }

    private int getProductPrice(String product) {
        switch (product) {
            case "shampoo":
                return 10;
            case "bodywash":
                return 8;
            case "lotion":
                return 15;
            default:
                return 0;
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
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Product Page Servlet";
    }

    private static class Product {

        private String name;
        private int quantity;

        public Product(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}
