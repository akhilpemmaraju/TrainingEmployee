package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public class EmployeeDALImp implements EmployeeDAL{
	
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public Employee create(Employee emp) {
		// TODO Auto-generated method stub
		return mongo.save(emp);
	}

	@Override
	public boolean delete(Employee emp) {
		// TODO Auto-generated method stub
		return mongo.remove(emp).wasAcknowledged();
	}

	@Override
	public List<Employee> viewEmployee() {
		// TODO Auto-generated method stub
		return mongo.findAll(Employee.class);
	}

	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}