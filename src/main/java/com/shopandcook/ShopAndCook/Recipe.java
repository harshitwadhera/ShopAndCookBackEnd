package com.shopandcook.ShopAndCook;

import java.util.List;

public class Recipe {
	
	private int id;
	private String name;
	private String description;
	private String imagePath;
	private List<Ingredient> ingredient;
	
	
	
	public Recipe() {
		
	}
	public Recipe(int id, String name, String description, String imagePath, List<Ingredient> ingredient) {
		//super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imagePath = imagePath;
		this.ingredient = ingredient;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "Recipe [id=" + id + ", name=" + name + ", description=" + description + ", imagePath=" + imagePath
				+ ", ingredient="
				+ (ingredient != null ? ingredient.subList(0, Math.min(ingredient.size(), maxLen)) : null) + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public List<Ingredient> getIngredient() {
		return ingredient;
	}
	public void setIngredient(List<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}
	
	
	


}
