import java.util.ArrayList;

public class Hold {
	private int maxWeight;
	private ArrayList<Suitcase> list;
	private int nowWeight;
	
	public Hold(int maxWeight) {
		this.list = new ArrayList<>();
		this.maxWeight = maxWeight;
		this.nowWeight = 0;
	}

	public void addSuitcase(Suitcase suitcase) {
		if (nowWeight + suitcase.totalWeight() > maxWeight) {
			return;
		}
		nowWeight += suitcase.totalWeight();
		list.add(suitcase);
	}

	public String toString() {
		return list.size() + " suitcases (" + nowWeight + " kg)";
	}

	public void printItems() {
		for (Suitcase suitcase : this.list) {
			suitcase.printItems(); 
		}
	}
	
}
