package n3exercici1;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

	//ATTRIBUTES
	private String attribute;
	
	//CONSTRUCTOR
	
	public PersonComparator(String attribute) {
		this.attribute = attribute;
	}

	@Override
	public int compare(Person o1, Person o2) {
		int result = 0;
		if(attribute.equals("name")) {
			result = o1.getName().compareTo(o2.getName());
		}else if(attribute.equals("surname")) {
			result = o1.getSurname().compareTo(o2.getSurname());
		}else {
			result = o1.getDNI().compareTo(o2.getDNI());
		}
		return result;
	}
}
