<%-- 
    Document   : login
    Created on : 24-Nov-2023, 2:02:59 pm
    Author     : harshalsMac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Page</title>
</head>
<body>

<%
    if ("POST".equalsIgnoreCase(request.getMethod())) {
        String username = request.getParameter("un");
        String password = request.getParameter("pass");

        if ("harsh".equals(username) && "ram".equals(password)) {
            session.setAttribute("sessionUser", username);
            response.sendRedirect("shopping.jsp");
        } else {
            out.println("<p>Invalid credentials. Please try again.</p>");
            response.sendRedirect("index.html");
        }
    }
%>

</body>
</html>
