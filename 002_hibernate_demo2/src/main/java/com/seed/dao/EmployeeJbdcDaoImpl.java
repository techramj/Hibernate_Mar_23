package com.seed.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.seed.entities.Employee;

public class EmployeeJbdcDaoImpl implements EmployeeDao {
	
	private Connection connection;

	@Override
	public Employee addEmployee(Employee emp) {
		String sql ="insert into emp values (?,?,?)";
		try(PreparedStatement ps = connection.prepareStatement(sql)){
			
		}catch(SQLException exp) {
			
		}
		return emp;
	}

	@Override
	public void delete(int id) {

		
	}

	@Override
	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
