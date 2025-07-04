package firstDemo;

import java.util.Scanner;

public class switchCase {

	// write a program to print month name using switch
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// code format   ctrl+shift+F (to look scrip neat and clean)
		System.out.println("which month you want?");
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); // get value in integer    n=15
		String name = sc.nextLine();  //get vale in string form.
		
				
		switch (n) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("Sepetmber");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("NOvember");
			break;
		case 12:
			System.out.println("December");
			break;

		default:
			System.out.println("Incorrect month no.");
		}

	}

}
