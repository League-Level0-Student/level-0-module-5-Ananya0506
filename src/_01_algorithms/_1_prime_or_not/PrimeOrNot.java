package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("enter a number.");
int num = Integer.parseInt(number);
boolean decider = false;
for (int i = num-1; i>1; i--) {
	if (num%i==0) {
		JOptionPane.showMessageDialog(null, "your number is not prime.");
decider = true;
		break;
	
	} 
}
	if (decider == false) {
		JOptionPane.showMessageDialog(null, "your number is prime.");
	}
	
		



}
}
