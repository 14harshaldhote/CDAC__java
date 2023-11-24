<%-- 
    Document   : gbill
    Created on : 24-Nov-2023, 3:04:19 pm
    Author     : harshalsMac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Bill Page</title>
</head>
<body>

<%
    if ("POST".equalsIgnoreCase(request.getMethod())) {
        String[] sp = request.getParameterValues("products");
        
        if (sp != null && sp.length > 0) {
            int totalBill = 0;

%>
            <h2>Generated Bill</h2>
            <table border="1">
                <tr>
                    <th>Product</th>
                    <th>Price</th>
                </tr>
<%
            for (String product : sp) {
                int price = getProductPrice(product);
                totalBill += price;

%>
                <tr><td><%= product %></td>
                    <td><%= price %></td>
                </tr>
<%
            }
%>
            </table>
            <p>Total Bill: <%= totalBill %></p>
<%
        } else {
            
%>
         <p>No products selected.</p>
<%
        }
    }
%>

<%-- Define the getProductPrice method --%>
<%!
    int getProductPrice(String product) {
        switch (product) {
            case "Shampoo":
                return 10;
            case "BodyWash":
                return 8;
            case "Lotion":
                return 15;
            default:
                return 0;
        }
    }
%>

</body>
</html>
