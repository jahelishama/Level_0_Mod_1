import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	String ball = JOptionPane.showInputDialog("Enter in a question");
	Random magic = new Random();
	int number = magic.nextInt(10);
	if (number ==0) {
		JOptionPane.showMessageDialog(null, "maybe not");
	}else if (number ==1) {
		JOptionPane.showMessageDialog(null, "yes");
	} else if (number ==2) {
		JOptionPane.showMessageDialog(null, "no");
	} else if (number ==3) {
		JOptionPane.showMessageDialog(null, "maybe");
	} else if (number ==4) {
		JOptionPane.showMessageDialog(null, "maybe not");
	} else if (number ==5) {
		JOptionPane.showMessageDialog(null, "yes");
	} else if (number ==6) {
		JOptionPane.showMessageDialog(null, "no");
	} else if (number ==7) {
		JOptionPane.showMessageDialog(null, "maybe");
	} else if (number ==8) {
		JOptionPane.showMessageDialog(null, "maybe not");
	} else if (number ==9) {
		JOptionPane.showMessageDialog(null, "yes");
	}
}
}
