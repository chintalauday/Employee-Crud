package com.example.employeecrud.employeecrud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeecrud.employeecrud.entity.Employee;
import com.example.employeecrud.employeecrud.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeRestControl {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/greet")
public String greetingMessage() {
		return "Hello...!";
	}
	
	
	@PostMapping("/save")
 public Employee saveEmployee(@RequestBody Employee theemp) {	
	Employee emp=	empService.saveEmployee(theemp);
     	return emp;
	}
	
	@GetMapping("/retrive/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {
		return empService.getEmployeeByid(empId);
    }
	
	@PutMapping("/update/{empid}/{name}")
	public Employee updateEmployee(@PathVariable int empid,@PathVariable String name) {
		return empService.updateEmployee(empid, name);
	}
	
	@DeleteMapping("/delete/{empid}")
	public String deleteEmployee(@PathVariable int empid) {
		return	empService.deleteEmployee(empid);
	}
	
	@GetMapping("/retriveall")
	public List<Employee> getAll(){
		return empService.getAllEmployee();
	}
	
	/**
	@GetMapping("/retrivename/{firstName}")
	public Employee getByName(@PathVariable String firstName) {
		
		return empService.getEmployeeByName(firstName);
	}
	**/

}
