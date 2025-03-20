package ex_For_Loop_Extra;

import java.util.Scanner;

public class Task19_Number_To_Count_Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total numbers you want to input: ");
        int n = scanner.nextInt();
        int postive = 0, negative = 0, zero = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            if(num<0){
                postive++;
            } else if (num>0) {
                negative++;
            }else {
                zero++;
            }
        }
        // Closing the scanner
        scanner.close();

        // Displaying the results
        System.out.println("\nTotal Positive Numbers: " +postive);
        System.out.println("Total Negative Numbers: " +negative);
        System.out.println("Total Zeros: " +zero);

    }
}
