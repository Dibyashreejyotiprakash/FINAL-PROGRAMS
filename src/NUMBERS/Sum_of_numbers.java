package NUMBERS;

import java.util.Scanner;

public class Sum_of_numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter max limit..");
		int limit=sc.nextInt();
		int sum=0;
		for(int i=0;i<=limit;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of numbers are "+ sum);
	}

}
