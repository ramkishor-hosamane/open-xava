package com.yourcompany.ecom.model;
import java.math.*;
import java.util.*;

import javax.persistence.*;
import org.openxava.annotations.*;
import org.openxava.calculators.*;
 
@Entity
public class Buy {
	
	@Id
	@Column(length=6) @Required
	private int number;
	
	@Required //@DefaultValueCalculator(CurrentDateCalculator.class) 
	private Date date;
	

	@ReferenceView("Simple") 
	@ManyToOne(optional=false, fetch=FetchType.LAZY)
	private Customer customer;

	@ElementCollection @OrderColumn
	@ListProperties("product.number,product.name,unitPrice, quantity, amount[buy.sum,buy.total]")
	private List<BillDetail> details;

	
	public BigDecimal getSum() {
		BigDecimal sum = BigDecimal.ZERO;
		for (BillDetail detail: details) {
			sum = sum.add(detail.getAmount());
		}
		return sum;
	}

	
	@Depends("sum")
	public BigDecimal getTotal() {
		return getSum();
	}
	




	public List<BillDetail> getDetails() {
		return details;
	}


	public void setDetails(List<BillDetail> details) {
		this.details = details;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}







}
