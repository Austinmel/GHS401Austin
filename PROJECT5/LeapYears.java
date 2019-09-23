import javax.swing.JOptionPane;

public class LeapYears {

    
    public static void main(){
        
      
        int dayOfWeek=2;
        int dayOfMonth=1;
        int month=1;
        int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int count=0;
        
        for(int year=1901; year < 2001; year++){
        
            if(dayOfWeek==7 && dayOfMonth==1){
                count++;
            }
            
            
            if(dayOfWeek>7){
                dayOfWeek=1;
            }
            
            for(int i=1; i < daysInMonth.length; i++){
            
               System.out.println(daysInMonth[i]);
            
            }
            
        
            
            
        }
            
        }
        
    }
