package n2exercici2;

import java.util.*;

public class Restaurant implements Comparable<Restaurant>, Comparator<Restaurant>{

	//ATTRIBUTES
	private String name;
	private int score;
	
	//CONSTRUCTORS
	public Restaurant() {
		
	}
	public Restaurant (String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	//GETTERS
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	//Override so HashSet won't add elements that .equals = true
	@Override
	public int hashCode() {
		return Objects.hash(name, score);
	}

	//Override so equals evaluates name and score to know if 2 restaurants are equal
	@Override
	public boolean equals(Object obj) {
		boolean equals = false;
		if (obj instanceof Restaurant) { //If object given is a Restaurant
			Restaurant other = (Restaurant) obj; //Cast obj into Restaurant
			if(this.name.equals(other.getName())&&this.score == other.getScore()) {
				equals = true;
			}
		}
		return equals;
	}

	@Override
	public String toString() {
		return "Restaurant name: " + name + ", score:" + score;
	}

	@Override
	public int compareTo(Restaurant o) {
		// TODO Auto-generated method stub
		return this.score - o.getScore();
	}

	@Override
	public int compare(Restaurant o1, Restaurant o2) {
		// TODO Auto-generated method stub
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		return name1.compareTo(name2);
	}
}
