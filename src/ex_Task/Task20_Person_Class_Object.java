package ex_Task;

public class Task20_Person_Class_Object {
    public static void main(String[] args) {
        person p1 = new person();
        p1.sleep();
        p1.married();
        p1.greet_with_details("Rahul", 32, 100);
        p1.person_name("Tavish");
    }
}
class  person{
    String name;
    String mobile_no;
    double weight;
    float height;
    int legs;
    double salary;
    byte age;
    String color_eyes;
    boolean isMale;
    boolean ismarried;

    void sleep(){
        System.out.println("Person is sleeping");
    }
    boolean married(){
        ismarried = true;
        System.out.println("Is married " +ismarried);
        return ismarried;
    }
    void greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is ->" + name + "\nYour age is " + age + "\nYour salary is " + salary);
    }
    String person_name(String name){
        System.out.println("Name is " +name);
        return name;
    }

}