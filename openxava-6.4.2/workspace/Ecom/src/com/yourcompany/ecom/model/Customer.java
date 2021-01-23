package com.yourcompany.ecom.model;
import javax.persistence.*;
import org.openxava.annotations.*;
 
@Entity  // This marks Customer class as an entity
public class Customer {

	@Id  // The number property is the key property. Keys are required by default
    private int number;

    public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Column(length=50)  // The column length is used at the UI level and the DB level
    @Required  // A validation error will be shown if the name property is left empty
    private String name;
 
    @ManyToOne( // The reference is persisted as a database relationship
           fetch=FetchType.LAZY, // The reference is loaded on demand
           optional=true) // The reference can have no value
        @DescriptionsList // Thus the reference is displayed using a combo
        private Product product; // A regular Java reference

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	


}
