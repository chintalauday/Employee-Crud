package com.example.employeecrud.employeecrud.service;

import java.util.List;

import com.example.employeecrud.employeecrud.entity.Employee;

public interface EmployeeService {
	
	//For Saving Employee
	public Employee saveEmployee(Employee employee);
	//For Retrieve Single Employee
	public Employee getEmployeeByid(int empId);
	//For Update Employee
	public Employee updateEmployee(int id,String name);
	//For Delete Employee
	public String deleteEmployee(int id);
	//For Fetch All Employees
	public List<Employee> getAllEmployee();
	
	//For Retrieve Single Employee using Query Method.
	//public Employee getEmployeeByName(String firstName);

}
