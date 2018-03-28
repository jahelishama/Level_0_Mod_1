package variables_and_conditionals;

import javax.swing.JOptionPane;

public class Fortnite {
	public static void main(String[] args) {
		// Give me a word and a number
		String num = JOptionPane.showInputDialog("Can you give me a number");
		String word = JOptionPane.showInputDialog("can you give me a word");
		int number=Integer.parseInt(num);
		for (int i = 0; i < number; i++) {
			System.out.println(word);
		}
	}
}