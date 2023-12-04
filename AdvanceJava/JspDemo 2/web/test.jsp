<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--This is my first Jsp Comment--%>
        
        <%--Declairative Tag--%>
        <%!
            int x=10;
            int display(){
                return x*x;
            }
        %>
        
        <%--Scriptlet Tag--%>
        <%
            for(int i=1;i<8;i++){
                out.println("<h"+i+">"+display()+"</h"+i+">");
            }
            String name=request.getParameter("nm");
            application.setAttribute("inst","CDac");
        %>
        
        <%--Expression Tag--%>
        <h3>
        <%= "Hello "+name+" : "+application.getAttribute("inst") %>
        </h3>
    </body>
</html>
