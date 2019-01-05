package STRING_FINAL;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String name=sc.nextLine();
		char ch[]=name.toCharArray();
		char temp;
		String nstr;
		for(int i=0;i<name.length()/2;i++)
		{
			temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		nstr=new String(ch);
		System.out.println(nstr);
	}

}
