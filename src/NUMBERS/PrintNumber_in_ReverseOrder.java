package NUMBERS;

import java.util.Scanner;

public class PrintNumber_in_ReverseOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter max limit..");
		int maxlimit=sc.nextInt();
		for(int i=maxlimit;i>=0;i--)
		{
			System.out.println(i);
		}
	}

}
