package variables_and_conditionals;

import javax.swing.JOptionPane;

public class testScore {
	public static void main(String[] args) {
		String life=JOptionPane.showInputDialog("What is youre test score");
		int num=Integer.parseInt(life);
		
		if (num<59){
	JOptionPane.showMessageDialog(null,"F");
	}
		if (num<67){
	JOptionPane.showMessageDialog(null,"D");
	}
		if (num<77){
	JOptionPane.showMessageDialog(null,"C+");
	}
		if (num<87){
	JOptionPane.showMessageDialog(null,"B+");		
	}
		if (num<97){
	JOptionPane.showMessageDialog(null,"");		
		}
	}

}