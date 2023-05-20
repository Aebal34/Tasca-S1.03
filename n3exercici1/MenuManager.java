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
	
	public void insertPerson(Person person) {
		persons.add(person);
	}
	
	public void sortNameAscending() {
		Collections.sort(persons, Comparator.comparing(Person::getName).reversed());
		for(Person person : persons) {
			System.out.println(person);
		}
	}
	
	public void sortNameDescending() {
		Collections.sort(persons, Comparator.comparing(Person::getName));
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
							 +"5. Show persons by DNI [1-9]."+"\n"
							 +"5. Show persons by DNI [9-1]."+"\n"
							 +"0. Exit");
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
