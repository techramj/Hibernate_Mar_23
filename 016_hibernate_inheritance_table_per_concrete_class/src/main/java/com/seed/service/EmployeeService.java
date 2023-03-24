package com.seed.service;

import java.util.List;

import com.seed.dao.EmployeeDao;
import com.seed.dao.EmployeeDaoImpl;
import com.seed.entities.Employee;

public class EmployeeService {
	
	EmployeeDao dao = new EmployeeDaoImpl();
	
	public void addEmployee(Employee emp) {
		dao.addEmployee(emp);
	}
	
	public void deleteEmployee(int id) {
		dao.delete(id);
	}
	
	public boolean isEmployeeRich(int id) {
		Employee employee = dao.getEmployee(id);
		//some business logic
		
		return true;
		
	}
	
	public Employee getEmployee(int id) {
		return dao.getEmployee(id);
	}
	
	public List<Employee> getAllEmployees(){
		return dao.getEmployees();
	}
	
	public List<Employee> getEmps(){
		return dao.getEmps();
	}
	
	public List<Employee> salaryGreaterThan(double salary){
		return dao.salaryGreaterThan(salary);
	}

}
