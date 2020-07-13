package com.shopandcook.ShopAndCook;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ShopAndCookService {
	
	private List<Recipe> recipeList = new ArrayList<>(Arrays.asList(new Recipe(1,"Pizza Backend","Tamoto Pizza","https://static.toiimg.com/photo/53110049.cms",Arrays.asList(new Ingredient("Onion","1"),new Ingredient("Piza Base","1"))),
			new Recipe(2,"Burger Backend","Chesse Burger","https://www.indianhealthyrecipes.com/wp-content/uploads/2016/02/veg-burger-recipe-1-500x500.jpg",Arrays.asList(new Ingredient("tomto","1")))));

	public void addRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		recipeList.add(recipe);
		System.out.println(recipeList);
		
	}

	public List<Recipe> getAllRecipe() {
		
		return recipeList;
		// TODO Auto-generated method stub
		
	}

	public Recipe getRecipeById(String id) {
		// TODO Auto-generated method stub
		return recipeList.stream().filter(recipe -> Integer.parseInt(id) == recipe.getId()).findAny().orElse(new Recipe());
	}

	public List<Recipe> insertRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		int id = 	recipe.getId();
		//recipe.setId(id);
		if( recipe.getId() != 0) {
			recipe.setId(id);
			System.out.println("id===??"+id);
			recipeList.set(id-1,recipe);
			return recipeList;
		}else {
			recipe.setId(recipeList.size()+1);
		recipeList.add(recipe);
		return recipeList;
		}
	}

	public List<Recipe> deleteRecipe(String recipeId) {
		// TODO Auto-generated method stub
		try {
			recipeList.remove(Integer.parseInt(recipeId)-1);
			
			//recipeList.stream().filter(recipe -> Integer.parseInt(recipeId) == recipe.getId()).findFirst();
		}catch(Exception ex){
			System.out.println(ex);
		}
		return recipeList;
	}

}
