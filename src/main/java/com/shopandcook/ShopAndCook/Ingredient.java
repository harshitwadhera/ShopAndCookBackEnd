package com.shopandcook.ShopAndCook;

public class Ingredient {
	
	private String name;
	private String amount;
	
	
	@Override
	public String toString() {
		return "Ingredient [name=" + name + ", amount=" + amount + "]";
	}
	public Ingredient() {
		
	}
	public Ingredient(String name, String amount) {
		//super();
		this.name = name;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

}
