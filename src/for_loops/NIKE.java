package for_loops;

import org.jointheleague.graphical.robot.Robot;

public class NIKE {
	public static void main(String[] args) {
		Robot jah = new Robot();
		jah.penDown();
		jah.setSpeed(100);
			int sides=6;
			int angle=360/sides;
			
		jah.turn(90);
		jah.move(200);
		jah.turn(180);
		jah.move(80);
		jah.turn(-420);
		

	}
}
