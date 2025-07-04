package OOPS;

interface interfacedemo {

	public void triangle();

	public void circle();

	/*
	 * From Java 9+: Default methods: Method with body using default keyword.
	 * 
	 * Static methods: Can be called using InterfaceName.method().
	 * 
	 * Private methods: Can be used inside default/static methods.
	 */

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
