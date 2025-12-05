package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="perishable1")
public class Perishable extends Product {
	
	 private LocalDate expdate;

	public Perishable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perishable(int pid, String pname, int qty, double price, LocalDate mfgdate,LocalDate expdate) {
		super(pid, pname, qty, price, mfgdate);
		this.expdate=expdate;
	}

	public LocalDate getExpdate() {
		return expdate;
	}

	public void setExpdate(LocalDate expdate) {
		this.expdate = expdate;
	}

	@Override
	public String toString() {
		return super.toString()+"Perishable [expdate=" + expdate + "]";
	}
	 
	
	 

}
