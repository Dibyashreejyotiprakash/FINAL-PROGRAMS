package ARRAY_FINAL;

import java.util.HashMap;
import java.util.Scanner;

public class Occurance_of_GivenElement_Final {
	public static void main(String[] args) {
		char ch1[]={'a','b','c','a','b'};
		HashMap<Character,Integer> h=new HashMap<>();
		for(Character ch: ch1)
		{
			if(h.containsKey(ch))
			{
				int value=h.get(ch);
				h.put(ch, value+1);
			}else{
				h.put(ch,1);
			}
		}
		System.out.println(h);
	}

}
