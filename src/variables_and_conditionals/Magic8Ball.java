package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random
		// number into this variable using "new Random().nextInt(4)"
		Random randy = new Random();
		int rand = randy.nextInt(4);
		// 3. Print out this variable
		System.out.println(rand);
		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("ask a question");
		// 5. If the random number is 0
		// -- tell the user "Yes"
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "yes");

		}
		// 6. If the random number is 1

		// -- tell the user "No"
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "no");

		}
		// 7. If the random number is 2

				// -- tell the user "Maybe you should ask Google?"
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "go ask google");

		}

		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "how old am I");

		}
		

		// 8. If the random number is 3

		// -- write your own answer
		
	}

}
