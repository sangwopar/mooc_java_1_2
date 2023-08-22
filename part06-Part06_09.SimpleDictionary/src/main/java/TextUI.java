import java.util.Scanner;

public class TextUI {
	private Scanner scanner;
	private SimpleDictionary simpleDictionary;

	public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
		this.scanner = scanner;
		this.simpleDictionary = simpleDictionary;
	}

	public void start() {
		while (true) {
			System.out.print("Command: ");
			String input = scanner.nextLine();
			if (input.equals("end")) {
				System.out.println("Bye bye!");
				break;
			}
			if (input.equals("add")) {
				System.out.print("Word: ");
				String word = scanner.nextLine();
				System.out.print("Translation: ");
				String translation = scanner.nextLine();
				simpleDictionary.add(word, translation);
				continue;
			}
			if (input.equals("search")) {
				System.out.print("To be translated: ");
				String word = scanner.nextLine();
				String result = simpleDictionary.translate(word);
				if (result == null) {
					System.out.println("Word " + word + " was not found");
					continue;
				} else {
					System.out.println(result);
					continue;
				}
			}
			System.out.println("Unknown command");
		}
	}

	
}
