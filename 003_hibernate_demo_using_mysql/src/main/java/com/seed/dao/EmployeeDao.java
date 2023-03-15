package com.seed.dao;

import com.seed.entities.Employee;

public interface EmployeeDao {
	Employee addEmployee(Employee emp);
	void delete(int id);
	void delete(Employee emp);
	void update(Employee emp);
	Employee getEmployee(int id);
}
