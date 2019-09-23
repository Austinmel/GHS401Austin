
/**
 * Write a description of class student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class student
{
    private String name;
    private int grade;
    
    public student(){
    }
    
    public student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getGrade(){
        return this.grade;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setGrade(int grade){
        this.grade = grade;
    }
}
