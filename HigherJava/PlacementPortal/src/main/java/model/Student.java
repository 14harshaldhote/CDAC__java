package model;

public class Student {

	
		// TODO Auto-generated constructor stub
		protected int id;
		protected String name;
		protected String email;
		protected String city;
		protected String password;
		
		public Student() {}
		
		public Student(int id, String name, String email, String city, String password) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.city = city;
	        this.password = password;
	    }

	    public Student(String name, String email, String city, String password) {
	        this.name = name;
	        this.email = email;
	        this.city = city;
	        this.password = password;
	    }
	    
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getCity() {
	        return city;
	    }
	    public String getPassword() {
	        return password;
	    }

	    @Override
	    public String toString() {
	        return "Student{" + "id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", password=" + password + '}';
	    }
	

}
