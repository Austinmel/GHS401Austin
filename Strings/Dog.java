
/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog
{
    private String name;
    private String breed;
    private int weight;
    public Dog(){
       name = null;
       breed = null;
       weight = 0;
   }
  
   public Dog(String name, String breed, int weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
   }
   
   public int getWeight(){
       return this.weight;
   
   }
   
   public String toString(){
        return "Name: " + this.name + " Breed: " + this.breed + " Weight: " + this.weight;
    
   }
}
