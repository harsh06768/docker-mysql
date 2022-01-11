package com.docke.mysql.service;

import java.util.List;

import com.docke.mysql.entity.Department;
import com.docke.mysql.entity.Employee;



public interface EmpDepService {

	public Employee addEmployee(Employee emp); 
	public List<Employee> getAllEmployee();
	
	public Department addDepartment(Department dep); 
	public List<Department> getAllDepartment();
	
	
	
	
}
