package interface1;

public class interfacetest implements interfacedemo1, interfacedemo2
{
 public void square()
 {
	 System.out.println("in square");
 }
	
	@Override
	public void triangle() {
		// TODO Auto-generated method stub
		System.out.println("in triangle");
	}

	@Override
	public void circle() {
		// TODO Auto-generated method stub
	System.out.println("in circle");	
	}

	@Override
	public void year() {
		// TODO Auto-generated method stub
		System.out.println("in year");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		interfacetest in = new interfacetest();
		in.square();
		in.year();
		in.circle();
		in.triangle();
		
		interfacedemo1.area();
		in.arearectangle();
		
			
		
		
	}
	
	
}
