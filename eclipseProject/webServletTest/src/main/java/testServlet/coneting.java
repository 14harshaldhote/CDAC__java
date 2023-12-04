package testServlet;
import java.sql.*;

public class coneting {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String jdbcUrl = "jdbc:mysql://localhost:3306/placement?useTimeZone=true&serverTimezone=UTC&autoReconnectForPools=true&useSSL=false";
            String username = "root";
            String password = "Mumma@123";
            
            try (Connection con = DriverManager.getConnection(jdbcUrl, username, password);
                 Statement pst = con.createStatement()) {

                String sql = "SELECT * FROM Employee WHERE empName='Ramesh' AND empPass='ram'";
                ResultSet rs = pst.executeQuery(sql);

                if (rs.next()) {
                    System.out.println("<h3>Login Successful</h3>");
                } else {
                    System.out.println("<h3>Login Fail</h3>");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
