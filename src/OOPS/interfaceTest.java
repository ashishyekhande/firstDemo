package OOPS;

public class interfaceTest implements interfacedemo, interfacedemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceTest in = new interfaceTest(); // creating object of child class
		in.arearectangle();
		in.circle();

		interfacedemo.area();

		interfacedemo2.days();
	}

	@Override
	public void triangle() {
		// TODO Auto-generated method stub
		System.out.println("this is area of triangle");
	}

	@Override
	public void circle() {
		// TODO Auto-generated method stub
		System.out.println("this is area of cirlce");
	}

	@Override
	public void year() {
		// TODO Auto-generated method stub
		System.out.println("this is from interface demo 2");
	}

}
