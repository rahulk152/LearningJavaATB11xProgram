package Interview_program_code;

import java.math.BigInteger;

public class Task_12_Factorial_Big_Number {
    public static void main(String[] args) {
       int num = 50;
       BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));

        }
        System.out.println(result);
    }
}
