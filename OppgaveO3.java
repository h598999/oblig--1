package nohvldat100;

import static javax.swing.JOptionPane.*;


public class OppgaveO3 {

	public static void main(String[] args) {
	String tall = showInputDialog("Skriv inn eit tall");
		int n = Integer.parseInt(tall);
		int fakultet =1;
	
		for (int i=1; i<=n; i++) {
		fakultet = fakultet*i;
		}
		
		System.out.print(fakultet);
			
	
		

	
}
}

