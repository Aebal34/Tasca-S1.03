package n2exercici2;

import java.util.Comparator;

public class RestaurantComparator implements Comparator<Restaurant> {

	@Override
	public int compare(Restaurant o1, Restaurant o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}
