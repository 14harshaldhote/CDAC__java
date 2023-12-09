
package Basic;


public class Student 
{
   private int id;
   private String sName;

    private Address address;
    
    public void setId(int id) {
        this.id = id;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", sName=" + sName+ "Address=" +address +'}';
    }
   
   
   
}
