package oneToMany;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.*;
import java.util.List;




@Entity
@Table(name = "College")

public class College {

	private String cName;
	@Id
	private int cId;
	
	@OneToMany(mappedBy = "college", cascade = (CascadeType.ALL))
	private List<ColStudent> students;

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public List<ColStudent> getStudents() {
		return students;
	}

	public void setStudents(List<ColStudent> students) {
		this.students = students;
	}

	
	
	
	
	
	
}
