package ex_SDET_Coding_Questions.April_19_2025;

public class Task42_Inheritance {
    public static void main(String[] args) {
        Animal a = new Animal("brown","tommy",4);
        System.out.println(a.name);
        a.sound();
        dog d = new puppy("White","miku",1); //dynamic dispatch
        d.sound();
        d.name();

    }
}
class Animal{
    String color;
    String name;
    int age;
    Animal(String c, String n, int a){
        this.color = c;
        this.name = n;
        this.age = a;
    }
    void sound(){
        System.out.println("Animal sound");
    }
}
class dog extends Animal{

    dog(String c, String n, int a) {
        super(c, n, a);
    }

    void name(){
        System.out.println("Name is Rocky");
    }

    void sound(){
        System.out.println("Brak!");
    }

}
class puppy extends dog {

    puppy(String c, String n, int a) {
        super(c, n, a);
    }

    void color() {
        System.out.println("Black color");
    }

    @Override
    void sound() {
        System.out.println("puppy brak");
    }
}

