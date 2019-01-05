package STRING_FINAL;

public class ToString {
	String name;
	int id;
	int rollno;
	public ToString(String name,int id, int rollno) {
		this.name=name;
		this.id=id;
	}
	public String toSTring()
	{
		
		return name+" "+id+" "+rollno;
		
	}
	
	public static void main(String[] args) {
		ToString t=new ToString("dibya",1,101);
		System.out.println(t.toString());
	}

}
