package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class RobotStuff {

	public static void main(String[] args) {
		
		Robot rob = new Robot();
	
		drawTriangle(rob);
		
		
	
		
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
		rob.move(500);
		rob.turn(300);
		rob.move(500);
		rob.turn(45);
		rob.move(500);
		
	}



}
