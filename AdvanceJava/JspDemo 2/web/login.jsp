<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            String user=request.getParameter("un");
            String password=request.getParameter("pass");
            
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testemp?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false","root","password");
//            PreparedStatement pst=con.prepareStatement("Select * from Employee where empName=? and empPass=?");
            CallableStatement stmt=con.prepareCall("{call login(?,?)}");
                stmt.setString(1,user);
                stmt.setString(2,password);
            ResultSet rs=stmt.executeQuery();
            
            if(rs.next()){
                out.println("<h3>Login Successful</h3>");
            }
            else{
                out.println("<h3>Login Fail</h3>");
            }
            }
            catch(Exception e){
                out.println(e.getMessage());
            }
            
        %>
    </body>
</html>
