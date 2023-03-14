package com.seed.dao;

import org.hibernate.IdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seed.entities.Employee;
import com.seed.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@Override
	public Employee addEmployee(Employee emp) {
		Transaction transaction = null;
		try (Session session = sessionFactory.openSession()) {
			transaction = session.beginTransaction();
			session.save(emp);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			System.err.println(e.getMessage());
		}
		return emp;
	}

	public Employee addEmployeeTemp(Employee emp) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(emp);
		transaction.commit();
		session.close();
		return emp;
	}

	@Override
	public void delete(int id) {

		/*
		 * Employee emp = new Employee(); 
		 * emp.setId(1); 
		 * delete(emp);
		 */
		Transaction transaction = null;
		try (Session session = sessionFactory.openSession()) {
			transaction = session.beginTransaction();
			Employee emp = session.get(Employee.class, id);
			if(emp == null) {
				throw new NoSuchEmployeeException("No Employee with Id: "+id);
			}
			session.delete(emp);
			transaction.commit();
		} catch (Exception e) {
			//transaction.rollback();
			System.err.println(e.getMessage());
		}

	}

	@Override
	public void delete(Employee emp) {
		Transaction transaction = null;
		try (Session session = sessionFactory.openSession()) {
			transaction = session.beginTransaction();
			session.delete(emp);
			transaction.commit();
			System.out.println("employee deleted");
		} catch (Exception e) {
			transaction.rollback();
			System.err.println(e.getMessage());
		}

	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployee(int id) {
		// return getEmployeeByGetAPI(id);
		// return getEmployeebyLoadApi(id);
		return getEmployeeByIdAPi(id);
	}

	public Employee getEmployeeByGetAPI(int id) {
		Transaction transaction = null;
		Employee emp = null;
		try (Session session = sessionFactory.openSession()) {
			transaction = session.beginTransaction();
			emp = session.get(Employee.class, id);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		return emp;
	}

	public Employee getEmployeebyLoadApi(int id) {
		Transaction transaction = null;
		Employee emp = null;
		try (Session session = sessionFactory.openSession()) {
			transaction = session.beginTransaction();
			emp = session.load(Employee.class, id);
			System.out.println(emp.getName() + "   " + emp.getName());
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		return emp;
	}

	public Employee getEmployeeByIdAPi(int id) {
		Transaction transaction = null;
		Employee emp = null;
		try (Session session = sessionFactory.openSession()) {
			transaction = session.beginTransaction();
			IdentifierLoadAccess<Employee> ob = session.byId(Employee.class);
			emp = ob.getReference(id);
			System.out.println(emp.getName() + "   " + emp.getName());
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		return emp;
	}

}
