package OPPS8;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        Animal a=new Animal();
        shark.color="pink";
        System.out.println(shark.color);
       shark.swim();
    }
}
class Animal {
    String color;
    int k;
    void eat () {
    System.out.println("eats");

    }
    void breathe() {
    System.out.println("breathes");
    }

}
class Fish extends Animal{
    int fins;

    public void swim(){

        System.out.println("Swim in water");
    }


        
}
