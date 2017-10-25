package calculator;

import javax.swing.JOptionPane;

public class calculator {
public static void main(String[] args) {
	String input1=JOptionPane.showInputDialog("Enter a number");
	int num1=Integer.parseInt(input1);
	String input2=JOptionPane.showInputDialog("Enter a number");
	int num2=Integer.parseInt(input2);
	
	String input3 = JOptionPane.showInputDialog("Do you want to add,subtract,multiply,or divide");
	
	
	if(input3.equals("add")){
		int sum=num1 + num2;
		JOptionPane.showMessageDialog(null, sum);
	}
	
	if(input3.equals("divide")){
		int result=num1 / num2;
		JOptionPane.showMessageDialog(null, result);
	}
	if(input3.equals("subtract")){
		int result=num1 - num2;
		JOptionPane.showMessageDialog(null, result);
	}
	
	if(input3.equals("multiply")){
		int result=num1 * num2;
		JOptionPane.showMessageDialog(null, result);
	}
	
	
	//(Do you want to add,subtract,multiply ,or Divide)
}
}
