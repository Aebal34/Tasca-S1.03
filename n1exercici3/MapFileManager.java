package n1exercici3;

import java.io.*;
import java.util.*;

public class MapFileManager {

	//CONSTRUCTOR
	public MapFileManager(){
		
	}
	
	static void writeMap(String player, byte score, String path) {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
			
			String line = player + " won " + score +" points.";
			
			writer.write(line);
			
			writer.close();
			
		}catch(IOException e) {
			System.out.println("No se ha encontrado el directorio de destino.");
		}
		
	}
	
	static Map<String, String> readFile(String path) {
		
		Map<String,String> map = new HashMap<String,String>();
		
		try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            
            while (line !=null && !line.isEmpty()) { 
            	
                String row[] = line.split(" ");
                
                map.put(row[0], row[1]);
                
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("El archivo no se ha encontrado.");
        }
		return map;
	}
}
