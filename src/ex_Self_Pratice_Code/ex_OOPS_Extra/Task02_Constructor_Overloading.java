package ex_Self_Pratice_Code.ex_OOPS_Extra;

public class Task02_Constructor_Overloading {
    public static void main(String[] args) {
        dog d1 = new dog();
        dog d2 = new dog("Labra",6,"black");
        System.out.println(d2.name);
        System.out.println(d2.age);
        System.out.println(d2.color);
        dog d3 = new dog("pug","white");

    }
}
class dog{
    String name;
    int age;
    String color;
    dog(){
        System.out.println("This DC of dog class");
    }
    dog(String name, int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    dog(String name,String color){
        this.name = name;
        this.color = color;
        System.out.println("The name of Dog is : " +name);
        System.out.println("The color of dog is : " +color);
    }
}