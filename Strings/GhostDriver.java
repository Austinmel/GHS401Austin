
public class GhostDriver
{
    public static void main(){
    
        //default ghost
        Ghost g1 = new Ghost();
        //two arg input ghost
        Ghost g2 = new Ghost("chartruse", 99, 1);
        
        System.out.println(g2.toString());
        
        g2.bumpSpeed();
        
        System.out.println(g2.toString());
        
        g2.doubleColor();
        
        System.out.println(g2.toString());
    }
}
