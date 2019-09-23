
/**
 * Write a description of class Panda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Panda
{
    private String country;
    private double weight;
    
    public Panda(){
        this.country = null;
        this.weight = 0;
    }
 
    public Panda(String country, double weight){
        this.country = country;
        this.weight = weight;
    
    }
    
    //method to change speed in Driver
    //mutate or setter methods
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public void setCountry(String country){
        this.country = country;
    }
    
    public String getCountry(){
        return "Country: " + this.country;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public String toString(){
        return "Country: " + this.country + " Weight: " + this.weight;
    }
}
