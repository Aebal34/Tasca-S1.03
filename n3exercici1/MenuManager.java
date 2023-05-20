package n3exercici1;

import java.io.*;
import java.util.*;

public class MenuManager {

	//ATTRIBUTES
	private List<Person> persons;
	private String path;
	private PersonComparator nameCompare;
	private PersonComparator surnameCompare;
	private PersonComparator DNICompare;
	
	//CONSTRUCTOR
	
	public MenuManager() {
		persons = new ArrayList<Person>();
		path = System.getProperty("user.dir")+"\\src\\n3exercici1\\table.csv";
		nameCompare = new PersonComparator("name");
		surnameCompare = new PersonComparator("surname");
		DNICompare = new PersonComparator("DNI");
	}
	
	//DATA CONTROL
	
	public void insertPerson() {
		Person p1 = new Person(Input.readString("Escriba el nombre de la persona a introducir:"),
								Input.readString("Escriba el apellido de la persona a introducir:"),
								 Input.readString("Escriba el DNI de la persona a introducir:"));
		
		writeFileCSV(p1);
	}
	
	public void sortAttributeDescending(PersonComparator comparator) {
		//We call the static method sort from Collections to sort the list with the given comparator parameters 
		persons.sort(comparator);
	}
	
	public void sortAttributeAscending(PersonComparator comparator) {
		persons.sort(comparator);
		Collections.reverse(persons);
	}
	
	//PRINT
	public void printList() {
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
					sortAttributeDescending(nameCompare);
					printList();
					break;
				case 3:
					sortAttributeDescending(nameCompare);
					printList();
					break;
				case 4:
					sortAttributeDescending(surnameCompare);
					printList();
					break;
				case 5:
					sortAttributeDescending(surnameCompare);
					printList();
					break;
				case 6:
					sortAttributeDescending(DNICompare);
					printList();
					break;
				case 7:
					sortAttributeDescending(DNICompare);
					printList();
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
