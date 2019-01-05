package ARRAY_FINAL;

public class DuplicateElements {
	public static void main(String[] args) {
		
		int a[]={2,4,5,2,1,9,6,5};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && i !=j)
				{
					System.out.println("Duplicate element is "+ a[i]);
				}
			}
			
		}
	}

}
