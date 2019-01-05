package ARRAY_FINAL;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Occurance_ofEachElement1 {

	public static void main(String[] args) {

		//Using Method 
		
		String a[] = {"dibya", "bibek", "prakash","dibya"};

		List asList = Arrays.asList(a);
		Set<String> mySet = new HashSet<String>(asList);
		for (String s : mySet) {

			System.out.println(s + " " + Collections.frequency(asList, s));

		}

	}

}
