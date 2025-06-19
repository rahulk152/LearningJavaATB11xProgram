package ex_01_JavaConcept.ex_03_operators;

public class Lab021_All_Operators {
    public static void main(String[] args) {
        boolean b1 = true;
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // Arithmetic Operators
        // +,-,%,/,*

        // Compound Assignment Operators
        //     // +=, -=, /=, *=
        int age = 10;
//        age += 10; // // age = age+10;
        age /=10; // age = age/10
        System.out.println(age);


        // Relational Operators
        // > , < , >= <=, !, != , == (compare two value)

        // Logical Operators
        //  OR or and , || , && , !

        // Optional to learn - Digital Electronics
        // Bitwise - Not important for Automation
        //
        // ~ - Bitwise Not,
        // >> - Right shift,
        // << Left Shift,
        // ^ - XOR

        // ++,-- - Increment and Decrement Operator
        // Ternary Operator ?:
        // New Operator
        String s1 = new String("Rahul");
        System.out.println(s1 instanceof String);
    }
}
