package multiTable;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;


	@Entity
	@Table(name = "customer")
	@SecondaryTable(name = "custInfo")
	public class Customer implements Serializable{
	    
	    @Id
//	    @GeneratedValue
	    private int id;
	    private String name;
	    private String city;
	    private String phNo;
	    private String email;

	    public Customer() {
	    }

	    @Id
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    @Column(table = "custInfo")
	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    @Column(table = "custInfo")
	    public String getPhNo() {
	        return phNo;
	    }

	    public void setPhNo(String phNo) {
	        this.phNo = phNo;
	    }

	    @Column(table = "custInfo")
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    @Override
	    public String toString() {
	        return "Customer{" + "id=" + id + ", name=" + name + ", city=" + city + ", phNo=" + phNo + ", email=" + email + '}';
	    }
	}
