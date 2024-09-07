package OPPS8;

public class CopyConstructors {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="rahul";
        s1.roll=567;
        Student s2=new Student(s1);
        System.out.println(s2.name);




        
    }
}
class Student{
    String name ;
    int roll;
    Student(Student s1){
        this.name=s1.name;              //COPY CONSTRUCTOR
        this.roll=s1.roll;
    }
    Student(){

    }
}
