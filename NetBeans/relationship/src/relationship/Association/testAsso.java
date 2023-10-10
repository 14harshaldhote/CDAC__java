package relationship.Association;

class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

class Address {
    private int houseNo;
    private String landMark;
    private String city;
    private String pincode;

    public Address(int houseNo, String landMark, String city, String pincode) {
        this.houseNo = houseNo;
        this.landMark = landMark;
        this.city = city;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address {houseNo=" + houseNo + ", landMark=" + landMark + ", City=" + city + ", Pincode=" + pincode + "}";
    }
}

public class testAsso {
    public static void main(String[] args) {
        Address address = new Address(123, "Main Street", "Cityville", "12345");
        Person person = new Person("John Doe", address);

       
        person.printDetails();
    }
}
