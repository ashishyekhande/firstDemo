package OOPS;

public class area {

	// overloading -> methods have same name but different parameters.
	// overloading is compile time polymorphism
	// we can achieve in same class

	public void area(int l) {
		System.out.println("area of circle --> " + 3.14 * l * l);
	}

	public void area(int l, int b) {
		System.out.println("area of trainagle -->" + 0.5 * l * b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area a = new area();
		a.area(4);
		a.area(5, 6);

	}

}
