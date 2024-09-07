package OPPS8;

public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.username="AYush";
        b.setp("rAHUL");
        System.out.println(b.get());
        
        
    }
}
class BankAccount{
    String username;
   private String pswd;
   
    public void setp(String s){
        pswd=s;
    }
    public String get(){
        return pswd;
    }

}
