package Examples;

import java.util.Scanner;

public class Example_InputConsole {
	// calc
	public void DoRun()
    {
		double a = 5;
		int b = 2;
		
		System.out.println(a / b);
		System.out.println(a / 2);
		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
		
		float deposit = 0;
    	int total = 0;
    	final float interest = 0.05f;
    	float interestMonth = interest / 12;
    	
		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		// Get amount of money to deposit.
		System.out.println("How much money do you deposit? ");
		deposit = keyboard.nextInt();
		
		// Get number of year to set.
		System.out.println("How many years do you want? ");
		total = keyboard.nextInt();
		
		keyboard.close();
		System.out.println("-------------------------");
		System.out.format("Deposit : $%4.2f / ",deposit);
		System.out.format("Interest : %1.0f%% / ",interest * 100);
		System.out.format("During : %d Year(s)\n",total);
		System.out.println("-------------------------");
		
	    for( int i=0;i<total * 12;++i) 
	    {
	    	deposit += deposit * interestMonth;
	    	String order = (i < 1) ? "st" : (i < 2) ? "nd" : (i < 3) ? "rd" : "th";
	    	System.out.format("%d%s month - $%4.2f%n",i+1, order, deposit);
	    	if( i % 12 == 11)
	    		System.out.println("-------------------------");
	    }	

    }
}
