package OPPS8;
  

public class Pen {
    public static void main(String ayush[]){
        Pens p=new Pens();
        Pens p2=new Pens();

        System.out.println(p.color);

        p.setcolor("red");
        System.out.println(p.color);
        System.out.println(p2.color);

        p.color="PINK";
        System.out.println(p.color);
        

    }
    
}
 class Pens{
   static String color;
    int tip;
    void setcolor(String newcolor){
        color=newcolor;

    }

    void settip(int newtip){
        tip=newtip;
    }


}

