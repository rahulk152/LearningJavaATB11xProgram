package ex_SDET_Coding_Questions;

import java.util.Scanner;

public class Task13_Triangle_is_Valid_Based {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Side 1 of the Triangle : ");
        int a = scanner.nextInt();
        System.out.println("Enter the Side 2 of the Triangle : ");
        int b = scanner.nextInt();
        System.out.println("Enter the Side 3 of the Triangle : ");
        int c = scanner.nextInt();

        if(a+b > c && a+c > b && b+c > a){
            System.out.println("This is valid Triangle");
        }else {
            System.out.println("this is not valid Triangle");
        }
    }
}
