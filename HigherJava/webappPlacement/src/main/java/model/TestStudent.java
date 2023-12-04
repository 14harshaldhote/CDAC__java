package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestStudent {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tc = s.beginTransaction();

        // First Student
        Student stud1 = new Student();
        stud1.setId(104);  // Unique identifier for each student
        stud1.setName("Suresh");
        stud1.setEmail("suresh@gmail.com");
        stud1.setCity("Solapur");

        // Second Student
        Student stud2 = new Student();
        stud2.setId(102);  // Unique identifier for each student
        stud2.setName("Dinesh");
        stud2.setEmail("dinesh@gmail.com");
        stud2.setCity("Durgapur");

        // Third Student
        Student stud3 = new Student();
        stud3.setId(103);  // Unique identifier for each student
        stud3.setName("Bhavesh");
        stud3.setEmail("bhavesh@gmail.com");
        stud3.setCity("Bilaspur");

        s.save(stud1);
        s.save(stud2);
        s.save(stud3);

        tc.commit();
        s.close();
    }
}
