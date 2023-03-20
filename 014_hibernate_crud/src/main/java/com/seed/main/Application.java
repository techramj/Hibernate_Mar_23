package com.seed.main;

import java.util.List;

import com.seed.entities.Employee;
import com.seed.service.EmployeeService;

public class Application {

	private static EmployeeService service = new EmployeeService();
	
	public static void main(String[] args) {
		List<Employee> empList= service.salaryGreaterThan(10000);
		empList.forEach(System.out::println);
	}
	
	public static void addEmployees() {

		service.addEmployee(new Employee("jack", 1000));
		service.addEmployee(new Employee("John", 4000));
		service.addEmployee(new Employee("sam", 5000));
		service.addEmployee(new Employee("jessica", 8000));
	}


}
