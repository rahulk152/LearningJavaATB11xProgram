package ex_01_JavaConcept.ex_23_OOPs_Super;

public class Lab109_Super {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
class God{
    void  sound(){
        System.out.println("God!");
    }
}
class Animal extends God{
    protected  String color  = "white";
    void sound() {
        System.out.println("Animal Sound");
        super.sound();
    }
}
class Dog extends Animal{
    private String color  = "Black";
    Dog(){

    }

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }
}