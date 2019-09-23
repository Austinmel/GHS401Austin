
/**
 * Write a description of class StringStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JOptionPane;

public class StringStuff
{
    public static void main(){
    
        //String name = "Greg";
        //String name = new String("Greg");
        //String name2 = JOptionPane.showInputDialog("Name: ");
        
        String[] classmates = {"Greg", "Dale", "Michael", null, "Wilson"};
        
        for(int i=0; i<classmates.length; i++){
            if(classmates[i] != null)
                System.out.println(classmates[i].length());
        }
    
    
    
    
    }
}
