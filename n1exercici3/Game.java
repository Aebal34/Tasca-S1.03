package n1exercici3;

import java.util.*;

public class Game {

	//ATTRIBUTES
	private byte score;
	private byte tries;
	private String player;
	private Map<String,String> countriesAndCapitals;
	Set<String> selectedCountries;
	
	//CONSTRUCTOR
	public Game(String player) {
		score = 0;
		tries = 0;
		this.player = player;
		countriesAndCapitals = new HashMap<String, String>(MapFileManager.readFile(System.getProperty("user.dir") + "\\src\\n1exercici3\\countries.txt"));
		selectedCountries = new HashSet<String>();
	}
	
	//METHODS
	
	public void play() {
		
		while(tries<10) {
			round();
			System.out.println();
		}
		System.out.println("You have obtained "+score+" points in 10 questions!");
		if(score != 10) {
			System.out.println("Try again next time to get all 10 points!");
		}
		end();
	}
	
	public void round() {
		
			String country = randomCountry();
			String answer = Input.readString("Write the capital city of the country "+country+": (If it has spaces, write them as _)");
			if(answer.equals(countriesAndCapitals.getOrDefault(country, "Incorrect!"))) {
				score++;
				tries++;
				System.out.print("Hell yeah! Let's go! You've got "+(10-tries) +" tries and your score is "+score+" points.");
			}else {
				tries++;
				System.out.println("You've got "+(10-tries)+" tries...");
			}	
		}
	
	public void end() {
		
		MapFileManager.writeMap(player, score, System.getProperty("user.dir")+"\\src\\n1exercici3\\score.txt");
	}
	
	public String randomCountry() {
	    Set<String> availableCountries = new HashSet<>(countriesAndCapitals.keySet());
	    if(tries>0) {
		    availableCountries.removeAll(selectedCountries);
	    }

	    ArrayList<String> countries = new ArrayList<>(availableCountries);

	    int randomIndex = (int)(Math.random()*countries.size());

	    String selectedCountry = countries.get(randomIndex);

	    selectedCountries.add(selectedCountry);

	    return selectedCountry;
	}
}
