import javax.swing.JOptionPane;

public class printStuff {
public static void main(String[] args) {
	String stuff= JOptionPane.showInputDialog("type a word");
	String print= JOptionPane.showInputDialog("type a number");
	int number = Integer.parseInt(print);
	for (int i = 0; i <number; i++) {
		System.out.println(stuff);
		
	}
}
}
