
/**
 * Write a description of class PandaDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PandaDriver
{
    public static void main(){
        Panda p1 = new Panda("China", 198.0);
        
        double currentWeight = p1.getWeight();
        
        currentWeight += 1000.0;
        
        p1.setWeight(currentWeight);
        
        System.out.println(p1.getWeight());
        
        Panda[] zoo = new Panda[3];
        for(int i = 0; i < zoo.length; i++){
            System.out.println(zoo[i]);
        }
        
        
        
    }
}
