
/**
 * Write a description of class ArraysAndStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArraysAndStuff
{
    public static void main(){
       /*
        int[] myArray = new int[8];
        
        for(int i=0; i < myArray.length; i++) {
            
            myArray[i] = 15*i;
            
        }
        
        for(int i=0; i < myArray.length; i++) {
            
            System.out.println("The value is: " + myArray[i]);
            
        }
        */
       
       //random number between 90 & 100 INCLUSIVE
       double num;
       
       for(int i=0; i<30; i++){
           num = (int)(Math.random()*11 + 90);
           System.out.println(num);
           
           System.out.println("Remainder when / 2 is" + num%2);
        }
    }
}
