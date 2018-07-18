package variables_and_conditionals;

/** 
I have a pocket full of change. I hate doing math. Make me a program that will calculate 
how much money I have without me having to use my brain.
*/

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

    public static void main(String[] args) {

        // Ask the user how many nickels they have
    	String kit=JOptionPane.showInputDialog("How many nickles do I have");
        // Convert their answer to an int using Integer.parseInt()
    	int nickels = Integer.parseInt(kit);
        // Ask the user how many dimes they have, and convert their answer
    	String haha=JOptionPane.showInputDialog("How many dimes do I have");
    	int dimes = Integer.parseInt(haha);
        // Calculate how much money the user has and save it in a double variable 
    	
    	        // Ask the user how many quarters they have, and convert their answer
    	String why=JOptionPane.showInputDialog("How many quarters do I have ");
    	int quarters = Integer.parseInt(why);
        // Tell the user how much money they have
    	double money =nickels * 0.05 + dimes * 0.10 + quarters * 0.25;


}
    
}