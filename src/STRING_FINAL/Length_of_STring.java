package STRING_FINAL;

import java.util.Scanner;

public class Length_of_STring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String..");
		String word=sc.nextLine();
		char ch[]=word.toCharArray();
		int count=0;
		for(Character obj:ch)
		{
			count++;
		}
		System.out.println(count);
	}

}
