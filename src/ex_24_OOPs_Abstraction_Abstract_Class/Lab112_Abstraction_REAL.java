package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab112_Abstraction_REAL {
    public static void main(String[] args) {
        C1 emp = new C1();
        emp.computePay();
        emp.mailCheck();
        C1 emp1 = new C1("Rahul","Jaipur",111);


    }
}
abstract class Employee{

    private String name;
    private String address;
    private int number;

    Employee(){
        System.out.println("DC");
    }

    Employee(String name, String address, int number){
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    abstract double computePay();

    void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }


}
class C1 extends Employee{

    C1(){
        super();
    }
    C1(String name, String address, int number){
        super();
    }
    @Override
    double computePay() {
        return 0;
    }
}