package nohvldat100;

import static javax.swing.JOptionPane.*;


public class OppgaveB4 {

		public static void main(String[] args) {
			String l�nn = showInputDialog("Skriv inn �rsl�nn");
			double �rsl�nn = Double.parseDouble(l�nn);
			double a = (�rsl�nn*0.0093);
			double b = (�rsl�nn*0.0241);
			double c = (�rsl�nn*0.1152);
			double d = (�rsl�nn*0.1452);
				if (�rsl�nn <= 164100)
					if (0<=�rsl�nn)
			
				System.out.println("Trinnskatten blir 0 kroner");
			if (�rsl�nn<=230950)	
				if (164100<�rsl�nn)
					
					
		System.out.println("Trinnskatten blir p� "+a+ " kroner");
			if (�rsl�nn<=580650&&230950<�rsl�nn)
				
				System.out.println("Trinnskatten blir p� "+b+ " kroner");
			
			if (�rsl�nn<=934050&&580651<�rsl�nn)
				
				System.out.println("Trinnskatten blir p� "+c+ " kroner");
			else
				System.out.println("Trinnskatten blir p� "+d+ " kroner");
				
				
				
			
		}

	}

