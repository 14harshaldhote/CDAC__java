package testingSql;
import java.sql.*;
public class sql {

	public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/placement?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false","root","Mumma@123");
            Statement pst=con.createStatement();
            String sql="Select * from Employee where empName='Ram' and empPass='ram'";
            ResultSet rs=pst.executeQuery(sql);
            
            if(rs.next()){
                System.out.println("<h3>Login Successful</h3>");
            }
            else{
                System.out.println("<h3>Login Fail</h3>");
            }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
    
}