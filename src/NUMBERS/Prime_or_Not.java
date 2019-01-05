package NUMBERS;

import java.util.Scanner;

public class Prime_or_Not {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number..");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num %i==0)
			{
				System.out.println("Multiple are.."+i);
				count++;
			}
		}
		System.out.println("Number of multiples are "+ count);
		if(count==2)
		{
			System.out.println("Number is prime..");
		}else if(count>2){
			System.out.println("Number is not prime");
		}
	}
}
