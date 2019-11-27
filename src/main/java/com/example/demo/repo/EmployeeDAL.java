  package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.*;

public interface EmployeeDAL {

	public Employee create(Employee emp);
	public boolean delete(Employee emp);
	
	public List<Employee> viewEmployee();
	public void save(Employee emp);
	public List<Employee> findAll();
	
}