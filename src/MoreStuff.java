import java.awt.Component;
import java.util.Random;

import javax.swing.JOptionPane;

public class MoreStuff {
	private static final Component Guess = null;

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			
		
		int num = 0;
		Random somehing= new Random();
		num=somehing.nextInt(3);
		if (num==0 ) {
			 JOptionPane.showMessageDialog(null,"Guess wich number will come next");
		}
		if (num==1) {
			JOptionPane.showMessageDialog(null, "hi");
		}
		if (num==2) {
			JOptionPane.showMessageDialog(null, "goodbye");
			
		}
	   }
	}
}
