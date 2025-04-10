package ex_Self_Pratice_Code.ex_Switch_Extra;

import java.util.Scanner;

public class Task06_Grad_Remark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Grade to check the remark : ");
        char g = scanner.next().charAt(0);
        char grade = Character.toUpperCase(g);
        switch (grade){
            case 'A' -> System.out.println("Remark : Excellent!");
            case 'B' -> System.out.println("Remark : Very Good");
            case 'C' -> System.out.println("Remark : Good");
            case 'D' -> System.out.println("Remark : Average");
            case 'E' -> System.out.println("Remark : Below Average");
            case 'F' -> System.out.println("Remark : Fail");
            default -> System.out.println("Invalid Grade");
        }
    }
}
