package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {

		int counter = 1;
		String answer = " ";
		boolean ifPrime = false;
		String number = JOptionPane.showInputDialog("choose a number and you can check if it's a prime number");
		int x = Integer.parseInt(number);

		for (int y = 2; y < x; y++) {

			if (x % y == 0) {

				if (counter % 4 == 0) {
					answer = answer + ", " + y + "\n";
				}

				else {
					answer = answer + ", " + y;
				}
				ifPrime = true;
				counter++;

			}

		}

		if (ifPrime == false) {
			JOptionPane.showMessageDialog(null, x + " is prime");
		}

		else {
			JOptionPane.showMessageDialog(null, x + " is not prime");

		}

		if (ifPrime == true) {
			JOptionPane.showMessageDialog(null, "its divisble by " + answer);
		}

	}

}
