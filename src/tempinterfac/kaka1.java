package tempinterfac;

interface kaka1 {

	public void kaka_1_method_1();
	public void kaka_1_method_2();
	
	default void kaka_1_method_3()
	{
		System.err.println("kaka_1_method_3");
	}
	
	static void kaka_1_method_4()
	{
		System.err.println("kaka_1_method_3");
	}
	
	private void kaka_1_method_5()
	{
		System.err.println("kaka_1_method_3");
	}
	
}
