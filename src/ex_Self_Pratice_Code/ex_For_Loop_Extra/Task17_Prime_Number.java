package ex_Self_Pratice_Code.ex_For_Loop_Extra;

import java.util.Scanner;

public class Task17_Prime_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = scanner.nextInt();
        int i, count = 0;
        for (i = 2; i < num; i++) {
            if (num%i == 0){
                count++;
                break;
            }
        }
        if (count == 0)
            System.out.println("This is a Prime Number.");
        else
            System.out.println("This is not a Prime Number.");

        scanner.close();
    }
}
