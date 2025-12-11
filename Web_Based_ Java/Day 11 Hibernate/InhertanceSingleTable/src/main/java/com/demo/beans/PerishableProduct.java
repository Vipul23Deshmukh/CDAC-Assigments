package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("Perishable")
public class PerishableProduct extends Product {
	
	private LocalDate expdate;

	public PerishableProduct()  {
		super();
		
	}
	

	public PerishableProduct(int pid,String pname,int qty,double price,LocalDate mfgdate,LocalDate expdate)
	{
		super(pid,pname,qty,price,mfgdate);
	}
	public LocalDate getExpdate() {
		return expdate;
	}

	public void setExpdate(LocalDate expdate) {
		this.expdate = expdate;
	}

	@Override
	public String toString() {
		return "PerishableProduct [expdate=" + expdate + "]";
	}
	
	

}
