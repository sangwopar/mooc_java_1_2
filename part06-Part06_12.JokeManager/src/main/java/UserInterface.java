import java.util.Scanner;

public class UserInterface {
	private Scanner scanner;
	private JokeManager jokeManager;

	public UserInterface(JokeManager jokeManager, Scanner scanner) {
		this.scanner = scanner;
		this.jokeManager = jokeManager;
	}

	public void start() {
		while (true) {
			System.out.println("Commands:");
			System.out.println("draw a joke");
			System.out.println("list jokes");
			System.out.println("X - stop");
			String input = scanner.nextLine();
			if (input.equals("X")) {
				break;
			} else {
				if (input.equals("1")) {
					System.out.println("Write the joke to be added:");
					String joke = scanner.nextLine();
					jokeManager.addJoke(joke);
					continue;
				} else if (input.equals("2")) {
					System.out.println(jokeManager.drawJoke());
				} else if (input.equals("3")) {
					jokeManager.printJokes();
				}
			}

		}
	}
	
}
