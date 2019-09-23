
/**
 * Write a description of class InputOutput here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JOptionPane;

public class InputOutput {
   public static void main() {
       String name = JOptionPane.showInputDialog("What is your name?");
       
       int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
       
       if(age >15){
           System.out.println("You can drive " + name + "!");
        }
        
       else{
           System.out.println("Ride a bike " + name + ".");
        }
    }
}
