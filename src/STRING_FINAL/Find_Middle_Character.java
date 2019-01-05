package STRING_FINAL;

import java.util.Scanner;

public class Find_Middle_Character {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String word=sc.nextLine();
		char ch[]=word.toCharArray();
		if(ch.length %2==0)
		{
			char ch1=ch[ch.length/2-1];
			char ch2=ch[ch.length/2];
			System.out.println(ch1+" "+ch2);
		}else{
			System.out.println(ch[ch.length/2]);
		}
		
	}

}
