
/**
 * Write a description of class p2d here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p2d
{
    public static void main(){
        
        
        student[] femaleStudents = new student[7];
        femaleStudents[0] = new student("Emiley", 10);
        femaleStudents[1] = new student("Jane", 12);
        femaleStudents[2] = new student("Brenda", 9);
        femaleStudents[3] = new student("Rebecca", 12);
        femaleStudents[4] = new student("Tracy", 12);
        femaleStudents[5] = null;
        femaleStudents[6] = null;
        
        
        
        student[] maleStudents = new student[7];
        maleStudents[0] = new student("Jake", 10);
        maleStudents[1] = new student("John", 12);
        maleStudents[2] = new student("Jackson", 10);
        maleStudents[3] = new student("Gabe", 12);
        maleStudents[4] = null;
        maleStudents[5] = new student("Chris", 11);
        maleStudents[6] = null;
        
       
        
        String[] olderNames = new String[7];
        olderNames[0] = new String("");
        
        for (int i = 0; i < maleStudents.length; i++){
            if((maleStudents[i] == null) || (femaleStudents[i] == null)){
                if ((maleStudents[i] == null) && (femaleStudents[i] == null)){
                    olderNames[i] = "Space for Rent";
                }
                else if (femaleStudents[i] == null){
                    olderNames[i] = maleStudents[i].getName();
                }
                else if (maleStudents[i] == null){
                    olderNames[i] = femaleStudents[i].getName();
                }  
            }
            
            else{
                if(femaleStudents[i].getGrade() > maleStudents[i].getGrade()){
                    olderNames[i] = femaleStudents[i].getName();
                }
                else if(maleStudents[i].getGrade() > femaleStudents[i].getGrade()){
                    olderNames[i] = maleStudents[i].getName();
                }
            
                else{
                    double rand = Math.random();
                    if (rand > 0.5){
                        olderNames[i] = femaleStudents[i].getName(); 
                    }
                    else if (rand <= 0.5){
                        olderNames[i] = maleStudents[i].getName(); 
                    }
                }
            }
            
            if ((maleStudents[i] != null) && (femaleStudents[i] != null)){   
                System.out.println(femaleStudents[i].getName() + "\t\t" + femaleStudents[i].getGrade() + "\t\t" + maleStudents[i].getName() + "\t\t" + maleStudents[i].getGrade() + "\t\t" + olderNames[i]);
            }
            else if ((maleStudents[i] == null) && (femaleStudents[i] == null)){
                System.out.println("null" + "\t\t" + "null" + "\t\t" + "null" + "\t\t" + "null" + "\t\t" + olderNames[i]);
            }
            else if (maleStudents[i] == null){
                System.out.println(femaleStudents[i].getName() + "\t\t" + femaleStudents[i].getGrade() + "\t\t" + "null" + "\t\t" + "null" + "\t\t" + olderNames[i]);
            }
            else if (femaleStudents[i] == null){
                System.out.println("null" + "\t\t" + "null" + "\t\t" + maleStudents[i].getName() + "\t\t" + maleStudents[i].getGrade() + "\t\t" + olderNames[i]);
            }
            
        }
    } 
}
