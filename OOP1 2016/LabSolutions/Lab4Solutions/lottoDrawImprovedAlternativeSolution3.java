//lottoDrawImproved.java
/*This program generates 7 random numbers between 1 and 42 making sure they are different 
 *code kindly provided by Alen Lovric, 1st year computing 2013*/


import javax.swing.JOptionPane;

public class lottoDrawImprovedAlternativeSolution3{
	public static void main(String args[])
	{
		int number1=0, number2=0, number3=0, number4=0, number5=0, number6=0, number7=0,
			counter=0;
		String outText="The lotto numbers are\n\n", numbersList="", header="Lotto Numbers",
				counterText="\n\nRounds required to generate: ";
		
		while ((number1==number2||number1==number3||number1==number4||number1==number5||number1==number6||number1==number7)||
			   (number2==number3||number2==number4||number2==number5||number2==number6||number2==number7)||
			   (number3==number4||number3==number5||number3==number6||number3==number7)||
			   (number4==number5||number4==number6||number4==number7)||
			   (number5==number6||number5==number7)||
			   (number6==number7))
			
		   {	
			number1=(int)(Math.random()*42+1);		
			number2=(int)(Math.random()*42+1);	
			number3=(int)(Math.random()*42+1);	
			number4=(int)(Math.random()*42+1);
			number5=(int)(Math.random()*42+1);
			number6=(int)(Math.random()*42+1);
			number7=(int)(Math.random()*42+1);
				
			counter++;
		   }
		   		
		numbersList += number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5 + ", " +
			           number6 + ", " + number7;	
		JOptionPane.showMessageDialog(null,outText+numbersList+counterText+counter,
			header,JOptionPane.PLAIN_MESSAGE);
			
		System.exit(0);
	}
}
