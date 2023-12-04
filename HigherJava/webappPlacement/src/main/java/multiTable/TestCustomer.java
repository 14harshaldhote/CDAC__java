package multiTable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class TestCustomer {

    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tc = s.beginTransaction();

        Customer c = new Customer();
        c.setId(101);
        c.setName("Suresh");
        c.setPhNo("9088772233");
        c.setCity("Rampur");
        c.setEmail("suresh@gmail.com");

        s.save(c);
        tc.commit();
        s.close();
    }
}
