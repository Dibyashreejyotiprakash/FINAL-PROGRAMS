package STRING_FINAL;

import java.util.Scanner;

public class Display_Not_Repeated_Character {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String..");
		String word=sc.nextLine();
		for(int i=0;i<word.length();i++)
		{
			int count=0;	
			for(int j=0;j<word.length();j++)
			{
				if(word.charAt(i)==word.charAt(j))
				{
					count++;
				}
			}
		
		if(count==1)
		System.out.println(word.charAt(i));	
		}
	}
}

