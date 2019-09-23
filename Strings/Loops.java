
/**
 * Write a description of class Loops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;

public class Loops
{
    public static void main(){
    
        String[] firstNames = {"andrew", "jacob", "bob", "joey", "michael"};
        String[] lastNames = {"yang", "smith", "ross", "keller", "skskski"};
        
        Random rand = new Random();
        Random rand2 = new Random();
        
        System.out.println("First Name \t\tLastName");
        for(int i = 0; i<10; i++){
            int randomNum = rand.nextInt((firstNames.length - 0));
            int randomNum2 = rand.nextInt((lastNames.length - 0));
            
            System.out.println(firstNames[randomNum] + "\t\t\t" + lastNames[randomNum2]);
        }
        
        int a=93;
        while(a>=81){
        System.out.println(a);
        a--;
        
        }
        
    }
}
