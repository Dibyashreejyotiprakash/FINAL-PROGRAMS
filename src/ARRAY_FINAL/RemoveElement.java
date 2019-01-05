package ARRAY_FINAL;

import java.util.Arrays;

public class RemoveElement {
	
	public static void main(String[] args) {
		
		int index=1;
		
		int a1[]={1,2,3,4,5,6};
		for(int i=index;i<a1.length-1;i++)
		{
			a1[i]=a1[i+1];
		}
		System.out.println(Arrays.toString(a1));
		
		System.out.println("****************************");
		/*int value=11;
		
		for(int i=a1.length-1;i>index;i--)
		{
			a1[i]=a1[i-1];
		}
		a1[index]=value;
		System.out.println(Arrays.toString(a1));*/
	}

}
