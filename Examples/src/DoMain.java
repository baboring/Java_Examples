import java.sql.Time;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Examples.DlgPickNumberGame;
import Examples.TimeCalculator;

public class DoMain {

	public static void main(String[] args) {

	    DoMain main = new DoMain();
	    
	    //(new DlgPickNumberGame()).DoRun();

	    (new TimeCalculator()).DoRun();
	    
//	    /main.Example_InputOutput();
	    //main.Example_Deposit();
	    //main.Example_DepositDialog();
	    //main.Example1();
	    //main.Example_String();
	    
	    //(new Example_InputConsole()).DoRun();
	}
	
	
	// Deposit & Interest
	void Example_DepositDialog()
    {

		String input;
		double deposit = 0;
    	int total = 0;
    	final double interest = 0.05f;
    	double interestMonth = interest / 12;
    	
       	input = JOptionPane.showInputDialog("How much money do you deposit?");
		deposit = Double.parseDouble(input);
		
		// Get number of year to set.
       	input = JOptionPane.showInputDialog("How many years do you want?");
		total = Integer.parseInt(input);
		
		String output = "----------------------------------------------\n";
		output += String.format("Deposit : $%4.2f / ",deposit);
		output += String.format("Interest : %1.0f%% / ",interest * 100);
		output += String.format("During : %d Year(s)\n",total);
		output += "-----------expected monthly balance --------------\n";
		
	    for( int i=0;i<total * 12;++i) 
	    {
	    	deposit += deposit * interestMonth;
	    	String order = (i < 1) ? "st" : (i < 2) ? "nd" : (i < 3) ? "rd" : "th";
	    	output += String.format("%d%s month - $%4.2f%n",i+1, order, deposit);
	    	if( i % 12 == 11)
	    		output += "----------------------------------------------\n";
	    }	
	    JOptionPane.showMessageDialog(null, output);
    }
	
	void Example_String() {
		
		System.out.println("Hello World".length());
		
		String city = "San Francisco";
		int stringLength = city.length();
		char oneChar = city.charAt(0);
		String upperCity = city.toUpperCase();
		String lowerCity = city.toLowerCase();
		
		System.out.println(city);
		System.out.println(stringLength);
		System.out.format("%c\n",oneChar);
		System.out.println(upperCity);
		System.out.println(lowerCity);
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
	
	
	
	
	
	void Example_Performance() 
	{
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
				
	}
	
	void Example_Print() {
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
		
		
	    // Array
	    int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
	      Arrays.sort(array);
	      int index = Arrays.binarySearch(array, -2);
	      System.out.println("Found -3 @ " + index);
	}

}
