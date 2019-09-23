
/**
 * Write a description of class project4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;

public class project4
{
   public static void main(){
        Random rand = new Random();
        int min; int max;
        Boolean e2; Boolean e3;
        
        for(int i = 1; i<=10; i++){
            min = i;
            max = i*i;
            int randomNum = min + rand.nextInt((max - min) + 1);
            
            System.out.print(i + "\t" + (i*i) + "\t" + randomNum + "\t");
            
            if(i==randomNum)
                System.out.println("The random value is equal to the index.");
            else if((i*i)==randomNum)
                System.out.println("The random value is equal to the squared index.");
            else{
                System.out.println(" ");
            }
            
            
        }
        
        System.out.print("\n\n");
        
        String[] movies = {"Treasure Planet", "Jason Bourne", "Spongebob Squarepants: The Live Action Movie"};
        String[] songs = {"Basket Case", "Kidz Bob", "Beyonce"};
        
        for(int i=0; i < movies.length; i++){
            System.out.println(movies[i]);
            
            
        }
        System.out.print("\n\n");
        int a = 1;
        while(a <= songs.length){
            if(a == songs.length)
               System.out.print(songs[a-1]); 
            else
                System.out.print(songs[a-1] + ", ");
            a++;
        }
    }
}
