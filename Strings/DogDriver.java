public class DogDriver
{
    public static void main(){
    
        //default ghost
        Dog d1 = new Dog();
        //two arg input ghost
        Dog d2 = new Dog("Sunny", "Yellow-Lab", 8);
        
        
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        
        System.out.println(d2.getWeight());

    }
}