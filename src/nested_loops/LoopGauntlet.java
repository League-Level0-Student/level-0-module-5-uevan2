package nested_loops;

import javax.swing.JOptionPane;

public class LoopGauntlet {
	public static void main(String[] args) {
		
		//new loop 1
		String printA = "1. \n";
		for(int a = 0; a<=100; a++) {
			printA = printA + ", "+a;
			if(a%5==0) {
				printA = printA + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, printA);
		
		//new loop 2
		String printB = "2. \n";
		for(int b = 100; b>=0; b--) {
			printB = printB + ", "+b;
			if(b%5==0) {
				printB = printB + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, printB);
		
		//new loop 3
		String printC = "3. \n";
		for(int c = 2; c<=100; c = c+2) {
			printC = printC + ", "+c;
			if(c%5==0) {
				printC = printC + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, printC);
		
		//new loop 4
		String printD = "4. \n";
		for(int d = 1; d<=99; d = d+2) {
			printD = printD + ", "+d;
			if(d%5==0) {
				printD = printD + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, printD);
		
		//new loop 5
		String printE = "5. \n";
		for(int e = 0; e<=500; e++) {
			
			if(e%2==0) {
				printE = printE + ", "+e+" is even";
			}
			
			if(e%2!=0) {
				printE = printE + ", "+e+" is odd";
			}
			
			if(e%12==0) {
				printE = printE + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, printE);
		
		//new loop 6
		String printF = "6. \n";
		for(int f = 0; f<=777; f = f +7) {
			printF = printF + ", "+f;
			if(f%5==0) {
				printF = printF + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, printF);
		
		//new loop 7
				String printG = "7. \n";
				int counter =0;
				for(int g = 2004; g<=2018; g++) {
					
					printG = printG + "in "+g+" I was "+counter+" years old \n";
					
					counter++;
				
				}				
				printG = printG +"In 2019 I'm turning 15 years old";
				JOptionPane.showMessageDialog(null, printG);
		//new loop 8
		String printHI = "Nested For-Loops \n1. \n";
		for(int h = 0; h<=2; h++) {
			for(int i = 0; i<=2; i++) {
				
			printHI = printHI + h+" "+i+"\n";
			}

		}
		JOptionPane.showMessageDialog(null, printHI);
	
		//new loop 9
				String printJ = "2. \n";
				for(int j = 1; j<=9; j++) {
					printJ = printJ + j+" ";
					if(j%3==0) {
						printJ = printJ + "\n";
					}
				}
				JOptionPane.showMessageDialog(null, printJ);
				
		//new loop 10
		String printLM = "3. \n";
		for(int l = 0; l<=90; l+=10) {
			for(int m = 1; m<=10; m++) {
						
						
				printLM =  m+" ";
				System.out.print((l+m)+" ");
			}
			printLM = printLM +"\n";
			System.out.println();
		}
				
				
		//new loop 11
		for(int n = 0; n<=6; n++) {
			for(int o = 0; o<n; o++) {
						
				System.out.print("*"+" ");
						
			}
		System.out.println();
		}
	}
}
