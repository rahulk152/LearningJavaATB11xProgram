package ex_SDET_Coding_Questions.April_8_2025.WhileLoop;

public class Task24_Print_Even_Numbers_From_1_To_20 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 20){
            if(i%2 == 0){
                System.out.println("Even : "+i);
            }
            i++;
        }
    }
}
