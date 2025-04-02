package ex_Task.Single_Inheritance;

public class Task22_Single_Inheritance {
    public static void main(String[] args) {

        Animal a = new Animal("Labra");
        System.out.println(a.name);
        a.eat();

        Dog d = new Dog();
        d.bark();

    }
}
