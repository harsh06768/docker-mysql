package com.docke.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docke.mysql.entity.Department;
import com.docke.mysql.entity.Employee;
import com.docke.mysql.service.EmpDepService;


@RestController
@RequestMapping("/org")
public class EmpDepController {

	@Autowired
	EmpDepService empdep; 
	
	
	@PostMapping("/addemployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp){
		return new ResponseEntity<Employee>(empdep.addEmployee(emp), HttpStatus.CREATED); 
		
	}
	
	@GetMapping("/getallemployee")
	public List<Employee> getAllEmployee(){
		return empdep.getAllEmployee(); 
	}
	
	@PostMapping("/adddepartment")
	public ResponseEntity<Department> addDepartment(@RequestBody Department dep){
		return new ResponseEntity<Department>(empdep.addDepartment(dep), HttpStatus.CREATED); 
	}
	
	
	@GetMapping("/getalldepartment")
	public List<Department> getAllDepartment(){
		return empdep.getAllDepartment(); 
	}
	
	
	
	
	
	
	
	
	
}
