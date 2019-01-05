
package ARRAY_FINAL;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element..");
		int a[] = new int[7];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorting Array with method "+Arrays.toString(a));
		System.out.println("*********************************************");

		int temp;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		System.out.println("Sorting an array without using method "+Arrays.toString(a));
	}
}
