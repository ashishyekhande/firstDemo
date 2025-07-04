package firstDemo;

import java.util.Scanner;

//reverse the number and check palindrome
public class palindromeNo {

	public static void palindromenumber() {

		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int originalNo = n;

		int d, rev = 0;
		// n= 756 //1234321
		while (n > 0) {
			d = n % 10; // d=756 % 10 ->75.6 -->6 d=75%10-> 7.5 ->5 d=7%10 ->0.7 -> 7
			rev = rev * 10 + d; // rev = 0*0+6 -> 6 rev = 6*10+5 ->65 rev = 65*10+7 -->657
			n = n / 10; // n= 756/10 ->75.6 -->75 n=75/10= 7.5 -> 7 n =7/10 =0.7 --> 0

		}

		if (rev == originalNo) {
			System.out.println("my number is palindrome");
		} else {
			System.out.println("number is not palindrome");
		}

	}

	public void reverstring() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");

		sc = new Scanner(System.in);
		System.out.println();
		String s = sc.nextLine();

		String originalString = s; // mom String s= mom --> length =3 , // indexing starts from 0 , length count
									// start from 1,
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) // for( i = 2; i>=0 ;i--)
		{
			rev = rev + s.charAt(i); // ""+m --> rev=m; // m+o -->rev =mo // rev =mo+m --> rev = mom
		}

		System.out.println("Reverse String " + rev);

		if (rev.equalsIgnoreCase(originalString)) {
			System.out.println("word is palindrome");
		} else {
			System.out.println("word is not palindrome");
		}
	}

	public static void main(String[] args) {

		// IV why we write public static void main
		// public --> javacompliler should it from anywhere --> access modifier
		// static --> static use to call method without creating object
		// void --> returns nothing

		// TODO Auto-generated method stub

		palindromeNo p = new palindromeNo();
		// palindromenumber();
		//p.reverstring();
		foreach();

		// my name is ashish
		// ym eman si hsihsa

	}

	public static void foreach() {
		// TODO Auto-generated method stub

		int numbers[] = { 8,0,8,7,2,7,4,3};
		System.out.println(numbers.length + " postion at  3 " + numbers[3]);

		for (int n : numbers) {
			System.out.println(n);
			
			if(n==7)
			{
				System.out.println("yes");
				break;
			}
			
		}
	}

}
