<%-- <%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%="Welome to jsp" %>
<% String myInst=(String)request.getAttribute("inst"); %>
<%="I am student of "+ myInst %>
Im am student of ${inst }


</body>
</html> --%>