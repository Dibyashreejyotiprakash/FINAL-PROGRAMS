package NUMBERS;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number..");
		int num=sc.nextInt();
		int rem=0;
		int temp=num;
		int rev=0;
		while(num !=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		if(rev==temp)
		{
			System.out.println("Pallindrome");
		}else{
			System.out.println("Not Pallindrome");
		}
	}

}
