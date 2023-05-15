package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	
		public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have

String dimes = JOptionPane.showInputDialog("how many dimes do you have?");

int cents = Integer.parseInt(dimes);
		// Tell them how many cents they have (hint multiply by 10)
int centy = cents*10;

JOptionPane.showMessageDialog(null,"you have " + centy + " cents in total." );

		// Ask the user how tall they are (inches)

String inches = JOptionPane.showInputDialog("how tall are you in inches?");
int height = Integer.parseInt(inches);
// If they are shorter than 36 inches, tell them to eat their Wheaties

if (height<36) {
	JOptionPane.showMessageDialog(null, "be sure to eat your Wheaties!");
} else if (height>35) {
	JOptionPane.showMessageDialog(null, "YAYAYAYAYAYAY");
}


		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console

for(int i = 0; i<30; i+=3) {
	System.out.println(i);
}





		}

		void skill3() { // Get a random number that is less than 20 and print it to the console

Random ran = new Random();
 int nummy = ran.nextInt(20);

		// Get another random number that is less than 10 and print it to the console
 Random rayn = new Random();
 int nummys = rayn.nextInt(10);

int num = nummy - nummys;

		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
JOptionPane.showMessageDialog(null, "your two numbers are: " + nummy + " and " + nummys);
JOptionPane.showMessageDialog(null, "the difference between them is: " + num);

		}

		void skill4() { // In a pop-up, ask the user for the city they live in

String city = JOptionPane.showInputDialog("what city do you live in?");

		// If they answered "San Diego", tell them they live in America's Finest City

if(city.equalsIgnoreCase("san diego")) {
	JOptionPane.showMessageDialog(null,  "you live in the world's finest city");
} else {
	JOptionPane.showMessageDialog(null, "well, you better get packing and move to San Diego!");
	
	
}

		// Otherwise, tell them to move to San Diego



		// Create a variable - cars - and initialize it to the number of cars your family has. 
// If there are 0 cars, use a pop-up to display, "I bet you use public transportation."

int cars = 2;

		// If there is 1 car, use a pop-up to display the make/model of the car



		// If there is more than 1 car, use a pop-up to display how many wheels the 
		// cars have between them.

if (cars>1) {
	JOptionPane.showMessageDialog(null, "the number of wheels on the cars combined are 8 wheels.");
}


		}

		void skill5() { // In a pop-up, ask the user for the name of their school

String school = JOptionPane.showInputDialog("what school do you go to?");


		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.

JOptionPane.showMessageDialog(null, school + " is a fantastic school! you are lucky to be there!");

		}
		}


