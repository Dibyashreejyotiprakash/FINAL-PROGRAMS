package COLLECTION;

import java.util.ArrayList;

class Student
{
	String name;
	int id;
	int age;
	Student(String name,int id,int age)
	{
		this.name=name;
		this.age=age;
		this.id=id;
	}
}
public class Array_List2 {

	public static void main(String[] args) {
		
		Student s1=new Student("dibya",10,20);
		Student s2=new Student("Bibek",11,26);
		
		ArrayList<Student> l=new ArrayList<>();
		
		l.add(s1);
		l.add(s2);
		
		for(Student obj: l)
		{
			System.out.println(obj.name);
			System.out.println(obj.id);
			System.out.println(obj.age);
		}

	}
	
}
