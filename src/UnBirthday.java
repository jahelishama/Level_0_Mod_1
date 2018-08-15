import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {
		String water = JOptionPane.showInputDialog("When is your birthday");
		;

		if (water.equals("08/14")) {

			JOptionPane.showMessageDialog(null, "happy birthday");
		}else {
			JOptionPane.showMessageDialog(null, "happy Unbirthday");
		}
	}
}
