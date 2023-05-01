
package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotStuff {

	public static void main(String[] args) {
		
		Robot rob = new Robot();
	rob.hide();
		String shape = JOptionPane.showInputDialog("what shape do you want to make? put the number corresponding to the shape. 1. square; 2. triangle; 3. circle");
	
	if (shape.equals("1")) {
	   String color1 = JOptionPane.showInputDialog("what color do you want? type the number corresponding to the color. 1. red; 2. blue; 3. green");
		if (color1.equals("1")) {
			rob.setPenColor(252, 0, 0);
			drawSquare(rob);
		} else if (color1.equals("2")) {
	rob.setPenColor(0,0,252);		
		drawSquare(rob);
		} else {
			rob.setPenColor(0, 252, 0);
			drawSquare(rob);
		}
	
		
		} else if (shape.equals("2")) {
			   String color1 = JOptionPane.showInputDialog("what color do you want? type the number corresponding to the color. 1. red; 2. blue; 3. green");
				if (color1.equals("1")) {
					rob.setPenColor(252, 0, 0);
					drawTriangle(rob);
				} else if (color1.equals("2")) {
			rob.setPenColor(0,0,252);		
				drawTriangle(rob);
				} else {
					rob.setPenColor(0, 252, 0);
					drawTriangle(rob);
				}
	
		} else if (shape.equals("3")) {
			   String color1 = JOptionPane.showInputDialog("what color do you want? type the number corresponding to the color. 1. red; 2. blue; 3. green");
				if (color1.equals("1")) {
					rob.setPenColor(252, 0, 0);
					drawCircle(rob);
				} else if (color1.equals("2")) {
			rob.setPenColor(0,0,252);		
				drawCircle(rob);
				} else {
					rob.setPenColor(0, 252, 0);
					drawCircle(rob);
				}
				
		}
	
	}
	
	public static void drawSquare(Robot rob) {
		rob.setSpeed(10);	
		rob.moveTo(100, 550);
			rob.penDown();
		rob.move(500);
		rob.turn(90);
		rob.move(500);
		rob.turn(90);
		rob.move(500);
		rob.turn(90);
		rob.move(500);
	}
	public static void drawTriangle(Robot rob) {
		rob.setSpeed(10);	
		rob.moveTo(100, 550);
			rob.penDown();
		rob.turn(45);
			rob.move(500);
		rob.turn(90);
		rob.move(500);
		rob.turn(135);
		rob.move(704);
		
	}
	public static void drawCircle(Robot rob) {
		rob.setSpeed(100);	
		rob.moveTo(150, 300);
		rob.penDown();
		for( int i = 0; i<181; i++) {
			rob.move(10);
			rob.turn(2);
		}
		
	}
	


}
