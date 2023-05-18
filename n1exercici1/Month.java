package n1exercici1;

public class Month {

	//ATTRIBUTES
	private String name;
	
	//CONSTRUCTOR
	public Month(String name) {
		this.name = name;
	}

	//GETTER
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Month [name=" + name + "]";
	}
	
	
}
