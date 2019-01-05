package ARRAY_FINAL;

import java.util.ArrayList;
import java.util.Arrays;

public class Covert_ListTo_Array {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();

		  list.add("Python");
		 
		  list.add("Java");
		 
		  list.add("PHP");
		  
		  list.add("C#");
		 
		  list.add("C++");
		  
		  list.add("Perl");
		 
		  String[]  my_array = new String[list.size()];
		  
		  list.toArray(my_array);
		  
		  System.out.println(Arrays.toString(my_array));
	}
	  
	  

}
