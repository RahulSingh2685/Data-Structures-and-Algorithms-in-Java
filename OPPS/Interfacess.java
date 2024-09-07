package OPPS8;

public class Interfacess {
    public static void main(String[] args) {
        rook r=new rook();
        queen q=new queen();
        q.moves();

            
       
        r.moves();
    }
}
interface ChessPlayer{
   
    void moves();
}
class queen implements ChessPlayer{
    public void moves(){
        System.out.println("in 4 dirn");
    }
}
class rook implements ChessPlayer{
    public void moves(){
        System.out.println("in 2 dirn");
    }
}
