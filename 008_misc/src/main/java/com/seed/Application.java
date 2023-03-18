package com.seed;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entities.Employee;
import com.seed.util.HibernateUtil;

public class Application {
	
	public static void addEmployees(List<Employee> empList) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try(Session session = factory.openSession()){
			Transaction tx = session.beginTransaction();
			for(Employee emp:empList) {
				session.save(emp);
			}
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		List<Employee> list = getEmployees();
		addEmployees(list);
	}
	
	public static List<Employee> getEmployees(){
		List<Employee> empList = new ArrayList<Employee>();
		Employee e1  = new Employee("Ashish", 8000);
		e1.setPermanent(true);
		
		Employee e2  = new Employee("Ajay", 7000);
		e2.setPermanent(false);
		
		Employee e3  = new Employee("Komal", 7500);
		e3.setPermanent(true);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

		
		return empList;
	}
	
	public static Employee getEmployee() {
		Employee emp = new Employee();
		emp.setName("Jack");
		emp.setSalary(5000);
		return emp;
	}
}
