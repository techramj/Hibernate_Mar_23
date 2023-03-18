package com.seed.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "emp")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq_name")
	@SequenceGenerator(name = "emp_seq_name", sequenceName = "emp_seq", initialValue = 100, allocationSize = 1)
	private Integer id;
	private String name;
	private double salary;

	@UpdateTimestamp
	private LocalDateTime lastUpdated;

	@CreationTimestamp
	private LocalDateTime lastCreated;
	
	@Transient
	private boolean isPermanent;

	public Employee() {

	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public LocalDateTime getLastCreated() {
		return lastCreated;
	}

	public void setLastCreated(LocalDateTime lastCreated) {
		this.lastCreated = lastCreated;
	}

	public boolean isPermanent() {
		return isPermanent;
	}

	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	
}
