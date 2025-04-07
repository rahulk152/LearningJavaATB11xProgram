package ex_23_OOPs_Super;

public class Lab108_SuperKeyword {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
        System.out.println("The max speed of car is :" +c1.getMaxSpeed());
        c1.setMaxSpeed(290, false);
        System.out.println("The updated max speed of car is :" +c1.getMaxSpeed());

    }
}
class Vehicle{
    public int maxSpeed = 180;
    Vehicle(){
        System.out.println("DC");
    }
    Vehicle(int a){
        System.out.println("Param Cons");
    }
    // Method Overloading - Same, same name function with different arguments.
    void message(){
        System.out.println("No Return, No Argument");
    }
    void message(int a){
        System.out.println("PC - With Argument");
    }
    void display(){
        System.out.println("Vehicle Parent");
    }
}
class Car extends Vehicle{
    private int maxSpeed = 280;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed, boolean car) {
       if(car) {
           this.maxSpeed = maxSpeed;
       }else {
           System.out.println("This is not an Car");
       }

    }

    Car(){
        super();
    }
    Car(int a){
        super();
    }
    //Method Overriding
    @Override
    void display(){
        System.out.println("Override Method");
        System.out.println(this.maxSpeed);
        //Parent instance variable, method, constructor can be accessed in the child class with super keyword
        System.out.println(super.maxSpeed);
        super.message();
        super.message(10);
        super.display();
    }
}