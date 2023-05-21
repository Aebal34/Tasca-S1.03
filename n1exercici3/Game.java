package n1exercici3;

import java.util.*;

public class Game {

	//ATTRIBUTES
	private byte score;
	private String player;
	private Map<String,String> countriesAndCapitals;
	private byte tries;
	
	//CONSTRUCTOR
	public Game(String player) {
		score = 0;
		this.player = player;
		tries = 0;
		countriesAndCapitals = MapFileManager.readFile(System.getProperty("user.dir") + "\\src\\n1exercici3\\countries.txt");
	}
	
	//METHODS
	
	public void round() {
		
		//Simplify and divide method in round() and start();
		while(tries<10) {
			String country = randomCountry();
			String answer = Input.readString("Escribe la capital del país "+country+": (Si tiene espacios, debes escribirlos como _)");
			if(answer.equals(countriesAndCapitals.getOrDefault(country, "¡Has fallado!"))) {
				score++;
				tries++;
				System.out.print("¡Así es! ¡Sigue así! Te quedan "+(10-tries) +" intentos y tu puntuación es de "+score+" puntos.");
			}else {
				tries++;
				System.out.println("Te quedan "+(10-tries)+" intentos...");
			}
			
		}
	}
	
	public String randomCountry() {
		
		HashSet<String> countries = (HashSet<String>)countriesAndCapitals.keySet();
		
		Iterator<String> it = countries.iterator();
		
		return it.next();
	}
}
