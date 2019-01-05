package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List1 {
	public static void main(String[] args) {
		
		ArrayList<Object> list=new ArrayList<>();
		System.out.println("Size of list is "+ list.size());
		list.add("dibya");
		list.add("prakash");
		list.add("bibek");
		list.add("qspider");
		System.out.println(list);
		System.out.println("*****************************");
		for(Object obj: list)
		{
			System.out.println(obj);
		}
		System.out.println("*****************************");
		
		Iterator<Object> it=list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
