package abstractexample;

public class abstractTest extends abstractdemo {
	
	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("this is parent class in which i have extended abstract class");
	}
	
	public void circle()
	{
		System.out.println("this is circle");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstractTest a = new abstractTest();
		a.area();
		a.circle();
		
		// abstractdemo b=new abstractdemo(); // cannot creat object of abstract class
		
		abstractdemo c = new abstractTest(); // creating object of child class and assigning to parent.
		a.area();
		a.circle();
		
	}

	
	//class can extends only one class and can implemnts mutiple interfaces 
	// we can achive multiple inhertance by using interface.
	

}
