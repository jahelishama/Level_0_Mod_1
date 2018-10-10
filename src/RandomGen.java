import java.util.Random;

import javax.swing.JOptionPane;
public class RandomGen {
public static void main(String[] args) {
	Random n = new Random();
	int i = n.nextInt(3);
	System.out.println(i);
	String yet =JOptionPane.showInputDialog("Guess the random number");
	int num = Integer.parseInt(yet);
	if (i == num) {
		JOptionPane.showMessageDialog(null, "your smart unlike elija" );
		
	}else {
		JOptionPane.showMessageDialog(null, "Your dumb just lke elija");
	}
}
}
