package OOPS;

interface interfacedemo2 {
	
	public void year();
		
	static void days() {
		int c = 50;
		System.out.println("i am in interface class with default method");
	}

	default void months() {
		int b = 50;
		System.out.println("i am in interface class with default method");
		
		
		int a =20;
		int x = 35; //--> int =integer 
		String name = "ashish SIT seleneum";  //-> String
		
		if(a<=10) //true   boolean => true/false
		{
			System.out.println("ashish");
		}
		else //false
		{
			System.out.println("SIT airoli");
		}
		
		
		
		 
	}

}
