package ex_If_condtion_Extra;

import java.util.Scanner;

public class Task09_Grade_Calculator {
//    Write a program that calculates and displays the
//    letter grade for a given numerical score (e.g., A, B, C, D, or F)
//    based on the following grading scale:
//
//    A: 90-100
//    B: 80-89
//    C: 70-79
//    D: 60-69
//    F: 0-59
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the score : ");
    int score = scanner.nextInt();
    if (score < 0 || score > 100){
        System.out.println("You Have entred invalid score please enter between 0 to 100!");
    } else if (score <= 100 && score >= 90) {
        System.out.println("Your have scored grade : A ");
    } else if (score <= 89 && score >= 80) {
        System.out.println("Your have scored grade : B ");
    } else if (score <= 79 && score >= 70) {
        System.out.println("Your have scored grade : C ");
    } else if (score <= 69 && score >= 60) {
        System.out.println("Your have scored grade : D ");
    }else {
        System.out.println("Your have scored grade : F ");
    }
}
}
