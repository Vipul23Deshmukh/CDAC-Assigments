package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("nonperishable")
public class NonPerishable extends Product {
	
	private int garantee;

	public NonPerishable() {
		super();
		
	}



	@Override
	public String toString() {
		return "NonPerishable [garantee=" + garantee + "]";
	}

	public int getGarantee() {
		return garantee;
	}

	public void setGarantee(int garantee) {
		this.garantee = garantee;
	}
	
	public NonPerishable(int pid, String pname, int qty, double price, LocalDate mfgdate,int garantee) {
		super(pid, pname, qty, price, mfgdate);
		this.garantee=garantee;
		
	}

}
