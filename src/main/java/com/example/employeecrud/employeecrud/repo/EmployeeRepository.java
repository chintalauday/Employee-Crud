package com.example.employeecrud.employeecrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeecrud.employeecrud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee ,Integer>{

	//public Employee findByName(String firstName);
}
