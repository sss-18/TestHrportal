package com.nagarro.assignment5.Hrportal.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.assignment5.Hrportal.model.Employee;
import com.nagarro.assignment5.Hrportal.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    
    @Override
    public List < Employee > getEmployees(String username) {
        return employeeRepository.findemployeebyUsername(username);
    }
    @Override
    public Employee getEmployeeByEmployeeCode(long employeecode) {
        Optional < Employee > optional = employeeRepository.findById(employeecode);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            return employee;
        }
        return employee;
    }
    
   
    @Override
    public void deleteEmployeeByEmployeeCode(long employeecode) {
    	employeeRepository.deleteById(employeecode);
    }
    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
        
    }
}