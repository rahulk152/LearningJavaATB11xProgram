package ex_Self_Pratice_Code.ex_For_Loop_Extra;

import java.util.Scanner;

public class Task14_Power_Raise_To_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base Number : ");
        int num = scanner.nextInt();
        System.out.println("Enter the power Number : ");
        int rnum = scanner.nextInt();
        int result = 1;
        //double result = Math.pow(num,rnum);
        //System.out.println(result);
        if (num<=0){
            System.out.println("Not an valid Number");
        }else {
            for (int i = 1; i < rnum; i++) {
                result = result * num;
            }
            System.out.println("Result : " +result);
        }

    }
}
