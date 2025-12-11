package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="nonperishablej")
public class NonPerishable extends Product {
	
	private int garantee;

	public NonPerishable() {
		super();
		
	}

	public NonPerishable(int pid, String pname, int qty, double price, LocalDate mfgdate,int garantee) {
		super(pid, pname, qty, price, mfgdate);
		this.garantee=garantee;
	}


	

	public int getGarantee() {
		return garantee;
	}

	public void setGarantee(int garantee) {
		this.garantee = garantee;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "NonPerishable [garantee=" + garantee + "]";
	}

}
