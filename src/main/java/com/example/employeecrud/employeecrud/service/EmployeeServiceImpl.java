package com.example.employeecrud.employeecrud.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeecrud.employeecrud.entity.Employee;
import com.example.employeecrud.employeecrud.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepo;
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empRepo.save(employee);
	}
	@Override
	public Employee getEmployeeByid(int empId) {
		Optional<Employee> emp=empRepo.findById(empId);
		Employee employee=emp.get();
			return employee;	
	}
	@Override
	public Employee updateEmployee(int id,String name) {
		Optional<Employee> emp=empRepo.findById(id);
		Employee employee=emp.get();
		employee.setLastName(name);
		return empRepo.save(employee);
	}
	@Override
	public String deleteEmployee(int id) {
		Optional<Employee> emp=empRepo.findById(id);
		Employee employee=emp.get(); 
		empRepo.delete(employee);
		return "Employee Deleted Succssfully... "+id;
	}
	@Override
	public List<Employee> getAllEmployee() {
		
		return empRepo.findAll();
	}
	/**
	@Override
	public Employee getEmployeeByName(String firstName) {
		Employee emp=empRepo.findByName(firstName);
		
		return emp;
	}
**/
}
