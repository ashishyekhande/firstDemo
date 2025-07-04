package firstDemo;

import java.util.Scanner;

public class Loops {

	// local vaibale , int n, string src, double d ;
	//scope within - class
	
	public static Scanner sc  ;
	
	
	
	// reverse number and checkif palindrom or not ,    12321
	public static void ReverseNumber() 
	{
		
		// Instance variable --  > scope within method 
		// TODO Auto-generated method stub
		
		// while -> entry control  , if condition is false it instantly close execution
		// do while -> exit control , atleast execute ones.
		// for each --> no exit condition 
		
		
		System.out.println("Enter Number");
		System.out.println();
		
		//Scanner sc = new Scanner(System.in);
		
		sc= new Scanner(System.in);
		int n= sc.nextInt();
		int tochekPalindrome= n;  // palindrom   123454321 
		int rev =0 ; int n1;
  		while(n>0) //356  // first condition then execute 
		{
			n1=n%10;    		// 356%10  = .6  -->n1 =6   // n1=35%10= 0.5 --> n1 =5   // 3%10=0.3 --> n1=3
			rev =rev*10+n1;  	// 0=0*10+6= 6 --> rev =6   // 6*10+5= 60+5 --> rev=65  // 65*10+3 -->rev =653
			n= n/10;  			// 356/10 =35.6 --> n=35 	// n=35/10 =3.5--> n=3       // 3/10= 0.3 --> n=0
			
		}
		System.out.println("Reverse Number "+rev);
		
		if(rev==tochekPalindrome)//  653=356  --> false
		{
			System.out.println("Number is palindrome");
		}
		else // false -> then else will execute
		{
			System.out.println("Number is not palindrome");
		}
	}
	
	
	public static void ReverseString() {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
			
		sc = new Scanner(System.in);
		System.out.println();
		String s = sc.next();
		
		String checkpalindrome =s;    // mom  String s= mom --> length =3 , // indexing starts from 0 , length count start from 1,
		String rev="";
		for(int i =s.length()-1;i>=0;i--) //    for( i = 2; i>=0 ;i--) 
		{
			rev =rev+s.charAt(i);  // ""+m --> rev=m;   //   m+o -->rev =mo  // rev =mo+m --> rev = mom
		}
		
		System.out.println("Reverse String " +rev);
		
		if(rev.equalsIgnoreCase(checkpalindrome))
		{
			System.out.println("word is palindrome");
		}
		else
		{
			System.out.println("word is not palindrome");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ReverseNumber();
		//ReverseString();
		foreachloop();
		

	}


	private static void foreachloop() {
		// TODO Auto-generated method stub
		//int b[]= new int[5];  // creating blank array of 5
		                		  
		int numbers[] = {1, 2, 3, 4, 5};
		System.out.println(numbers.length  + " postion at  3 " +numbers[3]);
		
		for (int n : numbers) 
		{
			System.out.println(n);
		}
		
		
		
	}

}
