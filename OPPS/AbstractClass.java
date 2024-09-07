package OPPS8;

public class AbstractClass {
    public static void main(String[] args) {
        Chicken c=new Chicken();
        c.walk();

            
      

            
        
    }
}
abstract class Animals{
    void eat(){
        System.out.println("Eats");
    }
    abstract void walk();
}
class Hourse extends Animals{
    void walk(){
        System.out.println("it walk on four legs");
    }
    
}
class Chicken extends Animals{
    void walk(){
        System.out.println("it walk on two legs");
    }

}
