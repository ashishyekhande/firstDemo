package OOPS;

public class ChildClass extends ParentClass {

	// java support multi-level inheritance not multiple inheritance
	// can extends only one class
	// ashish
	public ChildClass() // constructor --> as soon as object is created it calls for constructor
	{
		super(); // super call should be first
		System.out.println("i am in child class constructor");
System.out.println();
	}

	public ChildClass(String str) // parameterised constructor.
	{
		System.out.println("i am in child class  parameterized constructor -->" + str);
	}

	public void education() // void -> nothing , int -> returning int
	{
		System.out.println("chlid have education method ");
	}

	public static void main(String args[]) {
		System.out.println("i am in child class main method ");
		ChildClass objpara = new ChildClass("ashish");
		ChildClass ob1 = new ChildClass(); // creating object of child calss
		ob1.education();
		ob1.tv();
		ob1.fridge();
		ob1.farmhous();
		ob1.village();

		// parent level object can access only parent methods and methods which parents
		// have inherteted from grandparentclass.
		ParentClass p1 = new ParentClass();
		p1.tv();
		p1.fridge();
		p1.village();
		p1.farmhous();

		// left side is refernce/ assignment side , right side new object creation 
		// initialition side

		 //ChildClass ch = new ParentClass(); // here we are creating object of parentclass and assiging it to child class

		// upcasting
		ParentClass b = new ChildClass(); // here we are creating object of ChildClass and assiging it to parent class

		// object can access which ever class reference is created.
		b.tv();
		b.fridge();
		b.farmhous();
		b.village();
		

	}

}
