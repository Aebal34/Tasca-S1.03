package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		
		//We create 12 months of the year
		Month january = new Month("January");
		Month february = new Month("February");
		Month march = new Month("March");
		Month april = new Month("April");
		Month may = new Month("May");
		Month june = new Month("June");
		Month july = new Month("July");
		Month august = new Month("August");
		Month september = new Month("September");
		Month october = new Month("October");
		Month november = new Month("November");
		Month december = new Month("December");
		
		//We create ArrayList to store them
		ArrayList<Month> months = new ArrayList<Month>();

		//We add them but August
		months.add(january);
		months.add(february);
		months.add(march);
		months.add(april);
		months.add(may);
		months.add(june);
		months.add(july);
		months.add(september);
		months.add(october);
		months.add(november);
		months.add(december);
		
		//Print for reference
		for(Month month : months) {
			System.out.println(month);
		}
		
		//We add August in a certain position (the 8th month, that is)
		months.add(7, august);
		
		//Space for clarity in console
		System.out.println();
		
		//Print for reference
		for(Month month : months) {
			System.out.println(month);
		}
		
		//We convert ArrayList to HashSet
		HashSet<Month> monthsNoRepeat= new HashSet<Month>(months);
		
		//Space for clarity in console
		System.out.println();
		
		monthsNoRepeat.add(new Month("December"));
		
		//Print with for, elements might be in different order
		for(Month month : monthsNoRepeat) {
			System.out.println(month);
		}
		
		//Space for clarity in console
		System.out.println();
		
		//Create iterator
		Iterator<Month> it = monthsNoRepeat.iterator(); //with collections' method iterator, that generates the object iterator
		
		//We avoid Exception when collection is iterated
		while(it.hasNext()) {
			Month month = it.next();
			System.out.println(month);
		}
	}

}
