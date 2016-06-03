package Examples;
import javax.swing.JOptionPane;

public class DlgPickNumberGame {

	String msg;
	int life;
	
	public DlgPickNumberGame()
	{
		life = 3;
	}
	
	String GetMessage() 
	{
		
		this.msg = "" + 
		"------------------" + "\n" +
		"Left Chances : " + life + "\n" +
		"------------------" + "\n" +
		"";
		
		return this.msg;
	}
	
	// pick the number
	public void DoRun()
	{
		DlgSafeInput dlgInput = new DlgSafeInput();

		// input name, subject, grade
		String szName = dlgInput.GetString("Please Insert Name!");
		String szSubject = dlgInput.GetString("Please Insert Subject!");
		int nMark = dlgInput.GetInteger("Please Insert Grade!!");
		
		String szGrade;
		switch(nMark / 10) {
		case 6 :
			szGrade = ((nMark%10 < 5) ? "D" : "D+");
			break;
		case 7 :
			szGrade = ((nMark%10 < 5) ? "C" : "C+");
			break;
		case 8 :
			szGrade = ((nMark%10 < 5) ? "B" : "B+");
			break;
		case 9 :
			szGrade = ((nMark%10 < 5) ? "A" : "A+");
			break;
		case 10 :
			szGrade = "A+";
			break;
		default:
			szGrade = "F";
			break;
		}
		
		String Output = String.format("Name : %s\n",szName)
			+ String.format("Subject : %s\n",szSubject)
			+ String.format("Mark : %d , %s\n",nMark,szGrade);
		
		
		JOptionPane.showMessageDialog(null, Output);
		
	}
	

}
