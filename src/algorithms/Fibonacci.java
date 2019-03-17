package algorithms;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
		int one = 0;
		int two = 1;
		int three = 0;
		
		String fibonacci = " ";
		
		for(int x = 1; x <24; x++) {
			
			fibonacci = fibonacci + ", "+one;
			three = two;
			two = one + two;
			one = three;

		}
		JOptionPane.showMessageDialog(null, fibonacci);
	}

}
