public class employee
{
	int age;
	String name,city;
	public void display()
		{	
			System.out.println("The name is " + name);
			System.out.println("My age is " + age);
			System.out.println("I am from " + city+"\n");
		}
	public static void main(String[] ar) 
	{
 		employee e1 =new employee();
		employee e2 =new employee();
		e1.name="Pritam"; 
		e2.name="Bittu";
		e1.age=21;
		e2.age=21;
		e1.city="Panagarh";
		e2.city="Burdwan";
		e1.display();
		e2.display();
	}
	
}