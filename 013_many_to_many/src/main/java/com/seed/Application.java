package com.seed;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entities.Employee;
import com.seed.entities.Project;
import com.seed.util.HibernateUtil;

public class Application {
	
	public static void addEmployees(List<Employee> empList) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try(Session session = factory.openSession()){
			Transaction tx = session.beginTransaction();
			for(Employee emp:empList) {
				session.persist(emp);
			}
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void addEmp() {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try (Session session = factory.openSession()) {
			Transaction tx = session.beginTransaction();
			session.persist(getEmp());
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		/*
		 * List<Employee> list = getEmployees(); addEmployees(list);
		 */
		
		addEmp();
	}
	
	
	public static Employee getEmp() {
		Project p1 = new Project("EMS");
		Project p2 = new Project("AI");
		
		Employee e1  = new Employee("Ashish", 8000);
		e1.addProject(p1);
		e1.addProject(p2);
		
		p1.addEmployee(e1);
		p2.addEmployee(e1);
		
		return e1;
	}
	
	public static List<Employee> getEmployees(){
		List<Employee> empList = new ArrayList<Employee>();
		/*Project p1 = new Project("EMS");
		Project p2 = new Project("AI");
		Project p3 = new Project("Health Care");
		
		Employee e1  = new Employee("Ashish", 8000);
		e1.addProject(p1);
		e1.addProject(p2);
		
		p1.addEmployee(e1);
		p2.addEmployee(e1);
		
		
		Employee e2  = new Employee("Ajay", 7000);
		e2.addProject(p2);
		e2.addProject(p3);
		
		p2.addEmployee(e2);
		p3.addEmployee(e2);
		
		Employee e3  = new Employee("Komal", 7500);
		e3.addProject(p1);
		e3.addProject(p2);
		e3.addProject(p3);
		
		p1.addEmployee(e3);
		p2.addEmployee(e3);
		p3.addEmployee(e3);
		
		

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

		*/
		return empList;
	}
		
	public static Employee getEmployee() {
		Employee emp = new Employee();
		emp.setName("Jack");
		emp.setSalary(5000);
		return emp;
	}
}
