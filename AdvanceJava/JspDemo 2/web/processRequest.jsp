<%@include file="header.html"%>
<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error.jsp"%>

        <h1>Division of Numbers</h1>
        <%
        int n1=Integer.parseInt(request.getParameter("fn"));
        int n2=Integer.parseInt(request.getParameter("sn"));
        %>
        <%= "Division is : "+(n1/n2)%>
        
<%@include file="footer.jsp"%>
   
