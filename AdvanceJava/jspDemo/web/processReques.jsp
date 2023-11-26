<%-- 
    Document   : processReques
    Created on : 25-Nov-2023, 1:05:41 pm
    Author     : harshalsMac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Division of Numbers</h1>
        <%
    int n1 = Integer.parseInt(request.getParameter("fn"));
    int n2 = Integer.parseInt(request.getParameter("sn"));
%>
<%= "division of number : " + (n1/n2) %>

    </body>
</html>
