<%-- 
    Document   : test
    Created on : 27-Dec-2023, 9:23:29 am
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
        <%-- this is a comment --%>
        
        <%-- declaritive tag --%>
        <%! int x=10;
        int disp(){
            return x*x;
        }
        %>
        
        <% 
        for(int i=1; i<8;i++){
            out.println("<h"+i+">"+disp()+"</h"+i+">");
            }
        %>
        
        <%= "im from test.jsp"%>
        
    </body>
</html>
