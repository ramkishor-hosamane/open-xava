package com.yourcompany.ecom.model;

import javax.persistence.*;
import org.openxava.annotations.*;
 
@Entity  // This marks Customer class as an entity
public class Product {
	@Id  // The number property is the key property. Keys are required by default
    @Column(length=6)  // The column length is used at the UI level and the DB level
    private int SLNO;

	@Column(length=50)  // The column length is used at the UI level and the DB level
    @Required  // A validation error will be shown if the name property is left empty
    private String name;

	
    @Column(length=10)  // The column length is used at the UI level and the DB level
    private int price;
    
    @Column(length=10)  // The column length is used at the UI level and the DB level
    private int stock;



	public int getSLNO() {
		return SLNO;
	}

	public void setSLNO(int sLNO) {
		SLNO = sLNO;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	


}
