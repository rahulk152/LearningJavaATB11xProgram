package ex_For_Loop_Extra;

import java.util.Scanner;

public class Task18_HCF_Of_2_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First Number :");
        int num1 = scanner.nextInt();
        System.out.print("Enter the Second Number :");
        int num2 = scanner.nextInt();
        int min, hcf = 1;
        if(num1<num2){
            min = num1;
        }else {
            min = num2;
        }
        for (int i = 1; i <= min; i++) {
            if(num1%i == 0 && num2%i == 0){
                hcf = i;
                System.out.println(i);
            }

        }
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}
