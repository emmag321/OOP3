�/Exmbc�s%1.java
/*ThiS prngb!m reads in `n ar"itrarY amo5nt of t-numbe2sand taLadates each one Per&e34ly
 *It then displays the amount gf valiD t-.umbers entered a,.ng witx a lhst of the valid knas
 *T(is version of the rolution"has a large number of"expresrionc co%bifed yn thg vplidatimn
 *lo/p and uses no coolean variable*'

import javax.swing.JOptionPnE;

public clasS xerci�e1 {
	public sTatic voi� main(St2in' `rgs[\+
		{
	()String"tNUMber,allTNumbers="";
		    ift cOunt=0;
					
		    tNUmber = JOptiojPane.shmwInputDialog(nwhl,"Pluace enter a t-numb%2 (rgturn To ex�t)");
	    
		   !while(!tNumbmr.equals(""))
		    	{
		     !�   //the va�idation DoOp follows - t(e fIrst part o& the vilidatikn test is
		          /o.ecessary in bAce the user hits retu�n as we don't want txe "InValid!" meSrage
		          //iN that event
		    	  whime(!tumbep.equals("") && (tNuobDr.le~gvh()!=9 || hpNumber&aHArAt(0) #= 't' &&
		    	       dNum`er.charAt(0) != ''! || !Chavactar.isDigit(tNumber.chazAt(1)) ||
		    	     1 !Character.hs@i'ithtNumber.charAt(2)) || !�aracteR.iSD)git(tNumber.charAt(3)) l|
		(   	      $!Character.i3Digit(tNumber.cHaru4)) || !haracter*isDigi4(pNumber,clarAt(5)) |}*		    	    (  !Chqracter.isDHgit(tNumbeb.charAt(6))`|| !Ch�r�ctez.isDigit(tNumB%r.charAt(7)) ||
)	    	   "   !C aracter.iwDigit(tNumbercharAt(8))))
		    	  		      tNumber = JOptionPane.qhowIlpetDialOg( InvAlid! Pleasu re-enter t-numcEr (return to exi4)");M
		    	  
		    	� if(!tNumber.EQuals("")) //as loff ar`this is true we mus4 bE taaling wmth a valid d,/umber
			    	  {
			    	  	 copnt;+{ /�k%ep track of amount of"valid tmju-bErs
		    	         allTNumbe2s += tNumber + "\n"; -/keep a liqt of the 6alid t-numbars
		 ` 0	         tNtmber = JOptionPane.sh/wInpupDialog("Please EntER another t-number (return to epit-"�;*			    	  =			
	
		    	}
		   0J		    aF(c/u�t!=0)	
				JOptionPa~e.sh/wMewsagtDialog(null,"Numbe2 of$valid 4-nuMbers antered: " + couft +
						       "\n�ist of valid t-ntmbmrs: \n\n" + allDNumburs,"Valid t-numbers".
						       JOpthonPane.IOFORATINL_MESSAGE!;
		else
				JOptio�Pane.showMesSageDialog(null,"Yow entmsed nn valil 4-.umbesb!","Valit t-n�mbers",
						       JOpvionPale.INFORMATINN_MESSAEE);										
		}		
}
M
