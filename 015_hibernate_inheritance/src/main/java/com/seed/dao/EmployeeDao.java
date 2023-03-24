package com.seed.dao;

import java.util.List;

import com.seed.entities.Employee;

public interface EmployeeDao {
	Employee addEmployee(Employee emp);
	void delete(int id);
	void delete(Employee emp);
	void update(Employee emp);
	Employee getEmployee(int id);
	List<Employee> getEmployees();
	List<Employee> getEmps();
	List<Employee> salaryGreaterThan(double salary);
}
