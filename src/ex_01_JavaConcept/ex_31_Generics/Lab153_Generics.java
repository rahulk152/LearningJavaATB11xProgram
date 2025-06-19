package ex_01_JavaConcept.ex_31_Generics;

public class Lab153_Generics {
    public static void main(String[] args) {
        temp_sum(3,4);
        temp_sum(3.14,4.5);
        temp_sum("Rahul","Kumar");
    }
    static int temp_sum(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
    static double temp_sum(double a, double b){
        System.out.println(a+b);
        return a+b;
    }
    static String temp_sum(String a, String b){
        System.out.println(a+b);
        return a+b;
    }
}

