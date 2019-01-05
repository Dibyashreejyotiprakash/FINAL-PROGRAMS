package NUMBERS;

import java.util.Scanner;

public class PrintNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit..");
		int maxnum=sc.nextInt();
		for(int i=0;i<=maxnum;i++)
		{
			System.out.println(i);
		}
	}

}
