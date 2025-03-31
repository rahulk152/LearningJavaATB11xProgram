package ex_Array_Extra;

import java.util.Scanner;

public class Task02_Right_Triangle_with_Alphabate {
    public static void main(String[] args) {
        int alpha = 65;
        int r = 5;
        for (int m = 1; m <= r; m++)
        {
            for (int n = 1; n <= m; n++)
            {
                System.out.print((char)(alpha + n -1) + " ");
            }
            System.out.println();
        }
                
                
    }
}
