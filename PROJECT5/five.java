
/**
 * Write a description of class five here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JOptionPane;
import java.util.Random;

public class five
{
    public static void main(){
        int max = 10;
        int min = 100;

        int num;
        int myArray[];
        int arrayLngth = Integer.parseInt(JOptionPane.showInputDialog("How many integers do you want in the array (10-20)"));
        while(arrayLngth > 10000 || arrayLngth < 10){
            arrayLngth = Integer.parseInt(JOptionPane.showInputDialog("How many integers do you want in the array? (10-20)"));
            
        }
        myArray = new int[arrayLngth];
        Random rand = new Random();
        for (int i = 0; i < arrayLngth; i++){
            num = 15 + rand.nextInt((25 - 15) + 1);
            
            
            System.out.print(num + "\t");
            
            
            
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }
        System.out.println("");
        System.out.println("greatest " + max);
        System.out.println("least " + min);
    }
}
