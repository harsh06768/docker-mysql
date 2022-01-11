package com.docke.mysql.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docke.mysql.entity.Department;


@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Long>{

	
}
