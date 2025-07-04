package interface1;

interface interfacedemo1 {

	public void triangle();

	public void circle();

	static void area() {
		int a = 50;
		System.out.println("i am in interface class with default method");
	}

	default void arearectangle() {
		int a = 50;
		System.out.println("i am in interface class with default method");
	}
	
	private void areasquare() {
		int a = 50;
		System.out.println("i am in interface class with default method");
		}

}
