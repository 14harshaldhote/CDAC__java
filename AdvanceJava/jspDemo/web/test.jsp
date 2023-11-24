<%-- 
    Document   : test
    Created on : 24-Nov-2023, 12:02:06 pm
    Author     : harshalsMac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" buffer="8kb"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <h1>Hello World!</h1>
        
        <%-- I'm a comment --%>
        
        <%!
            int x = 16;
        %>
        
        <%!
            int display() {
                return x;
            }
        %>
        
        <%
            for (int i = 1; i < 8; i++) {
                out.println(display());
                out.println("<br>");
            }
            
        %>
        <h1>Hello JSP i'm done with work</h1>
       
    </body>
</html>
