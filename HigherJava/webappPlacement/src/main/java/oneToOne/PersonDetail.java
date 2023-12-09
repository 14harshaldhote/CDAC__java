package oneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonDetail {
	
	
		// TODO Auto-generated constructor stub
		@Id
		private int did;
		
		private long pNo;
		private String city;
		@Column(unique=true)
		private String email;
		


}
