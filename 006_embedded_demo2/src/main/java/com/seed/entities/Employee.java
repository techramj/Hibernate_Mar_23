package com.seed.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq_name")
	@SequenceGenerator(name = "emp_seq_name", sequenceName = "emp_seq")
	private Integer id;
	private String name;
	private double salary;

	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(name = "pinCode", column = @Column(name="mail_add_pin_code")),
			@AttributeOverride(name = "city", column = @Column(name="mail_add_city"))
	})
	private Address mailAddress;

	@Embedded
	private Address permanentAddress;

	public Employee() {
		// TODO Auto-generated constructor stub
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

	public Address getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(Address mailAddress) {
		this.mailAddress = mailAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

}
