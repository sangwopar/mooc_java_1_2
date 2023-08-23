import java.util.Scanner;

public class UserInterface {
	private Scanner scanner;
	private Birds birds;

	public UserInterface(Scanner scanner, Birds birds) {
		this.scanner = scanner;
		this.birds = birds;
	}

	public void start() {
		startCommand();
	}

	private void startCommand() {
		while (true) {
			System.out.print("? ");
			String command = scanner.nextLine();
			if (command.equals("Quit")) {
				break;
			}
			else if (command.equals("Add")) {
				System.out.print("Name: ");
				String name = scanner.nextLine();
				System.out.print("Name in Latin: ");
				String latinName = scanner.nextLine();
				Bird bird = new Bird(name, latinName);
				birds.add(bird);
			} else if (command.equals("Observation")) {
				System.out.print("Bird? ");
				String name = scanner.nextLine();
				if (birds.containName(name)) {
					birds.addObservation(name);
				} else {
					System.out.println("Not a bird!");
				}
			} else if (command.equals("All")) {
				birds.printAll();
			} else if (command.equals("One")) {
				String name = scanner.nextLine();
				birds.printOne(name);
			}
		}
	}
}
