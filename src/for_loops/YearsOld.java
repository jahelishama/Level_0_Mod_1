package for_loops;

import javax.swing.JOptionPane;

public class YearsOld {
public static void  main(String[] args) {
	String years= JOptionPane.showInputDialog("How old are you"); 
	int old = Integer.parseInt(years);
 for (int i = 0; i <= old ; i++){
	System.out.println(i);
}
}
}
