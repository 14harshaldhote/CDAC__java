package manyToMany;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class TestManyToMany {

	

	public static void main(String[] args) {
		 Configuration config = new Configuration();
	        config.configure("hibernate.cfg.xml");
	        SessionFactory sf = config.buildSessionFactory();
	        Session s = sf.openSession();
	        Transaction tc = s.beginTransaction();
	        
	        
	        Developer d=new Developer();
	        d.setdId(11212310);
	        d.setName("Hrushikesh Mane");
	        
	        Developer d1=new Developer();
	        d1.setdId(11212311);
	        d1.setName("Harshal Dhote");
	        
	        Developer d2=new Developer();
	        d2.setdId(11212312);
	        d2.setName("Yash Ambekar");
	        
	        Developer d3=new Developer();
	        d3.setdId(11212313);
	        d3.setName("Swaraj Mahindre");
	        
	        List<Developer> developers=new ArrayList<>();
	        developers.add(d);
	        developers.add(d1);
	        developers.add(d2);
	        developers.add(d3);
	        
	        
	        
	        Project p=new Project();
	        p.setpId(909);p.setpName("DRDO SOFT WEB");
	        
	        Project p1=new Project();
	        p1.setpId(821);
	        p1.setpName("Principal GLOBAl SOFT WEB");
	        
	        List<Project> projects=new ArrayList<>();
	        projects.add(p);
	        projects.add(p1);
	       
	        d1.setProjects(projects);
	        p1.setDevelopers(developers);
	        
	        
	        
	        s.save(d);
	        s.save(d1);
	        s.save(d2);
	        s.save(d3);
	        
	       

	        
	        tc.commit();
	        s.close();
	        
	        
	        
	}

}
