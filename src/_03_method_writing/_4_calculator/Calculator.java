package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		// 3) Call the correct method depending on what option the user chooses
double num = 0;
		
		if (task==3) {
			num = add(number1, number2);
result(num);		
		} else if (task==2) {
			num = subtract(number1, number2);
		result(num);
		} else if (task==1) {
			num = multiply(number1, number2);
		result(num);
		} else if (task==0) {
			num = divide(number1, number2);
	result(num);
		}
		

		// 4) Call the result() method and put the answer in a pop-up

		
		
	}
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	 public static double add( int number1 , int  number2) {
		 double nummy = number1 + number2;
return nummy;	
	 }
	 public static double multiply( int number1 , int  number2) {
		 double nummy = number1 * number2;
	 return nummy;
	 }
	 public static double subtract( int number1 , int  number2) {
		  double nummy = number1 - number2;
	 return nummy;
	 }
	 public static double divide( int number1 , int  number2) {
		   double nummy = number1 / number2;
	 return nummy;
	 }
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;

	 public static void result(double nummy) {
	 JOptionPane.showMessageDialog(null, "your answer is: " + nummy);
	 }
}
