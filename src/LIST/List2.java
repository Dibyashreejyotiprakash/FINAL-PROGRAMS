package LIST;

import java.util.ArrayList;

public class List2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				list1.add(i);
			}else
			{
				list2.add(i);
			}
		}
		
		list1.addAll(list2);
		System.out.println(list1);
		
		System.out.println("********************");
		
		list1.removeAll(list2);
		System.out.println(list1);
		
		System.out.println("********************");
	}

}
