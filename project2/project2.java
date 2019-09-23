import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Write a description of class project2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class project2
{
   public static void main(){
       int length = Integer.parseInt(JOptionPane.showInputDialog("Input a length for the array: "));
       int low = Integer.parseInt(JOptionPane.showInputDialog("Input a low value: "));
       int high = Integer.parseInt(JOptionPane.showInputDialog("Input a high value: "));
       int num;
       Random random = new Random();
       
    if(low > high){
        System.out.println("Error. Invalid values");
    }
    else{
        int[] myArray = new int[length];
        int even = 0;
        int instance = 0; 
        for(int i=0; i < myArray.length; i++){
           num = random.nextInt(high - low + 1) + low;
           myArray[i] = num; 
           instance++;
           if (myArray[i] % 2 == 0)
                System.out.println("Item #" + instance + " is " + myArray[i] + " which is even.");
           else
                System.out.println("Item #" + instance + " is " + myArray[i] + " which is odd.");
           }
        for(int i=0; i < myArray.length; i++){
            if (myArray[i] % 2 == 0)
                even++;
        }
        System.out.println("There are " + even + " even values.");
        System.out.println("There are " + (myArray.length - even) + " odd values.");
    }
  }
}
