package variables_and_conditionals;

import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		String led = JOptionPane.showInputDialog("What month is your birthday");
		if (led.equals("January")) {
			JOptionPane.showMessageDialog(null, "you will eat tacos");
		}
		if (led.equals("February")) {
			JOptionPane.showMessageDialog(null, "You will become rich");
		}
		if (led.equals("March")) {
			JOptionPane.showMessageDialog(null, "You will become an actor who makes no money");
		}
		if (led.equals("April")) {
			JOptionPane.showMessageDialog(null,	"Your name will be May");
		}
		if (led.equals("May")) {
			JOptionPane.showMessageDialog(null,"You will love life");
		}
		if (led.equals("June")) {
			JOptionPane.showMessageDialog(null,"You will be mean,rude,disresectfull,and nice when you want to");
		}
		if (led.equals("July")) {
			JOptionPane.showMessageDialog(null,"You will make a lot of friends");
		}
		if (led.equals("August")) {
			JOptionPane.showMessageDialog(null,"You will hate july and semtember");
		}
		if (led.equals("September")) {
			JOptionPane.showMessageDialog(null,"you will get 3 wishes from a lamp");
			
		}
		if (led.equals("October")) {
			JOptionPane.showMessageDialog(null,"You will love life");
		
		}
		if (led.equals("November")) {
			JOptionPane.showMessageDialog(null,"You will have powers");
		}
		if (led.equals("December")) {
			JOptionPane.showMessageDialog(null,"You will spend time with your family");
		}

	}
}
