public class Container {
	private int liquid;
	private int maxLiquid;

	public Container() {
		this.liquid = 0;
		this.maxLiquid = 100;
	}

	public int contains() {
		return liquid;
	}

	public void add(int amount) {
		if (amount < 0) {
			return;
		}
		liquid += amount;
		if (liquid > maxLiquid) {
			liquid = maxLiquid;
		}
	}

	public void remove(int amount) {
		if (amount < 0) { 
			return;
		}
		liquid -= amount;
		if (liquid < 0) {
			liquid = 0;
		}
	}

	public String toString() {
		return liquid + "/100";
	}
	
}
