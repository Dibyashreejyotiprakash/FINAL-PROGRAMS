package STRING_FINAL;

import java.util.HashMap;
import java.util.Scanner;


public class CountOccunalrance_Final {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String..");
		String word=sc.nextLine();
		HashMap<Character,Integer> h=new HashMap<>();
		for(Character ch: word.toCharArray())
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
