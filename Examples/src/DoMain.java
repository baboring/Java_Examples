import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class DoMain {

	public static void main(String[] args) {
		
		
		double a = 5;
		int b = 2;
		
		System.out.println(a / b);
		System.out.println(a / 2);
		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
	    
	    DoMain main = new DoMain();
	    
	    main.Example_InputOutput();
	}
	
	void Example_InputOutput()
    {
		String name; 		// to hold name
		int hours; 			// Hours worked
		float payRate;		// Hourly pay rate
		float grossPay;	// Gross pay
		
		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		// Get the user's name.
		System.out.println("What's your name ?");
		name = keyboard.nextLine();
		
		// Get the number of hours worked this week.
		System.out.println("How many did you work this week? ");
		hours = keyboard.nextInt();
		
		// Get user's hourly pay rate.
		System.out.println("What is your houly pay rate?");
		payRate = keyboard.nextFloat();
		
		grossPay = payRate * hours;
		
		// display resulting information
		System.out.println("Hello, " + name);
		System.out.println("Your Gross pay is $"+grossPay);
			    
	    keyboard.close();
    }
	
	void Example2()
    {
		float deposit = 1000;
    	int total = 3;
	    for( int i=0;i<total;++i) 
	    {
	    	deposit += deposit * 0.05f;
	    	String order = (i < 1) ? "st" : (i < 2) ? "nd" : (i < 3) ? "rd" : "th";
	    	System.out.format("%d%s month - %4.4f%n",i+1, order, deposit);
	    }	

    }
	
	void Example1() {
		// 2.2 - 2.3 print & println
		
		/*
		 * Q1 : what is the difference between print & println?
		 *
		 */
		System.out.println("Programming is great fun!!");
		System.out.println("I can't get enough of it");
		
		System.out.print("My name is ");
		System.out.println("Benjamin");
		
		System.out.format("%f\n%n",0.5f);
		
		// Ex # 2.8
		System.out.println("test");
		
		// print currency example
		double e = 10.232;
		System.out.format(Locale.CANADA,"%6.4f",e);
		
		// string compare
		String val = "Hello World";
		String val2 = "hello world";
		Object obj = val;
		
		System.out.println(val.compareTo(val2));
		System.out.println(val.compareToIgnoreCase(val2));
		System.out.println(val.compareTo(obj.toString()));
		
		// substring
		System.out.println("substring 2 : " + val.substring(2));
		
		// Search the last position of a substring
		String szHelloWorld = "Hello World, hello Reader";
		int lastIndex = szHelloWorld.indexOf("Hello");
		int lastIndex2 = szHelloWorld.indexOf("hello");
		
		System.out.format("lastIndex = %d, lastIndex2 = %d\n",lastIndex, lastIndex2);
		
		// Replace & regular express
		System.out.println(szHelloWorld.replace("e", "RP "));
		System.out.println(szHelloWorld.replaceAll("[abeo]", "v"));
		
		
		// Region Match
		String first_str = "welcome to Microsoft";
		String second_str = "I work with Microsoft";
		
		Boolean isMatch = first_str.regionMatches(11, second_str, 12, 9);
		System.out.println("Match : " + isMatch);
		
		// performance check
		long startTime = System.currentTimeMillis();
	    for(int i=0;i<50000;i++){
	         String s1 = "hello";
	         String s2 = "hello"; 
	    }
	    long endTime = System.currentTimeMillis();
	    System.out.println("Time taken for creation" 
	      + " of String literals : "+ (endTime - startTime) 
	      + " milli seconds" );       
	    long startTime1 = System.currentTimeMillis();
	    for(int i=0;i<50000;i++){
	       String s3 = new String("hello");
	       String s4 = new String("hello");
	    }
	    long endTime1 = System.currentTimeMillis();
	    System.out.println("Time taken for creation" 
	      + " of String objects : " + (endTime1 - startTime1)
	      + " milli seconds");
		
	    // Array
	    int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
	      Arrays.sort(array);
	      int index = Arrays.binarySearch(array, -2);
	      System.out.println("Found -3 @ " + index);
	}

}
