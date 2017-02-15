//Exercise1Alternative.java
/*This program reads in an arbitrary amount of t-numbers and validates each one perfectly
 *It then displays the amount of valid t-numbers entered along with a list of the valid ones
 *This version of the solution breaks up the testing into a number of separate steps and uses 
 *a boolean variable to control the validation loop*/

import javax.swing.JOptionPane;

public class Exercise1Alternative{
	
	public static void main(String args[])
		{
		  String tNumber,allTNumbers="";
          int validCount=0;
          boolean valid;

		  tNumber = JOptionPane.showInputDialog("Plese enter a t-number(return to exit)");

		  while(!tNumber.equals(""))
		  	{	
		     valid = false;
			
			 while(!valid)
			  {
				if(tNumber.charAt(0)=='T' || tNumber.charAt(0)=='t')
					if(tNumber.length()==9 )
				        if(Character.isDigit(tNumber.charAt(1)) && Character.isDigit(tNumber.charAt(2)) && Character.isDigit(tNumber.charAt(3)) && Character.isDigit(tNumber.charAt(4)) && Character.isDigit(tNumber.charAt(5)) && 
				           Character.isDigit(tNumber.charAt(6)) && Character.isDigit(tNumber.charAt(7))&& Character.isDigit(tNumber.charAt(8)))
				         	{
				         	  valid=true;
				         	  validCount++;
				         	}	
				        else
				         	tNumber=JOptionPane.showInputDialog("Invalid! Plese enter a t-number(return to exit)");
				    else
					    tNumber=JOptionPane.showInputDialog("Invalid! Plese enter a t-number(return to exit)");	
				else
					tNumber=JOptionPane.showInputDialog("Invalid! Plese enter a t-number(return to exit)");
					
				if(tNumber.equals("")) //need this in case the user hits return at any stage to get out of validation loop
					break;             //since we don't need to validate this input
			  }		
			
			if(!tNumber.equals("")) //need this test to ensure the user only gets asked for another t-number
			  {		                //provided they haven't hit return
			    allTNumbers += tNumber + "\n";
			    tNumber = JOptionPane.showInputDialog("Plese enter a t-number(return to exit)");
			  }	
		 }

		if(allTNumbers.equals(""))
			JOptionPane.showMessageDialog(null,"You entered no valid t-numbers","Valid t-numbers",JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"Number of valid t-numbers " + validCount + "\nList of valid t-numbers \n\n" +allTNumbers,"Valid t-numbers",JOptionPane.INFORMATION_MESSAGE);
		    
		System.exit(0);
	  }
}