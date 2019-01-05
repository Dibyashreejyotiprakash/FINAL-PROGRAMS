package ARRAY_FINAL;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int a[]={2,6,9,1,11,13};
		System.out.println("Before reversing Array is "+Arrays.toString(a));
		
		int temp;
		for(int i=0;i<a.length/2;i++)
		{
			temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		System.out.println("After reversing Array is "+Arrays.toString(a));
	}

}
