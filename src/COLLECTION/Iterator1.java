package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator1 {

	public static void main(String[] args) {

		ArrayList<Object> l1 = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			l1.add(i);
		}
		System.out.println(l1);

		Iterator<Object> it1=l1.iterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
	}

}
