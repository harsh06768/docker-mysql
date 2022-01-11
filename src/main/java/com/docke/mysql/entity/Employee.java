package com.docke.mysql.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="tbl_employee")
public class Employee {

	@Id
	private long id;
	private String name; 
	private long salary; 
	
	
	@ManyToOne( cascade = CascadeType.ALL)
	@JsonBackReference
	private Department department;


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(long id, String name, long salary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	} 
	
	
}
