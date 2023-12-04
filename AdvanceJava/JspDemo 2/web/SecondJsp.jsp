<%-- 
    Document   : SecondJsp
    Created on : 25-Nov-2023, 1:35:47 pm
    Author     : OPS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Second Jsp Page</h1>
        <%
            String instName=request.getParameter("inst");
        %>
        <%= "I'm study in "+instName%>
    </body>
</html>
