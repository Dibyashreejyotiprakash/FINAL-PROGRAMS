package ARRAY_FINAL;

public class Occurance_of_GivenElement {
	
	static int occurred (int a [], int element)
	{
		int count=0;
		for (int i=0; i<a.length; i++)
		{
			if (element==a[i])
				count++;
		}
		return count;
	}
	public static void main (String [] args) 
	{
		int a[]={22,11,23,11,15,19,11};
		int in=occurred (a, 11);
		if (in>=0)
			System.out.println ("Given Element occured "+ in +" times present ");
		else
		System.out.println ("not valid");
	}
	


}
