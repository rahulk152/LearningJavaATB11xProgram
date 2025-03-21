package ex_Task;

import java.util.Scanner;

public class Task11_FizzBuzz_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz" +i);
            } else if (i % 3 == 0) {
                System.out.println("Buzz" +i);
            } else if (i % 5 == 0){
                System.out.println("Fuzz" +i);
            }else {
                System.out.println(i);
            }

        }
    }
}
