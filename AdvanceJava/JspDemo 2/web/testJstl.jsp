<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><c:out value="Soft Polynomials"/></h1>
        <c:set var="name" value="Ramesh" scope="session"> </c:set>
            <c:out value="${name}"></c:out>
            
            <c:set var="marks" value="88" scope="request"/>
            <%--<c:if test="${marks>50}">
                Intelligent Student
            </c:if>
            <c:if test="${marks<50}">
                Poor Student
            </c:if>--%>
                
               <%-- <c:choose>
                    <c:when test="${marks>50 && marks<80}">
                        Average Student
                    </c:when>
                    <c:when test="${marks>80 && marks<100}">
                        Brillient Student
                    </c:when>
                    <c:when test="${marks<50}">
                        Poor Student
                    </c:when>
                    <c:otherwise>
                        Not recognition
                    </c:otherwise>
                </c:choose>
               <c:forEach var="i" begin="1" end="15" step="2">
                        ${i}
               </c:forEach>--%>
               <% String names[]={"Ramesh","Suresh","Dinesh","Bhavesh"};%>
               <c:forEach var="n" items="<%=names%>">
                  <p>${n}
               </c:forEach>
                      
                      <c:forTokens var="na" items="My Name is Khan" delims=" ">
                          <p>${na}
                      </c:forTokens>
    </body>
</html>
