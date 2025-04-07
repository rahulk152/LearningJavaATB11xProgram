package ex_25_OOPs_Abstraction_Interface;

public class Lab117_Abstraction {
}

interface Incomplete_Interface{
    int a = 10;
    void display();
}

class ConcreateClass implements Incomplete_Interface{

    @Override
    public void display() {
        System.out.println("Hi");
    }
}

abstract class Incomplete_abstract{
    abstract void display1();
}