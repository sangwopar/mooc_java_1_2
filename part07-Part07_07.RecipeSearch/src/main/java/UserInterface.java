import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	private Scanner scanner;
	private Recipes recipes;

	public UserInterface(Scanner scanner, Recipes recipes) {
		this.scanner = scanner;
		this.recipes = recipes;
	}

	public void start() {
		readFile();
		System.out.println();
		printCommands();
		System.out.println();
		startCommand();
	}

	private void startCommand() {
		while (true) {
			System.out.print("Enter command: ");
			String command = scanner.nextLine();
			if (command.equals("stop")) {
				break;
			} else if (command.equals("list")) {
				System.out.println();
				System.out.println("Recipest:");
				for (Recipe recipe : recipes.getRecipesList()) {
					System.out.println(recipe.getName() 
						+ ", cooking time: " + recipe.getCookingTime());
				}
			} else if (command.equals("find name")) {
				System.out.print("Searched word: ");
				String search = scanner.nextLine();
				System.out.println();
				System.out.println("Recipes:");
				for (Recipe recipe : recipes.findRecipes(search)) {
					System.out.println(recipe.getName() 
						+ ", cooking time: " + recipe.getCookingTime());
				}
			} else if (command.equals("find cooking time")) {
				System.out.print("Max cooking time: ");
				int cookingTime = Integer.valueOf(scanner.nextLine());
				System.out.println();
				System.out.println("Recipes:");
				for (Recipe recipe : recipes.findRecipesToCookingTime(cookingTime)) {
					System.out.println(recipe.getName()
						+ ", cooking time: " + recipe.getCookingTime());
				}
			} else if (command.equals("find ingredient")) {
				System.out.print("Ingredient: ");
				String ingredient = scanner.nextLine();
				System.out.println("Recipes:");
				for (Recipe recipe : recipes.findRecipesToBased(ingredient)) {
					System.out.println(recipe.getName()
						+ ", cooking time: " + recipe.getCookingTime());
				}
			}

			System.out.println();
		}
		
	}

	public void printCommands() {
		System.out.println("Commands:");
		System.out.println("list - lists the recipes");
		System.out.println("stop - stops the program");
		System.out.println("find name - searches recipes by name");
	}

	public void readFile() {
		System.out.print("File to read: ");
		String fileName = scanner.nextLine();
		try {
			Scanner fileScanner = new Scanner(Paths.get(fileName));
			while (fileScanner.hasNextLine()) {
				ArrayList<String> basedList = new ArrayList<>();
				String name = fileScanner.nextLine();
				int cookingTime = Integer.valueOf(fileScanner.nextLine());
				String based = "1";
				while (!(based.isEmpty()) && fileScanner.hasNextLine()) {
					based = fileScanner.nextLine();
					basedList.add(based);
				}
				Recipe recipe = new Recipe(name, cookingTime, basedList);
				recipes.addRecipe(recipe);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
