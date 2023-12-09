//package oneToOne;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class TestOneToOne {
//
//	public static void main(String []args){
//		// TODO Auto-generated constructor stub
//		 Configuration config = new Configuration();
//	        config.configure("hibernate.cfg.xml");
//	        SessionFactory sf = config.buildSessionFactory();
//	        Session s = sf.openSession();
//	        Transaction tc = s.beginTransaction();
//	        
//	        
//	        Person p=new Person();
//	        p.setpId(101);
//	        p.setpName("Renuu");
//	        
//	        
//	        PersonDetail pd= new PersonDetail()
//;
//	        pd.setdId(11);
//	        pd.setPhNo(723773879312);
//	        pd.setCity("Nagpur");
//	        pd.setEmail("SomeOnenamedRENUU@gmail.com");
//	        
//	        
//	        s.save(p);
//	        s.save(pd);
//	   
//
//	        tc.commit();
//	        s.close();
//	}
//	
//	
//
//}
