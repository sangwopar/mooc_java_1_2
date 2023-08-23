public class Bird {
	private String name;
	private String latinName;
	private int observations;


	public Bird(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
		this.observations = 0;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLatinName() {
		return this.latinName;
	}

	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}

	public int getObservations() {
		return this.observations;
	}

	public void setObservations(int observations) {
		this.observations = observations;
	}



	@Override
	public String toString() {
		return getName() + " (" + getLatinName() + "): "
			+ getObservations() + " observations";
	}
	
}
