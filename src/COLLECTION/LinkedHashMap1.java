package COLLECTION;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> st=new LinkedHashMap<>();
		st.put(10,"dibya");
		st.put(11,"prakash");
		
		for(Map.Entry obj: st.entrySet())
		{
			System.out.println(obj.getKey()+" "+ obj.getValue());
		}
	}

}
