import java.util.Random;

import javax.swing.JOptionPane;

public class RandomGenarater {
	public static void main(String[] args) {
		int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 0,1,2 "));
		
		Random s = new Random();
		int i = s.nextInt(3);
		System.out.println(i);
		
		if (input == i) {
			JOptionPane.showMessageDialog(null, "You got it right");
			
		}else {
			JOptionPane.showMessageDialog(null, " You got it wrong");
		}
	}
}
