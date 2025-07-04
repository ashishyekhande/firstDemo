package firstDemo;

public class demo 
{

	//access modifier  public , private ,protected 
	//float ,int , double, char, string , boolean
	public String reading()
	{
		String str = "reading apple";
		int n= 50;
		System.out.println("i am reading");
		return str;
	}
	
	public void writing()
	{
		double area = 34.6;
		System.out.println("i am writing");
	}
	
	
	//public -> method or variable can be called from anywhere
	//private -> limited to this class or method
	//void --> return type -->  void = nothing , 
	//static --> does not require object to start execution 
	//main --> java looks for main method to execute .
	
	public static void main(String[] args)   // IV 1. why main method is static 
	{										// IV 2. explain public static void main -->
											// IV 3. can i write public void static  --> yes
		// TODO Auto-generated method stub
		System.out.println("i am in main method");
		
		demo d1= new demo();  // 
		String i = d1.reading();
		System.out.println("my return value from reading -->" +i);
		d1.writing();
		
		//creating object of other class
		demo1 d2 = new demo1();
		d2.publicmethodtes();
		d2.privatemthod();
		//d2.writing();
		
		
	}

}
