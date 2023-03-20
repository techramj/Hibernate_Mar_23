package com.seed;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entities.Department;
import com.seed.entities.Employee;
import com.seed.entities.Passport;
import com.seed.util.HibernateUtil;

public class Application {

	public static void addEmployees(List<Employee> empList) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try (Session session = factory.openSession()) {
			Transaction tx = session.beginTransaction();
			for (Employee emp : empList) {
				session.persist(emp);
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void addEmp() {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try (Session session = factory.openSession()) {
			Transaction tx = session.beginTransaction();
			Employee emp = getEmployee();
			session.persist(emp);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getEmployee(int id) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try (Session session = factory.openSession()) {
			Transaction tx = session.beginTransaction();
			Employee e = session.get(Employee.class, id);
			System.out.println(e.getName() + "  " + e.getSalary());
			//Department dept = e.getDepartment();
			//System.out.println(dept.getName());
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		addEmp();
		pause(2);
		getEmployee(100);
	}

	public static List<Employee> getEmployees() {
		List<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee("Ashish", 8000);
		Department dept1 = new Department("IT");
		e1.setDepartment(dept1);

		Employee e2 = new Employee("Ajay", 7000);
		Department dept2 = new Department("HR");
		e2.setDepartment(dept2);

		Employee e3 = new Employee("Komal", 7500);
		e3.setDepartment(dept2);

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

		return empList;
	}

	public static Passport addPassport(String passportNo) {
		Passport passport = new Passport(passportNo, new Date());
		SessionFactory factory = HibernateUtil.getSessionFactory();
		try (Session session = factory.openSession()) {
			Transaction tx = session.beginTransaction();
			Object ob = session.save(passport);
			System.out.println(ob);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return passport;
	}

	public static Employee getEmployee() {
		Employee e1 = new Employee("Ashish", 8000);
		Department dept1 = new Department("IT");
		e1.setDepartment(dept1);
		return e1;
	}

	public static void pause(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
