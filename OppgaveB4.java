package nohvldat100;

import static javax.swing.JOptionPane.*;


public class OppgaveB4 {

		public static void main(String[] args) {
			String lønn = showInputDialog("Skriv inn årslønn");
			double årslønn = Double.parseDouble(lønn);
			double a = (årslønn*0.0093);
			double b = (årslønn*0.0241);
			double c = (årslønn*0.1152);
			double d = (årslønn*0.1452);
				if (årslønn <= 164100)
					if (0<=årslønn)
			
				System.out.println("Trinnskatten blir 0 kroner");
			if (årslønn<=230950)	
				if (164100<årslønn)
					
					
		System.out.println("Trinnskatten blir på "+a+ " kroner");
			if (årslønn<=580650&&230950<årslønn)
				
				System.out.println("Trinnskatten blir på "+b+ " kroner");
			
			if (årslønn<=934050&&580651<årslønn)
				
				System.out.println("Trinnskatten blir på "+c+ " kroner");
			else
				System.out.println("Trinnskatten blir på "+d+ " kroner");
				
				
				
			
		}

	}

