package com.seed.main;

import java.util.Date;

import org.hibernate.SessionFactory;

import com.seed.entities.Employee;
import com.seed.entities.Student;
import com.seed.service.EmployeeService;
import com.seed.service.StudentService;
import com.seed.util.HibernateUtil;

public class Application {

	
	public static void main(String[] args) {
		
		day2Demo();
	}
	public static void day2Demo() {
		
	}
	
	public static void day1Demo() {
		EmployeeService empService = new EmployeeService();
		StudentService studService = new StudentService();
		
		
		Employee emp = new Employee(1000, "jack", 1000, new Date());
		Employee emp1 = new Employee();
		emp1.setName("jackson");
		emp1.setSalary(2000);
		
		Student stud1 = new Student("Rakesh");
		Student stud2= new Student("Payel");
		
		empService.addEmployee(emp);
		studService.addStudent(stud1);
		empService.addEmployee(emp1);
		studService.addStudent(stud2);
	}
	
	public static void printLine() {
		System.out.println("____________________________________________________");
	}

}
