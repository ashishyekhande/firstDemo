package OOPS;

public class abstractTest extends demoabstract  {

	
	// ashish test rest done
	public void square()
	{
		System.out.println("area of square");
	}
	
	@Override
	public void circle() {
		// TODO Auto-generated method stub
		System.out.println("area of circle");
	}

	@Override
	public void circle1() {
		// TODO Auto-generated method stub
		System.out.println("area of circle 1");
	}

	@Override
	public void circle2() {
		// TODO Auto-generated method stub
		System.out.println("area of circle 2");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abstractTest a	 = new abstractTest();  // creating object of child class 
		a.circle();
		a.circle1();
		a.circle2();
		a.square();
		a.rectangle();
				
		//demoabstract b  = new demoabstract();  // IV. can we create object of absrtact class,   --> NO
		//b.rectangle();
		
		demoabstract b = new abstractTest(); // Iv.  creating object child class and assigning 
		b.rectangle();   		// IV. if i have extended abstract class and created object of child class which method i can see,
								
		
	}
	
	
	

}
