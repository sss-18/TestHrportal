package com.nagarro.assignment5.Hrportal.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nagarro.assignment5.Hrportal.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	@Query("SELECT n FROM Employee n WHERE n.username = ?1")
	List<Employee> findemployeebyUsername(String usrname);
}