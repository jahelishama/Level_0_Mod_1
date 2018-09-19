import javax.swing.JOptionPane;

public class Sorter {
	public static void main(String[] args) {
		String sort = JOptionPane.showInputDialog("give me a number");
		int viod = Integer.parseInt(sort);
		String popcorn = JOptionPane.showInputDialog("give me a number");
		int task = Integer.parseInt(popcorn);

		if (viod < task) {
			JOptionPane.showMessageDialog(null, "" + viod + ", " + task);
		} else {
			JOptionPane.showMessageDialog(null, "" + task + ", " + viod);

		}
	}
}
