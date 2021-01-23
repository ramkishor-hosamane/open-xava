package com.yourcompany.test.model;


import static org.openxava.jpa.XPersistence.getManager;

import org.openxava.calculators.*;

public class UnitPriceCalculator implements ICalculator {
	
	private int productNumber;  

	public Object calculate() throws Exception {
		Product	product = getManager().find(Product.class, productNumber);  
		return product.getPrice();  	
	}

	public void setProductNumber(int productNumber) { 
		this.productNumber = productNumber;
	}

	public int getProductNumber() {
		return productNumber;
	}

}
