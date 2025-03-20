package ex_09_For_Loop;

public class Lab053_For_Loop_Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) { // 0 to 49, 50 times
            if (i == 5) {
                continue; // skip below code, move to top
            }
            System.out.println(i);
        }
        for (int j = 0; j <= 50 ; j++) { // 0 to 50, 51 Times
            if(j%2 ==0){
                System.out.println("Even -> "+j);
                continue;
            }
            System.out.println("Odd -> "+j);
        }
    }
}
