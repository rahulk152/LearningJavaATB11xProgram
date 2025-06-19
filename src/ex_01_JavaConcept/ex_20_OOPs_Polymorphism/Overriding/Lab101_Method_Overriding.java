package ex_01_JavaConcept.ex_20_OOPs_Polymorphism.Overriding;

public class Lab101_Method_Overriding {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        Animal a = new dog(); //Dynamic Dispatch
        a.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal Sound!");
    }
}
class dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark!");
    }
}
