
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Recipes recipes = new Recipes();
        UserInterface userInterface = new UserInterface(scanner, recipes);
        userInterface.start();
    }

}
