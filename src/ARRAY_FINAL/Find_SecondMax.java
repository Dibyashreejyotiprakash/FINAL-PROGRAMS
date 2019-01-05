package ARRAY_FINAL;

public class Find_SecondMax {
	
	public static void main(String[] args) {
		
		int a[]={23,12,14,56,22,28,13};
		int first_big=a[0];
		int second_big=a [1];
		for (int i=1; i<a.length; i++)
		{
			if (first_big<a[i])
			{
				second_big=first_big;
				first_big=a[i];
			}
			else if (second_big<a[i])
			{
				second_big=a[i];
			}
		}
		System.out.println(first_big);
		System.out.println(second_big);

	}

}
