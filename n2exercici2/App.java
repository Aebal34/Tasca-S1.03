package n2exercici2;

import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instantiate HashSet Collection
		Set<Restaurant> restaurants = new HashSet<Restaurant>();	
		
		//Samples
		Restaurant konigGirona = new Restaurant("Konig", 5);
		Restaurant tagliatella = new Restaurant("Tagliatella", 7);
		Restaurant ilcapo = new Restaurant("Il Capo", 10);
		Restaurant eltoril = new Restaurant("El Toril", 10);
		Restaurant konigBarcelona = new Restaurant("Konig", 6);
		Restaurant tagliatella2 = new Restaurant("Tagliatella", 7);
		
		//We add them all to HashSet
		restaurants.add(konigGirona);
		restaurants.add(tagliatella);
		restaurants.add(ilcapo);
		restaurants.add(eltoril);
		restaurants.add(konigBarcelona);
		restaurants.add(tagliatella2);
		
		//Print for reference
		for(Restaurant restaurant : restaurants) {
			System.out.println(restaurant);
		}
		
		//Space for clarity
		System.out.println();

		//We pass the HashSet as parameter, so all objects inside it go inside the TreeSet, and thanks to the Override on 
		//the compareTo method, they are automatically ordered by score
		Set<Restaurant> orderedRestaurantsScore = new TreeSet<Restaurant>(restaurants);
		
		//Print for reference
		for(Restaurant restaurant : orderedRestaurantsScore) {
			System.out.println(restaurant);
		}
		
		//Space for clarity
		System.out.println();
		
		//We create a comparator
		RestaurantComparator comparator = new RestaurantComparator();
		
		//We instantiate the new TreeSet with the comparator
		Set<Restaurant> orderedRestaurantsAlphabetical = new TreeSet<Restaurant>(comparator);
		
		//We add all Restaurant class inside, that will be automatically ordered alphabetically
		orderedRestaurantsAlphabetical.addAll(restaurants);
		
		//And we print for reference
		for(Restaurant restaurant : orderedRestaurantsAlphabetical) {
			System.out.println(restaurant);
		}
	}
}
