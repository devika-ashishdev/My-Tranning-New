package arregationAssignment;

public class Student {
	String name;
	int rollNo;
	Address address;
	public Student(String name, int rollNo, Address address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}
	public static void main(String args[])
	{
		Address obj=new Address("kalady","kerala","india",683550);
		Student obj2=new Student("devika",101,obj);
		obj2.display();
	}
	public void display() {
		System.out.println(rollNo);
		System.out.println(name);
		
		System.out.println(address.city);
		
		System.out.println(address.place);
		
		System.out.println(address.country);
		System.out.println(address.zip);
		
		
		
		
	}

}
