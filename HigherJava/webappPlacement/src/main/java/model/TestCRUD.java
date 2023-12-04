package model;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class TestCRUD {
    public static void main(String[] args) {
         Configuration config=new Configuration();
//       config.addAnnotatedClass(Student.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tc=s.beginTransaction();
        
        
        //Fetching Single record on the basis of id
        //get()-->Eager Fatcher and load()-->Lazy Fetcher
//        Student stud=(Student)s.get(Student.class, new Integer(1));
//        System.out.println(stud.getName());
//        System.out.println(stud.getCity());
//        System.out.println(stud.getEmail());
//        System.out.println(stud.getId());
        
        //Updateing the record
        Student stud1=(Student)s.load(Student.class, new Integer(1));
        stud1.setCity("Surat");
        s.update(stud1);
        tc.commit();
        
        //Deleting the record
//        Student stud=(Student)s.load(Student.class, new Integer(3));
//        s.delete(stud);
//        tc.commit();
        
        
        //Fetching all records
//        Query q=s.createQuery("From Student");
//        List<Student> lst=q.list();
//        for(Student st:lst){
//            System.out.println(st.getId()+" : "+st.getName()+" : "+st.getCity()+" : "+st.getEmail());
//        }
    }
}
