package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestStudent {
    public static void main(String[] args) {
        AnnotationConfiguration config=new AnnotationConfiguration();
//        config.addAnnotatedClass(Student.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tc=s.beginTransaction();
        
        Student stud=new Student();
        stud.setId(101);
        stud.setName("Ramesh");
        stud.setEmail("ramesh@gmail.com");
        stud.setCity("Rampur");
        
        s.save(stud);//create a batch file
        tc.commit();//data changes
        s.close();
    }
}
