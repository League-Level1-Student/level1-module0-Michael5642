package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static	Random object = new Random();
	static Robot steve = new Robot();
	static	int redColor = object.nextInt(255 - 1 + 1) + 1;
	static	int greenColor = object.nextInt(255 - 1 + 1) + 1;
	static	int blueColor = object.nextInt(255 - 1 + 1) + 1;
	public void run() {
		steve.setSpeed(100);
		steve.setX(0);
		steve.setY(580);
int deci = 0;
String tall = "";
	for (int i = 0; i < 9; i++) {
		redColor = object.nextInt(255 - 1 + 1) + 1;
		greenColor = object.nextInt(255 - 1 + 1) + 1;
		blueColor = object.nextInt(255 - 1 + 1) + 1;
		deci += 1;
		if(deci == 1) {
		tall = "small";	
		}
		else if(deci == 2) {
		tall = "medium";
		}
		else if(deci == 3) {
		tall = "large";
		}
		else{
		tall = "medium";
		}
		houseBuilder(tall,i);
		if(deci > 3) {
			deci = 0;
		}
	}
	
	
	
	
	
	
	
	
	}
	static void houseBuilder(String height, int houseType) {
		int houseHeight = 0;
		steve.penDown();
		steve.setPenColor(redColor,greenColor,blueColor);
		if (height.equals("small")) {
			houseHeight = 60;
		}
		else if (height.equals("medium")) {
			houseHeight = 120;
		}
		else {
			houseHeight = 250;
		}
		steve.move(houseHeight);
		if(houseType % 2 == 0) {
			steve.turn(90);
			steve.move(30);
			steve.turn(90);
		}
		else {
			steve.turn(45);
			steve.move(15);
			steve.turn(90);
			steve.move(15);
			steve.turn(45);
		}
		steve.move(houseHeight);
		steve.turn(-90);
		steve.setPenColor(100,150,100);
		steve.move(30);
		steve.turn(-90);
	}
}
