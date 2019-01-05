package STRING_FINAL;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name..");
		String name=sc.nextLine();
		String nstr;
		char temp;
		char ch[]=name.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		nstr=new String(ch);
		System.out.println("After reversing "+nstr);
		
		if(nstr.equalsIgnoreCase(name))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	
		
		
	}

}
