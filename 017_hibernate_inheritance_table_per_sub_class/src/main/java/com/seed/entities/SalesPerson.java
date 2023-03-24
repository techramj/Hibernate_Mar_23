package com.seed.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class SalesPerson extends Employee {

	private double salesMade;
	private double commission;

	public SalesPerson() {
		// TODO Auto-generated constructor stub
	}

	public SalesPerson(String name, double salary, double salesMade, double commission) {
		super(name, salary);
		this.salesMade = salesMade;
		this.commission = commission;
	}

	public double getSalesMade() {
		return salesMade;
	}

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

}
