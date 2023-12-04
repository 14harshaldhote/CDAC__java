package model;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity//For Table
public class Student {
    
    @Id//For Primarty Key
    private int id;
    private String name;
    private String email;
    private String city;
    
    public Student() {
    }

    
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + '}';
    }
}