package COLLECTION;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	public static void main(String[] args) {
		
		Map<Integer,String> st=new HashMap<>();
		st.put(11,"dibya");
		st.put(12,"bibek");
		st.put(23,"prakash");
		st.put(null,"samsung");
		st.put(20, null);
		st.put(null,"vivo");
		
		System.out.println(st);
		
		for(Map.Entry obj: st.entrySet())
		{
			System.out.println(obj.getKey() +" "+ obj.getValue());
		}
		
	}

}
