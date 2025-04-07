package ex_25_OOPs_Abstraction_Interface;

public class Lab115__Multiple_Inheritance_Interface {
    public static void main(String[] args) {
        Child C = new Child();
        C.money();
    }

}
interface Mother{
    void money();
}
interface Father{
    void money();
}
class Child implements Father,Mother{

    @Override
    public void money() {
        System.out.println("Child Money!");
    }
}