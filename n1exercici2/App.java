package n1exercici2;

import java.util.*;
public class App {

	public static void main(String[] args) {

		//We use LinkedList for lighter use of resources when adding or removing elements from it
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		LinkedList<Integer> invertedList = new LinkedList<Integer>();
		
		//We instantiate an iterator for each list
		ListIterator<Integer> it = list.listIterator(list.size()); //Starts at last position
		ListIterator<Integer> invertedIt = list.listIterator(); 
		
		while(it.hasPrevious()) {
			
			invertedList.add(it.previous());
		}

		System.out.println(list);
		System.out.println(invertedList);
	}

}
