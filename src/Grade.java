import javax.swing.JOptionPane;

public class Grade {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("what score did you get on your test");
		int test = Integer.parseInt(score);

		if (test < 60) {
			JOptionPane.showMessageDialog(null, "F");
		}
		if (test < 70) {
			JOptionPane.showMessageDialog(null, "D");
		}
		if (test < 80) {
			JOptionPane.showMessageDialog(null, "C");
		}
		if (test < 90) {
			JOptionPane.showMessageDialog(null, "B");
		}
		if (test < 100) {
			JOptionPane.showMessageDialog(null, "A");
		}
		if (test < 0) {
            JOptionPane.showMessageDialog(null, "error"
            	);			
			
		}      {
			
		}

	}

}
