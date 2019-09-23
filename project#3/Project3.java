import javax.swing.JOptionPane;

/**
 * Write a description of class Project3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Project3
{
    public static void main(){
        String school = JOptionPane.showInputDialog("What school do you attend?");
        String mascot = JOptionPane.showInputDialog("What mascot does your school have?");
        
        if(school.equals("Granada") && mascot.equals("Matadors")){
            System.out.println("Access granted.");
            
            String[] myArray = {"MartyMcFly", "Mufasa", "Waldo", "Jesus", null};
            int a = 0;
            String suffix = "th";
            
            for(int i=0; i < myArray.length; i++){
                if(myArray[i] != null){                    
                    if(!myArray[i].equals("Waldo")){
                        System.out.println("Waldo is not on this line, " + myArray[i] + " is.");
                        if(i+1 == 1)
                            suffix = "st";
                        if(i+1 == 2)
                            suffix = "nd";
                        if(i+1 == 3)
                            suffix = "rd";
                        if(i+1 >= 4)
                            suffix = "th";
                        System.out.println("I'm on the " + (i+1) + suffix + " number in the array of " + myArray.length);
                    }
                    if(myArray[i].equals("Waldo")){
                        System.out.println("Waldo IS on this line!");
                        if(i+1 == 1)
                            suffix = "st";
                        if(i+1 == 2)
                            suffix = "nd";
                        if(i+1 == 3)
                            suffix = "rd";
                        if(i+1 >= 4)
                            suffix = "th";
                        System.out.println("I'm on the " + (i+1) + suffix + " number in the array of " + myArray.length);
                    }
                }
                else{
                    System.out.println("The " + (i+1) + suffix + " is empty. (null)");
                }
            }
        }
        else{
            if(!school.equals("Granada")){
                System.out.println("The school is not correct.");
            }
            if(!mascot.equals("Matadors")){
                System.out.println("The mascot is not correct.");
            }
        }
                String answer = JOptionPane.showInputDialog("What is your favorite movie character?");
                if(answer.equals("Jesus")){
                    System.out.println("We have the same taste in movies!");
                }
                else{
                    System.out.println("We do not have the same taste in movies.");
                }
    }
}
