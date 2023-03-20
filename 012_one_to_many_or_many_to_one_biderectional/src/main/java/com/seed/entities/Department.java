package com.seed.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "dept")
public class Department {

	@Id
	@Column(name = "did", columnDefinition = "NUMBER(6)")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dept_seq_name")
	@SequenceGenerator(name = "dept_seq_name", sequenceName = "dept_seq", initialValue = 10, allocationSize = 10)
	private Integer id;

	@Column(name = "dept_name", columnDefinition = "varchar2 (20)")
	private String name;

	@OneToMany(mappedBy = "department")
	private List<Employee> employees = new ArrayList<>();

	public Department() {
	}

	public Department(String name) {
		this.name = name;
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

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}

}
