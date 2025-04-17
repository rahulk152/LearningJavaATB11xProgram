package ex_SDET_Coding_Questions.April_17_2025;

public class Task02_parameterized_Constructor {
    public static void main(String[] args) {
        Student1 s = new Student1("Rahul Kumar", 32, 125);
        System.out.println("Name from object s: " + s.name);

        Student1 s1 = new Student1("Ram", 24);
        System.out.println("Age from object s1: " + s1.age);
    }
}

class Student1 {
    String name;
    int age;
    int roll_no;

    Student1() {
        System.out.println("Default Constructor");
    }

    Student1(String n, int a, int r) {
        this.name = n;
        this.age = a;
        this.roll_no = r;
        System.out.println("Name: " + this.name + " | Age: " + this.age + " | Roll Number: " + this.roll_no);
    }

    Student1(String n, int a) {
        this.name = n;
        this.age = a;
        System.out.println("Name: " + this.name + " | Age: " + this.age);
    }
}