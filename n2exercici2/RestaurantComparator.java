package n2exercici2;

import java.util.Comparator;

public class RestaurantComparator implements Comparator<Restaurant> {

	@Override
	public int compare(Restaurant o1, Restaurant o2) {
		int nameCompare = o1.getName().compareTo(o2.getName());
		if(nameCompare==0) {
			nameCompare = o1.getScore()-o2.getScore();
		}
		return nameCompare;
	}
}
