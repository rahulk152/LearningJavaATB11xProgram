package Interview_program_code.Number;

public class Task_11_Reverse_Number {
    public static void main(String[] args) {
        int num = 123;
        int reverseNum = 0;
        int lastDigit;
        while (num != 0){
            lastDigit = num % 10;
            //check overflow
            if(reverseNum > Integer.MAX_VALUE / 10 || (reverseNum == Integer.MAX_VALUE && lastDigit > 7)){
                System.out.println(0);
                System.exit(0);
            }
            //check underflow
            if(reverseNum < Integer.MIN_VALUE / 10 || (reverseNum == Integer.MIN_VALUE && lastDigit < -8)){
                System.out.println(0);
                System.exit(0);
            }
            reverseNum = reverseNum * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println("The Reverse Number = " +reverseNum);
    }
}
