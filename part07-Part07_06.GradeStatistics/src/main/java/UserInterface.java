import java.util.Scanner;

public class UserInterface {
	private Grade grade;
	private Scanner scanner;

	public UserInterface(Grade grade, Scanner scanner) {
		this.grade = grade;
		this.scanner = scanner;
	}

	public void start() {
		readPoints();
		System.out.println();
		printGrades();
	}

	public void readPoints() {
		System.out.println("Enter point totals, -1 tops:");
		while (true) {
			int input = Integer.valueOf(scanner.nextLine());
			if (input == -1) {
				break;
			}
			if (!(input >= 0 && input <= 100)) {
				continue;
			}
			grade.addGradesOnPoints(input);
		}
	}

	public void printGrades() {
		System.out.println("Point average (all): " + grade.averages());
		System.out.println("Point average (passing): " + grade.averagesPassing());
		System.out.println("Pass percentage: " + grade.percentagePass());
		System.out.println("Grade distribution:");
		for (int i=5; i>=0 ; i--) {
			int count = grade.numberOfGrades(i);
			System.out.print(i + ":");
			printStarts(count);
			System.out.println();
		}
	}

	public void printStarts(int count) {
		for (int i=0; i<count; i++) {
			System.out.print("*");
		}
	}
	

	
}
