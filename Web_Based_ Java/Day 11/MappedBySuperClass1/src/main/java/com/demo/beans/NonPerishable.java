package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="nonperishable1")
public class NonPerishable  extends Product{
	
	private int garantee;

	public NonPerishable() {
		super();
		// TODO Auto-generated constructor stub
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
		return super.toString()+"NonPerishable [garantee=" + garantee + "]";
	}

	
}
