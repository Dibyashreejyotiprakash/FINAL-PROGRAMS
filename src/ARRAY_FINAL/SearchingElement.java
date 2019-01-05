package ARRAY_FINAL;

public class SearchingElement {
	
	public static int search(int a[],int item)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==item)
			{
				System.out.println("item found "+"And index is "+i);
			}
		}
		return item;
	}

	public static void main(String[] args) {
		
		int a[]={3,5,6,7,8,9};
		search(a, 7);
	}
	}


