import org.jointheleague.graphical.robot.Robot;

public class Cube {
public static void main(String[] args) {
	Robot cube=new Robot("mini");
	cube.setSpeed(30);
	cube.penDown();
	cube.move(90);
	cube.turn(90);
	cube.move(90);
	cube.turn(90);
	cube.move(90);
	cube.turn(90);
	cube.move(90);
	cube.turn(90);
	cube.penUp();
	cube.move(45);
	cube.penDown();
	cube.turn(90);
	cube.move(45);
	cube.turn(90);
	cube.move(90);
	cube.turn(90);
	cube.move(90);
	cube.turn(90);
	cube.move(90);
	cube.turn(90);
	cube.move(45);
	cube.penUp();
	cube.move(-45);
	cube.penDown();
	cube.turn(-45);
	cube.move(64);
	cube.penUp();
	cube.turn(90);
	cube.move(64);
	cube.penDown();
	cube.turn(270);
	cube.move(64);
	cube.penUp();
	cube.turn(135);
	cube.move(90);
	cube.turn(45);
	cube.penDown();
	cube.move(64);
	cube.penUp();
	cube.turn(45);
	cube.move(90);
	cube.turn(135);
	cube.penDown();
	cube.move(64);
	
	
	
	
	
	
	
	
	
}
}
