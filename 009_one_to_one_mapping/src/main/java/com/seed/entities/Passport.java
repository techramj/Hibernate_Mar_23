package com.seed.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passport_seq_name")
	@SequenceGenerator(name = "passport_seq_name", sequenceName = "passport_seq", initialValue = 1000, allocationSize = 1)
	private Integer passportId;
	private String passportNumber;
	private Date expiryDate;

	public Passport() {

	}

	public Passport(String passportNumber, Date expiryDate) {
		this.passportNumber = passportNumber;
		this.expiryDate = expiryDate;
	}

	public Integer getPassportId() {
		return passportId;
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

}
