import java.util.ArrayList;

public class Birds {
	private ArrayList<Bird> birdList;

	public Birds() {
		this.birdList = new ArrayList<>();
	}

	public void add(Bird bird) {
		this.birdList.add(bird);
	}

	public void addObservation(String name) {
		for(Bird bird : birdList) {
			if (bird.getName().equals(name)) {
				bird.setObservations(bird.getObservations() + 1);
			}
		}
	}

	public boolean containName(String name) {
		for(Bird bird : birdList) {
			if (bird.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public void printAll() {
		for (Bird bird : birdList) {
			System.out.println(bird);
		}
 	}

	public void printOne(String name) {
		for (Bird bird : birdList) {
			if (bird.getName().equals(name)) {
				System.out.println(bird);
			}
		}
	}
	
}
