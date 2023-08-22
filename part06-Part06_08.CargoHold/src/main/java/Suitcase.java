import java.util.ArrayList;

public class Suitcase {
	private ArrayList<Item> list;
	private int maxWeight;


	public Suitcase(int maxWeight) {
		this.list = new ArrayList<>();
		this.maxWeight = maxWeight;
	}

	public void addItem(Item item) {
		if (totalWeight() + item.getWeight() > maxWeight) {
			return;
		}
		list.add(item);
	}

	public String toString() {
		String kg = "(" + totalWeight() + " kg)";
		if (list.isEmpty()) {
			return "no items " + kg;
		}
		if (list.size() == 1) {
			return "1 item " + kg;
		}
		return list.size() + " items " + kg;
	}

	public int totalWeight() {
		int weight = 0;
		
		for (Item item : list) {
			weight += item.getWeight();
		}
		return weight;
	}

	public void printItems() {
	
		for (Item item : list) {
			System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
		}
	}

	public Item heaviestItem() {
		if (list.isEmpty()) {
			return null;
		}
		
		Item result = list.get(0);
		for (Item item : list) {
			if (result.getWeight() < item.getWeight()) {
				result = item;
			}
		}
		return result;
	}
	
}
