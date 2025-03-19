package ex_Switch_Extra;

import java.util.Scanner;

public class Task01_Switch_Gender {
    public static void main(String[] args) {
        //Write a program to read gender(M/F) and print the corresponding gender using a switch statement
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Gender : ");
        char gender = scanner.next().charAt(0);
        switch (gender){
            case 'M' , 'm':
                System.out.println("The Gender is Male!");
                break;
            case 'F', 'f':
                System.out.println("The Gender is Female!");
                break;
            default:
                System.out.println("Unspecified Gender.");
                break;
        }
        scanner.close();
    }
}
