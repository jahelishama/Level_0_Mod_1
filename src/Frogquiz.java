import javax.swing.JOptionPane;

public class Frogquiz {
public static void main(String[] args) {
	String frog= JOptionPane.showInputDialog("type a word");
	String marker= JOptionPane.showInputDialog("type an number");
	int number = Integer.parseInt(marker);
	for (int i = 0; i < number; i++) {
	System.out.println(frog);	
	}
}
}
