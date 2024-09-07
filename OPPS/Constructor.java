package OPPS8;

public class Constructor {
    public static void main(String[] args) {
        s i=new s();
       // s i=new s(5);

       

    }
}
class s{
    String name;
    int roll;
    s(){
        System.out.println(name);
    }
    
    s(int n){
        roll=n;
        System.out.println(roll);
    }

}
