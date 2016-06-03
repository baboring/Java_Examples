package Examples;

import javax.swing.JOptionPane;

public class DlgSafeInput {
	
	private String value;
	private String input;
	
	// check number or not
	private boolean isDoouble(String val) {
		try {
			Double.parseDouble(val);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	private boolean isInteger(String val) {
		try {
			Integer.parseInt(val);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	// Get Integer number
	public int GetInteger(String msg) {
		
		while(true){
			input = JOptionPane.showInputDialog(null, msg);
			if(isInteger(input))
				return Integer.parseInt(input);
			// error....
			JOptionPane.showMessageDialog(null, "It's wrong type, please again!!");
		}
	}
	
	// Get Double number
	public double GetDouble(String msg) {
		
		while(true){
			input = JOptionPane.showInputDialog(null, msg);
			if(isDoouble(input))
				return Double.parseDouble(input);
			// error....
			JOptionPane.showMessageDialog(null, "It's wrong type, please again!!");
		}
	}
	
	// Get String input
	public String GetString(String msg) {
		
		input = JOptionPane.showInputDialog(null, msg);
		return input;
	}
}
