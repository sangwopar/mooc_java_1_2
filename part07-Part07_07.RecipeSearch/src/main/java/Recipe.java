import java.util.ArrayList;

public class Recipe {
	private String name;
	private int cookingTime;
	private ArrayList<String> recipesBased;

	public Recipe(String name, int cookingTime, ArrayList<String> recipesBased) {
		this.name = name;
		this.cookingTime = cookingTime;
		this.recipesBased = new ArrayList<>(recipesBased);
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCookingTime() {
		return this.cookingTime;
	}

	public void setCookingTime(int cookingTime) {
		this.cookingTime = cookingTime;
	}

	public ArrayList<String> getRecipesBased() {
		return this.recipesBased;
	}

	public void setRecipesBased(ArrayList<String> recipesBased) {
		this.recipesBased = recipesBased;
	}
	
	
}
