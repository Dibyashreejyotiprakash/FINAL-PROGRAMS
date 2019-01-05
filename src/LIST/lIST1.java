package LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class lIST1 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<=10;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		for(Object obj: list)
		{
			System.out.println(obj);
		}
		
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("****************");
		
		/*list.clear();
		System.out.println(list);*/
		
		/*Converting list to array..*/
	    /*Integer a[]=new Integer[list.size()];
		list.toArray(a);
		System.out.println(Arrays.toString(a));*/
		
		System.out.println(list.clone());
		
		ArrayList<Integer> list2=new ArrayList<>();
		

		
		
	}
	


}
