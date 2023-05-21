package n3exercici1;

public class Person{

	//ATTRIBUTES
	private String name;
	private String surname;
	private String DNI;
	
	//CONSTRUCTOR
	public Person(String name, String surname, String DNI) {
		this.name = name;
		this.surname=surname;
		this.DNI=DNI;
	}
	
	//GETTERS
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getDNI() {
		return DNI;
	}
	
	//SETTERS
	public void setName(String name) {
		this.name=name;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public void setDNI(String DNI) {
		this.DNI=DNI;
	}

	@Override
	public String toString() {
		return name + "  " + surname + "  " + DNI;
	}
}
