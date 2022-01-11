package com.docke.mysql.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docke.mysql.entity.Department;
import com.docke.mysql.entity.Employee;
import com.docke.mysql.repositorys.DepartmentRepository;
import com.docke.mysql.repositorys.EmployeeRepository;
import com.docke.mysql.service.EmpDepService;



@Service
public class EmpDepServiceImpl implements EmpDepService{
	
	@Autowired
	private DepartmentRepository deprepo; 
	
	@Autowired
	private EmployeeRepository emprepo;

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return emprepo.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return emprepo.findAll(); 
	}

	@Override
	public Department addDepartment(Department dep) {
		// TODO Auto-generated method stub
		return deprepo.save(dep);
	}

	@Override
	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		return deprepo.findAll();
	} 
	

}
