package com.nagarro.assignment5.Hrportal.service;


import java.util.List;

import com.nagarro.assignment5.Hrportal.model.Employee;

public interface EmployeeService {
    List < Employee > getEmployees(String username);
	Employee getEmployeeByEmployeeCode(long employeecode);

	void deleteEmployeeByEmployeeCode(long employeecode);

	void saveEmployee(Employee employee);
}