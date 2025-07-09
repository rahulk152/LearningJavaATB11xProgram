package Interview_program_code.Number;

public class Task_31_Numeric_Hollow_Pyramid {
    public static void main(String[] args) {
        int totalNumberOfRows = 5;

        for (int row = 1; row <= totalNumberOfRows; row++) {

            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row  || row == totalNumberOfRows){
                    System.out.print(col);
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
