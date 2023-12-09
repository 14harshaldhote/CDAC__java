package manyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Developer {
	@Id
	private int dId;
	private String name;
	@ManyToMany(cascade=CascadeType.ALL)
	
	@JoinTable(name="Dev_Pro", joinColumns = {@JoinColumn(name="dId")},inverseJoinColumns = {@JoinColumn(name="pId")})
	private List<Project> projects;
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
}
