package oneToMany;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestOneToMany {

	public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tc = s.beginTransaction();
        
        College c=new College();
        c.setcId(1440);
        c.setcName("jamuna bai College");
        
        ColStudent cs1=new ColStudent();
        cs1.setsId(101);
        cs1.setsName("yash");
        cs1.setsRollNo(13);
        cs1.setCollege(c);
        ColStudent cs2=new ColStudent();
        cs2.setsId(102);
        cs2.setsName("HrushiKeshh");
        cs2.setsRollNo(51);
        cs2.setCollege(c);
        ColStudent cs3=new ColStudent();
        cs3.setsId(104);
        cs3.setsName("ZigZack");
        cs3.setsRollNo(64);
        cs3.setCollege(c);
        
        List<ColStudent> students = new ArrayList<>();
        students.add(cs1);
        students.add(cs2);
        students.add(cs3);

        c.setStudents(students);

        s.save(c);

        
        tc.commit();
        
        
	}

}
