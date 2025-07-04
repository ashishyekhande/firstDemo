package tempinterfac;

public class child extends parent implements kaka1,kaka2 //java support multiple inheritance only with interface
{									// java can extends only one class and implimnet multiple interface
	public void childmethod()
	{
		System.out.println("child method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child c = new child();  //
		c.childmethod();
		c.parentmethod();
		
		c.kaka_1_method_1();
		c.kaka_1_method_2();
		c.kaka_2_method_1();
		c.kaka_2_method_2();
		
		c.kaka_1_method_3(); // default method from interface
		kaka1.kaka_1_method_4(); // static method from interface
		
		parent p = new parent();  // creating object of parent class and assign to parent class
		p.parentmethod();
		
		// child c = new parent(); // invalid
		
		parent p1	= new child();
		p.parentmethod();
		
	  //	kaka1 k	= new kaka1();  // Iv we cannot create object of interface we can impliment interface
		
	}

	@Override
	public void kaka_2_method_1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kaka_2_method_2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kaka_1_method_1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kaka_1_method_2() {
		// TODO Auto-generated method stub
		
	}

}
