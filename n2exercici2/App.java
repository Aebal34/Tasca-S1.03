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

		
		Set<Restaurant> orderedRestaurantsScore = new TreeSet<Restaurant>(restaurants);
		
		for(Restaurant restaurant : orderedRestaurantsScore) {
			System.out.println(restaurant);
		}
		
		//Space for clarity
		System.out.println();
		
		Restaurant comparator = new Restaurant();
		
		Set<Restaurant> orderedRestaurantsAlphabetical = new TreeSet<Restaurant>(comparator);
		orderedRestaurantsAlphabetical.addAll(restaurants);
		
		for(Restaurant restaurant : orderedRestaurantsAlphabetical) {
			System.out.println(restaurant);
		}
	}
}
