package ex_01_JavaConcept.ex_05_Ternary_Operator;

public class Lab031_Real_Age_Classification {
    public static void main(String[] args) {
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
        // take an input from user
        String age1 = args[0];
        int age = Integer.parseInt(age1);
        String result = (age<18)?"minor":(age<65)?"Adult":"Senior";
        System.out.println(result);
    }
}
