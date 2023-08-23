import java.util.ArrayList;

public class Grade {
	private ArrayList<Integer> points;
	private ArrayList<Integer> grades;
	
	public Grade() {
		this.points = new ArrayList<>();
		this.grades = new ArrayList<>();
	}

	public ArrayList<Integer> getGrades() {
		return this.grades;
	}

	public void addGradesOnPoints(int point) {
		points.add(point);
		grades.add(pointsToGrades(point));
	}

	public double averages() {
		double result = 0;
		for (int i=0; i<points.size(); i++) {
			result += points.get(i);
		}
		return result / points.size();
	}

	public double averagesPassing() {
		double result = 0;
		int passing = 0;
		for (int point : points) {
			if (point >= 50) {
				result += point;
				passing += 1;
			}
		}
		return result / passing;
	}

	public double percentagePass() {
		double passing = 0;
		for (int point : points) {
			if (point >= 50) {
				passing += 1;
			}
		}
		return 100 * passing / points.size();
	}

	public int pointsToGrades(int point) {
		int grade = 0;
		if (point < 50) {
			grade = 0;
		} else if (point < 60) {
			grade = 1;
		} else if (point < 70) {
			grade = 2;
		} else if (point < 80) {
			grade = 3;
		} else if (point < 90) {
			grade = 4;
		} else if (point >= 90) {
			grade = 5;
		}

		return grade;
	}

	public int numberOfGrades(int grade) {
		int count = 0;
		for (int i=0; i<grades.size(); i++) {
			if (grades.get(i) == grade) {
				count += 1;
			}
		}

		return count;
	}




	
}
