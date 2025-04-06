package ex_Task.Encapsulation;

public class MOverloading_MOverriding {
    public static void main(String[] args) {
        System.out.println("--- Method Overloading ---");
        Calculator calc = new Calculator();
        System.out.println("Add(int, int): " + calc.add(10, 20));
        System.out.println("Add(int, int, int): " + calc.add(5, 15, 25));
        System.out.println("Add(double, double): " + calc.add(5.5, 4.5));

        System.out.println("\n--- Method Overriding ---");
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();
    }
}
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

// Method Overriding Example
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}