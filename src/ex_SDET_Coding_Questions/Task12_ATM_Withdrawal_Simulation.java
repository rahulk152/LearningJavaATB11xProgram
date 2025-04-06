package ex_SDET_Coding_Questions;

import java.util.Scanner;

public class Task12_ATM_Withdrawal_Simulation {
    public static void main(String[] args) {
        int acc_bal = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount to be withdrawn from the Account");
        int with_amt = scanner.nextInt();

        if (with_amt <= 0) {
            System.out.println("The withdraw amount should be greater than zero");
        } else if (with_amt % 100 != 0) {
            System.out.println("Amount must be a multiple of 100.");
        } else if (with_amt >= acc_bal) {
            System.out.println("The amount should not exceed the account balance");
        }else {
            acc_bal = acc_bal - with_amt;
            System.out.println("After Deducation the current balance is : " +acc_bal);
        }
    }
}
