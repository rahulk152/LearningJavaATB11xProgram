package ex_If_condtion_Extra;

import java.util.Scanner;

public class Task13_Percentage_5_Subject_Grade {
//    Write a program to input marks of five subjects
//    Physics, Chemistry, Biology, Mathematics and Computer.
//    Calculate percentage and grade according to following:
//
//    Percentage >= 90% : Grade A
//    Percentage >= 80% : Grade B
//    Percentage >= 70% : Grade C
//    Percentage >= 60% : Grade D
//    Percentage >= 40% : Grade E
//    Percentage < 40% : Grade F
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Marks of Physics : ");
    int phy = scanner.nextInt();
    System.out.println("Enter the Marks of Chemistry : ");
    int chem = scanner.nextInt();
    System.out.println("Enter the Marks of Biology : ");
    int bio = scanner.nextInt();
    System.out.println("Enter the Marks of Mathematics : ");
    int math = scanner.nextInt();
    System.out.println("Enter the Marks of Computer : ");
    int comp = scanner.nextInt();
    float total  = phy + chem + bio + math + comp;
    float percentage =  total / 5;
    if (percentage >= 90){
        System.out.println("The Garde is : A" +percentage);

    } else if (percentage >= 80) {
        System.out.println("The Garde is : B" + " & " + "percentage is :  "+percentage);
    } else if (percentage >= 70) {
        System.out.println("The Garde is : C" + " & " + "percentage is :  "+percentage);
    } else if (percentage >= 60) {
        System.out.println("The Garde is : D" + " & " + "percentage is :  "+percentage);
    } else if (percentage >= 40) {
        System.out.println("The Garde is : E" + " & " + "percentage is :  "+percentage);
    }else {
        System.out.println("The Garde is : F" + " & " + "percentage is :  "+percentage);
    }
}


}
