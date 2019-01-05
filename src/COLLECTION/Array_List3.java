package COLLECTION;

import java.util.ArrayList;

public class Array_List3 {
	
	public static void main(String[] args) {
		
		ArrayList<Object> list1=new ArrayList<>();
		ArrayList<Object> list2=new ArrayList<>();
		
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				list1.add(i);
			}else if(i%2==1)
			{
				list2.add(i);
			}
		}
		
		System.out.println(list1);
		System.out.println(list2);
		
		//USING ADD-ALL METHOD
		
		list1.addAll(list2);
		System.out.println("After adding list2 "+ list1);
		
		list1.add(0,999);
		System.out.println(list1);
	}

}
