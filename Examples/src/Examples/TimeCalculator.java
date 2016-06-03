package Examples;

import javax.swing.JOptionPane;

public class TimeCalculator {

	public void DoRun() {
		DlgSafeInput dlgInput = new DlgSafeInput();

		int nTotalSeconds = dlgInput.GetInteger("Please Insert seconds!!");
		
		// calc minutes
		int seconds = nTotalSeconds % 60;
		// calc hours
		int hours = (nTotalSeconds/(60*60)) % 24;
		// calc days
		int days = (nTotalSeconds/(60*60*24)) % 365;
		// calc years
		int years = (nTotalSeconds/(60*60*24*365));
	
		// consist output text
		String output = "";
		if(years > 0)
			output += String.format(" %2d year(s)", years);
		if(output.length() > 0 || days > 0 )
			output += String.format(" %2d day(s)", days);
		if(output.length() > 0 || hours > 0 )
			output += String.format(" %2d hour(s)", hours);
		if(output.length() > 0 || seconds > 0 )
			output += String.format(" %2d second(s)", seconds);	
		
		output = String.format("Total seconds %d is \n %s",nTotalSeconds,output);
		JOptionPane.showMessageDialog(null,output);
	}
}
