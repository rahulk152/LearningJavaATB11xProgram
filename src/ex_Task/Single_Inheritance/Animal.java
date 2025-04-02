package ex_Task.Single_Inheritance;

public class Animal {
    String name = "mark";
    Animal(){
        System.out.println("Default Constructor");
    }
    Animal(String name){
        this.name = name;
    }
    void eat(){
        System.out.println(name+ " is Eating!");
    }
}
