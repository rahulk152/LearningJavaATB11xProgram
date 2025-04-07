package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab111_AB_Car {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}

abstract class Engine{
    abstract void StartEngine();
    abstract void StopEngine();
    void normal(){
        System.out.println("Normal Function!");
    }
}
class Car extends Engine{

    @Override
    void StartEngine() {
        System.out.println("Starting the car");
    }

    @Override
    void StopEngine() {
        System.out.println("Stopping the Car");
    }

    void drive(){
        StartEngine();
        StopEngine();
    }

}