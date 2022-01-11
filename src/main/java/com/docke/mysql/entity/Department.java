package com.docke.mysql.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table(name="tbl_department")
public class Department {

	@Id
	private long depid; 
	private String depname; 
	
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Employee> employee;


	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Department(long depid, String depname, List<Employee> employee) {
		super();
		this.depid = depid;
		this.depname = depname;
		this.employee = employee;
	}


	public long getDepid() {
		return depid;
	}


	public void setDepid(long depid) {
		this.depid = depid;
	}


	public String getDepname() {
		return depname;
	}


	public void setDepname(String depname) {
		this.depname = depname;
	}


	public List<Employee> getEmployee() {
		return employee;
	}


	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	} 
	
	
	
	
	
}
