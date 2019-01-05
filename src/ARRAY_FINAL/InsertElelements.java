package ARRAY_FINAL;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElelements {

	public static void main(String[] args) {
		
		int a1[]=new int[5];
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements to array..");
		
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Before reverse array is "+Arrays.toString(a1));
		
		for(int i=0;i<a1.length/2;i++)
		{
			temp=a1[i];
			a1[i]=a1[a1.length-1-i];
			a1[a1.length-1-i]=temp;
			
		}
		System.out.println("After reversing arrays is "+Arrays.toString(a1));
	}
}
