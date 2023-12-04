package dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentDao {
	private String driver ;
	private String url;
	private String userName;
	private String password;
	
	public StudentDao() {
		driver="com.mysql.cj.jdbc.Driver";
        url="jdbc:mysql://localhost:3306/portal?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";
        userName="root";
        password="Mumma@123";
	}

	
	

	private String showAllStudent="Select * from Student";
    private String showStudent="Select * from Student where id=?";
    private String insertStudent="Insert into Student(name,email,city,password) values(?,?,?,?)";
    private String deleteStudent="Delete from Student where id=?";
    private String updateStudent="Update Student set name=?,email=?,city=?,password=? where id=?";
    
    protected Connection getNewConnection(){
    	Connection con=null;
        try{
            Class.forName(driver);
            con=DriverManager.getConnection(url,userName,password);
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        return con;
    }

    public boolean insertStudent(Student student) throws SQLException {
        int recordIns=0;
       try(Connection con=getNewConnection();
           PreparedStatement pst=con.prepareStatement(insertStudent)){
           pst.setString(1, student.getName());
           pst.setString(2, student.getEmail());
           pst.setString(3, student.getCity());
           pst.setString(4, student.getPassword());
           recordIns=pst.executeUpdate();
       }
       catch(Exception e){
           System.err.println(e.getMessage());
       }
      
       return recordIns>0;
    }

    public Student showStudent(int id) {
        Student stud=null;
        try(Connection con=getNewConnection();
           PreparedStatement pst=con.prepareStatement(showStudent)){
           pst.setInt(1, id);
          ResultSet rs=pst.executeQuery();
           if(rs.next()){
               stud=new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5));
           }
       }
       catch(Exception e){
           System.err.println(e.getMessage());
       }
        return stud;
    }

    public List<Student> showAllStudents() {
        List<Student> lst=new ArrayList<>();
        try(Connection con=getNewConnection();
           PreparedStatement pst=con.prepareStatement(showAllStudent)){
          ResultSet rs=pst.executeQuery();
           while(rs.next()){
               lst.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5)));
           }
       }
       catch(Exception e){
           System.err.println(e.getMessage());
       }
        return lst;
    }

    public boolean deleteStudent(int id) {
        int deleteRecord=0;
         try(Connection con=getNewConnection();
           PreparedStatement pst=con.prepareStatement(deleteStudent)){
           pst.setInt(1, id);
          
           deleteRecord=pst.executeUpdate();
       }
       catch(Exception e){
           System.err.println(e.getMessage());
       }
         return deleteRecord>0;
    }

    public boolean updateStudent(Student student) {
         int updateRecord=0;
         try(Connection con=getNewConnection();
           PreparedStatement pst=con.prepareStatement(updateStudent)){
           pst.setString(1,student.getName());
           pst.setString(2,student.getEmail());
           pst.setString(3,student.getCity());
           pst.setString(4,student.getPassword());
           pst.setInt(5,student.getId());
          
           updateRecord=pst.executeUpdate();
       }
       catch(Exception e){
           System.err.println(e.getMessage());
       }
         return updateRecord>0;
    }

   
        
}
