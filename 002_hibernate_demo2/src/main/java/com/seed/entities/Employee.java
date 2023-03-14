package com.seed.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {

	@Id
	private int id;
	private String name;
	private double salary;
	
	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
