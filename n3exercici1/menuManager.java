package n3exercici1;

import java.io.*;
import java.util.*;

public class menuManager {

	//ATTRIBUTES
	private List<Person> persons;
	private String path;
	
	//CONSTRUCTOR
	
	public menuManager() {
		persons = new ArrayList<Person>();
		path = System.getProperty("user.dir")+"\\src\\n3exercici1\\table.csv";
	}
	
	//DATA CONTROL
	
	public void insertPerson(Person person) {
		persons.add(person);
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
	
	public void readFileCSV(File file) {
		
		try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            
            while (reader.readLine() !=null) {
                String line = reader.readLine();
                
                String row[] = line.split(";");

                Person p1 = new Person(row[0], row[1], row[2]);
                
                reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("El archivo no se ha encontrado.");
        }
	}
}
