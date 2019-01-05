package LIST;

import java.util.LinkedList;

public class List3 {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		
		for(int i=0;i<=10;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		System.out.println("*********************");
		list.addFirst(11);
		System.out.println(list);
		System.out.println("*********************");
		list.addLast(122);
		System.out.println(list);
		System.out.println("*********************");
		list.add(3,99);
		System.out.println(list);
		System.out.println("*********************");
		System.out.println("First element is "+list.getFirst());
		System.out.println("**********************");
		System.out.println("Last element is "+list.getLast());
		System.out.println("**********************");
		System.out.println(list.contains(99));
		
	}

}
