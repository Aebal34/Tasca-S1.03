package n3exercici1;

import java.io.*;
import java.util.*;

public class MenuManager {

	//ATTRIBUTES
	private List<Person> persons;
	private String path;
	
	//CONSTRUCTOR
	
	public MenuManager() {
		persons = new ArrayList<Person>();
		path = System.getProperty("user.dir")+"\\src\\n3exercici1\\table.csv";
	}
	
	//DATA CONTROL
	
	public void insertPerson() {
		Person p1 = new Person(Input.readString("Escriba el nombre de la persona a introducir:"),
								Input.readString("Escriba el apellido de la persona a introducir:"),
								 Input.readString("Escriba el DNI de la persona a introducir:"));
		
		writeFileCSV(p1);
	}
	
	public void sortNameDescending() {
		Collections.sort(persons, Comparator.comparing(Person::getName));
		for(Person person : persons) {
			System.out.println(person);
		}
	}
	
	public void sortNameAscending() {
		Collections.sort(persons, Comparator.comparing(Person::getName).reversed());
		for(Person person : persons) {
			System.out.println(person);
		}
	}
	
	public void sortSurnameDescending() {
		Collections.sort(persons, Comparator.comparing(Person::getSurname));
		for(Person person : persons) {
			System.out.println(person);
		}
	}
	
	public void sortSurnameAscending() {
		Collections.sort(persons, Comparator.comparing(Person::getSurname).reversed());
		for(Person person : persons) {
			System.out.println(person);
		}
	}
	
	public void sortDNIDescending() {
		Collections.sort(persons, Comparator.comparing(Person::getDNI));
		for(Person person : persons) {
			System.out.println(person);
		}
	}
	
	public void sortDNIAscending() {
		Collections.sort(persons, Comparator.comparing(Person::getDNI).reversed());
		for(Person person : persons) {
			System.out.println(person);
		}
	}
	
	//MAIN MENU
	public byte mainMenu() {
		return Input.readByte("1. Insert person."+"\n"
							 +"2. Show persons by name [A-Z]."+"\n"
							 +"3. Show persons by name [Z-A]."+"\n"
							 +"4. Show persons by surname [A-Z]."+"\n"
							 +"5. Show persons by surname [Z-A]."+"\n"
							 +"6. Show persons by DNI [1-9]."+"\n"
							 +"7. Show persons by DNI [9-1]."+"\n"
							 +"0. Exit");
	}
	
	public void start() {
		
		boolean flag = false;
		while(!flag){
			switch(mainMenu()) {
				case 1:
					insertPerson();
					break;
				case 2:
					sortNameDescending();
					break;
				case 3:
					sortNameAscending();
					break;
				case 4:
					sortSurnameDescending();
					break;
				case 5:
					sortSurnameAscending();
					break;
				case 6:
					sortDNIDescending();
					break;
				case 7:
					sortDNIAscending();
					break;
				case 0:
					System.out.println("Hasta pronto.");
					flag = true;
					break;
				default:
					System.out.println("Introduzca una opción válida.");
					break;
			}
		}
	}
	
	//FILES MANAGEMENT
	
	public void writeFileCSV(Person person) {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
			
			writer.write(person.getName()+";"+person.getSurname()+";"+person.getDNI());
			writer.newLine();
			
			writer.close();
		}catch(IOException e) {
			System.out.println("El archivo no se ha encontrado.");
		}
		
	}
	
	public void readFileCSV() {
		
		try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            
            while (line !=null) {            	
            	
                String row[] = line.split(";");
                
                persons.add(new Person(row[0], row[1], row[2]));
                
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("El archivo no se ha encontrado.");
        }
	}
}
