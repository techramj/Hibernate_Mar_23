package com.seed.main;

import java.util.Date;

import com.seed.entities.Employee;
import com.seed.service.EmployeeService;

public class Application {

	
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		
		//add two employee
		service.addEmployee(new Employee(1,"jack",1000, new Date()));
		service.addEmployee(new Employee(2,"john",2000, new Date()));
		service.addEmployee(new Employee(3,"johnson",12000, new Date()));
		
		printLine();
		
		//delete 
		service.deleteEmployee(1);
		service.deleteEmployee(10);
		
		printLine();
		
		//fetch
		//Employee emp1 = service.getEmployee(2);
		//System.out.println("emp1: "+emp1);
		
		
		//Employee emp2 = service.getEmployee(10);
		//System.out.println("emp2: "+emp2);
		printLine();
		
		
		
	}
	
	public static void printLine() {
		System.out.println("____________________________________________________");
	}

}
