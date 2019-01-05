package ARRAY_FINAL;

import java.util.Arrays;

public class InsertElement {
	public static void main(String[] args) {
		
		int insert=4;
		int index=3;
		
		int a1[]={1,3,45,6,7,9};
		for(int i=a1.length-1;i>index;i--)
		{
			a1[i]=a1[i-1];
		}
		a1[index]=insert;
		System.out.println(Arrays.toString(a1));
	}

}
