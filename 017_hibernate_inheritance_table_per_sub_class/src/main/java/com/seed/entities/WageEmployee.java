package com.seed.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="emp_id")
public class WageEmployee extends Employee {

	private int rate;
	private int hour;

	public WageEmployee() {}

	public WageEmployee(String name, double salary, int rate, int hour) {
		super(name, salary);
		this.rate = rate;
		this.hour = hour;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	

}
