package LIST;

import java.util.ArrayList;
import java.util.ListIterator;

public class List4 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<=10;i++)
		{
			list.add(i);
		}
		ListIterator<Integer> it=list.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		
		
	}

}
