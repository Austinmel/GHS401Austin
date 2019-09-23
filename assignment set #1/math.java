
/**
 * Write a description of class math here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JOptionPane;

public class math
{
    public static void main(){
        int A = Integer.parseInt(JOptionPane.showInputDialog("Input an A value: "));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Input a B value: "));
        int C = Integer.parseInt(JOptionPane.showInputDialog("Input a C value: "));
        
        int NB;
        
        System.out.println("The value of b^2 is " + (B*B));
        System.out.println("The value of 4*A*C is " + (4*A*C));
        NB = B * -1;
       
        if((B*B - 4*A*C) < 0){
            System.out.println("Sorry, your discriminant is negative. We cannot process imaginary roots right now…");
        }
        else{
            System.out.println("The value of root 1 is " + (B*-1 + Math.sqrt(B*B - 4*A*C)) / (2*A));
            System.out.println("The value of root 2 is " + ((B*-1) - (Math.sqrt((B*B) - (4*A*C)))) / (2*A));
        }
     

        
    }
}
