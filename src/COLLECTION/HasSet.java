package COLLECTION;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HasSet {
	
	public static void main(String[] args) {
		
		HashSet<Object> st=new HashSet<>();
		st.add("dibya");
		st.add("bibek");
		st.add("prakash");
		st.add("dibya");
		st.add("bibek");
		st.add("viveo");
		st.add(null);
		
		System.out.println(st);
		
		Iterator<Object> it=st.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
	}
	

}
