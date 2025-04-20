package ex_SDET_Coding_Questions.April_19_2025;

public class Task44_Abstraction {
    public static void main(String[] args) {

        Geeks remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}

// Working of Abstraction in Java
abstract class Geeks {
    abstract void turnOn();
    abstract void turnOff();
}
class TVRemote extends Geeks{

    @Override
    void turnOn() {
        System.out.println("Turn On the TV");
    }

    @Override
    void turnOff() {
        System.out.println("Turn Off the TV");
    }
}