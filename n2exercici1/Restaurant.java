package n2exercici1;

import java.util.Objects;

public class Restaurant {

	//ATTRIBUTES
	private String name;
	private int score;
	
	//CONSTRUCTOR
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
}
