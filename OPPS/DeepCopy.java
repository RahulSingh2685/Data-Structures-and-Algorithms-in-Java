package OPPS8;

public class DeepCopy {
    public static void main(String[] args) {
        Student1 s11=new Student1();
        s11.name="rahul";
        s11.roll=567;
        s11.marks[0]=90;
        s11.marks[1]=40;
        s11.marks[2]=30;


        Student1 s22=new Student1(s11);

        s11.marks[2]=80;

        for(int i=0;i<3;i++){
            System.out.println(s22.marks[i]);
        }
              
    }
}
class Student1{
    String name ;
    int roll;
    int marks[]=new int[3];
    Student1(Student1 s11){
        this.name=s11.name;              //depp copy
        this.roll=s11.roll;
        for(int i=0;i<3;i++){
            this.marks[i]=s11.marks[i];
        }
    }
    Student1(){

    }
}
