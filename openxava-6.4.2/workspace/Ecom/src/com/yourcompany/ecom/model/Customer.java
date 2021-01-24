package com.yourcompany.ecom.model;
import java.util.*;

import javax.persistence.*;
import org.openxava.annotations.*;
 
@Entity  // This marks Customer class as an entity
@View(name="Simple", members="number, name") 
@Tab(properties="number, name") 
public class Customer {

	@Id //@Hidden
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int number;

	@Column(length=20)  // The column length is used at the UI level and the DB level
    @Required  // A validation error will be shown if the name property is left empty
    private String name;

	@Column(length=20)  // The column length is used at the UI level and the DB level
    @Required  // A validation error will be shown if the name property is left empty
    //@Stereotype("EMAIL")
    private String email;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	/*
    @ManyToOne( // The reference is persisted as a database relationship
           fetch=FetchType.LAZY, // The reference is loaded on demand
           optional=true) // The reference can have no value
        @DescriptionsList // Thus the reference is displayed using a combo
        private Product product; // A regular Java reference
	 */



	


}
