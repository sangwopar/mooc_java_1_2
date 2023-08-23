import java.util.ArrayList;

public class Recipes {
	private ArrayList<Recipe> recipesList;

	public Recipes() {
		this.recipesList = new ArrayList<>();
	}

	public void addRecipe(Recipe recipe) {
		this.recipesList.add(recipe);
	}

	public ArrayList<Recipe> getRecipesList() {
		return this.recipesList;
	}

	public ArrayList<Recipe> findRecipes(String name) {
		ArrayList<Recipe> findRecipe = new ArrayList<>();
		for (Recipe recipe : recipesList) {
			if (recipe.getName().contains(name)) {
				findRecipe.add(recipe);
			}
		}
		return findRecipe;
	}

	public ArrayList<Recipe> findRecipesToCookingTime(int cookingTime) {
		ArrayList<Recipe> findRecipe = new ArrayList<>();
		for (Recipe recipe : recipesList) {
			if (recipe.getCookingTime() <= cookingTime) {
				findRecipe.add(recipe);
			}
		}
		return findRecipe;
	}

	public ArrayList<Recipe> findRecipesToBased(String based) {
		ArrayList<Recipe> findRecipe = new ArrayList<>();
		for (Recipe recipe : recipesList) {
			for (String base : recipe.getRecipesBased()) {
				if (base.equals(based)) {
					findRecipe.add(recipe);
				}
			}
		}
		return findRecipe;
	}
	
	
}
