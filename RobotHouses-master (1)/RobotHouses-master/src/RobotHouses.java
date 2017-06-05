import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class RobotHouses {
	public static void main(String[] args) {
		Robot tom = new Robot();
		
		tom.miniaturize();
		tom.moveTo(15, 550);
		tom.setSpeed(10);
		
		Random Randy  = new Random();
		int num = Randy.nextInt(100-500); 
		
		
		for (int i = 0; i < 10; i++) {
			tom.setPenColor(228, 0, 144);
			tom.penDown();
			tom.move(num);
			tom.turn(90);
			tom.move(20);
			tom.turn(90);
			tom.move(num);
			tom.turn(270);
			tom.setPenColor(0, 190, 118);
			tom.move(20);
			tom.turn(270);
			}
	}
}

