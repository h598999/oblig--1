package nohvldat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveB5 {

	public static void main(String[] args) {
		int a = Integer.MIN_VALUE;
			
	

		
		for ( int studentnummer=1; studentnummer<=10; studentnummer++) {
			
			
		String poengsum = showInputDialog("Skriv inn poengsum");
		a = parseInt(poengsum);
			
			if (0 > a || a > 100) {
				showMessageDialog(null,"ugyldig poengsum, skriv inn på nytt");
				studentnummer --;	}
		
					
						
				
					
		if (a<=39&&0<=a)
			System.out.println( "Student " + studentnummer + " Karakter F");
		if (a<=49&&40<=a)
				System.out.println("Student " + studentnummer + " karakter E");
		
		if (a<=59&&50<=a)
				System.out.println("Student " + studentnummer + " Karakter D");
		if (a<=79&&60<=a)
				System.out.println("Student " + studentnummer + " Karakter C");
		
		if (a<=89&&80<=a)
				System.out.println("Student " + studentnummer + " Karakter B");
		if (a<=100&&90<=a)
				System.out.println("Student " + studentnummer + " Karakter A");
	} 
	
			
				
		
	

} 
}



		
		
		
	




