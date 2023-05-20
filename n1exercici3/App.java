package n1exercici3;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		Map<String,String> countriesMap = new HashMap<String,String>();
		
		countriesMap = MapFileManager.readFile(System.getProperty("user.dir") + "\\src\\n1exercici3\\countries.txt");
		
		for(Map.Entry<String, String> row : countriesMap.entrySet()) {
			
			System.out.println(row);
		}
		
		
	}

	

}
