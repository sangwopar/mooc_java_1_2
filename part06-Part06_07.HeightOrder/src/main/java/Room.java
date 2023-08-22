import java.util.ArrayList;

public class Room {
	private ArrayList<Person> list;

	public Room() {
		this.list = new ArrayList<>();
	}

	public void add(Person person) {
		list.add(person);
	}

	public boolean isEmpty() {
		if(list.isEmpty()) {
			return true;
		}
		return false;
	}

	public ArrayList<Person> getPersons() {
		return list;
	}

	public Person shortest() {
		if (this.list.isEmpty()) {
			return null;
		}
		
		Person result = list.get(0);
		for (Person person : list) {
			if (result.getHeight() > person.getHeight()) {
				result = person;
			}
		}

		return result;
	}

	public Person take() {
		Person result = shortest();
		list.remove(result);
		return result;
	}
}
