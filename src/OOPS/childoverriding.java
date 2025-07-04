package OOPS;

public class childoverriding extends parentoverriding {

	// we need 2 different class to achieve overriding.
	// method name should be same as well as paremters should be same.

	// overridden method
	@Override
	public void area(int l) {
		System.out.println("area of circle --> " + 3.14 * l * l);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childoverriding o1 = new childoverriding();
		o1.area(5);

		parentoverriding o2 = new childoverriding(); // creating object of child class and assigning to parent class
														// reference . in this case
		o2.area(6); // it will call overriden method in child class only

		parentoverriding o3 = new parentoverriding(); // to call parent class method we need to create object of parent
														// class only
		o3.area(5);
	}

}

/*
 * | Data Type | Size | Default Value | Description | Example | | --------- |
 * ------- | ------------- | ----------------------------------- |
 * ------------------- | | `byte` | 1 byte | 0 | Stores small integers (-128 to
 * 127) | `byte b = 100;` | | `short` | 2 bytes | 0 | Stores medium-range
 * integers | `short s = 1000;` | | `int` | 4 bytes | 0 | Default integer type |
 * `int i = 50000;` | | `long` | 8 bytes | 0L | Stores large integers | `long l
 * = 100000L;` | | `float` | 4 bytes | 0.0f | Single-precision decimal numbers |
 * `float f = 5.5f;` | | `double` | 8 bytes | 0.0d | Double-precision decimal
 * numbers | `double d = 10.99;` | | `char` | 2 bytes | '\u0000' | Stores a
 * single character | `char c = 'A';` | | `boolean` | \~1 bit | false | Stores
 * true or false values | `boolean b = true;` |
 * 
 * 
 */
