package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<=10;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		for(Object obj: list)
		{
			System.out.println(obj);
		}
		
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
