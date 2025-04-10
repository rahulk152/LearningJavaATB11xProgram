package ex_30_Execption;

import java.util.Scanner;

public class Lab143_TryCatch_Finally_Purpose {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int v = sc.nextInt();
        try {
            int b= 10/v;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("end of program , sc closed!");
        }
    }
}
