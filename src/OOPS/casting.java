package OOPS;

public class casting {

	public static void main(String args[]) {
		int n = 16;
		// Widening (Implicit) Up-Casting: Automatic conversion from a smaller type to
		// larger type. No data loss
		double d = n;

		// Narrowing (Explicit)/down-Casting: Manual conversion from a larger type to a
		// smaller type. Requires a cast operator ()
		// and can lead to data loss if the larger value doesn't t in the smaller type
		int a = (int) d;

	}
}
