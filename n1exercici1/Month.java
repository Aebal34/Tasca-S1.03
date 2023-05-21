package n1exercici1;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		return Objects.equals(name, other.name);
	}
}
