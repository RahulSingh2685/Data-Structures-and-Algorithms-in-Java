package OPPS8;

public class ShallowCopy {
    public static void main(String[] args) {
        Students s11=new Students();
        s11.name="rahul";
        s11.roll=567;
        s11.marks[0]=90;
        s11.marks[1]=40;
        s11.marks[2]=30;


        Students s22=new Students(s11);
        System.out.println(s22.name);
        s11.marks[2]=80;

        for(int i=0;i<3;i++){
            System.out.println(s22.marks[i]);
        }
              
    }
}
class Students{
    String name ;
    int roll;
    int marks[]=new int[3];
    Students(Students s11){
        this.name=s11.name;              //Shaloow copy
        this.roll=s11.roll;
        this.marks=s11.marks;
    }
    Students(){

    }
}
