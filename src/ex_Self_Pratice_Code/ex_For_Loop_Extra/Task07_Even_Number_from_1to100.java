package ex_Self_Pratice_Code.ex_For_Loop_Extra;

public class Task07_Even_Number_from_1to100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            int even = i%2;
            if(even==0){
                System.out.println(i);
            }


        }
    }
}
