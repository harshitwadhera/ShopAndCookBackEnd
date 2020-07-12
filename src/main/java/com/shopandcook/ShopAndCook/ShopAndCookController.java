package com.shopandcook.ShopAndCook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ShopAndCookController {
	
	@Autowired
	private ShopAndCookService projectService;
	
	@RequestMapping(method=RequestMethod.POST,value="/addRecipe")
	public void saveRecipe(@RequestBody Recipe recipe) {
		projectService.addRecipe(recipe);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/getAllRecipe")
	public List getRecipe() {
		return projectService.getAllRecipe();
	}

	@RequestMapping("/getAllRecipeById")
	public Recipe getRecipeById(@RequestParam String id) {
		System.out.println("id===="+id);
		return projectService.getRecipeById(id);
	}
	
	
	//@RequestMapping(method=RequestMethod.POST,value="/insertRecipe")
	//@PostMapping(path = "/insertRecipe", consumes = "application/json")
	@RequestMapping(method=RequestMethod.POST,value="/insertRecipe",consumes="application/json")
	public List<Recipe> insertRecipe(@RequestBody Recipe recipe) {
		try {
			System.out.println("recipe====>>>>"+recipe);
			return projectService.insertRecipe(recipe);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
		
	}
	/*@RequestMapping(method=RequestMethod.POST,value="/insertRecipe")
	public List<Recipe> insertRecipe(@RequestParam String recipe) {
		try {
			System.out.println("recipe===="+new ObjectMapper().readValue(recipe, Recipe.class));
			 return projectService.insertRecipe(new ObjectMapper().readValue(recipe, Recipe.class));
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}*/

}
