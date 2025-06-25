package Interview_program_code;

public class Task_08_Find_2D_Array_Diagonal_Element {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.print("Primary Diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print( matrix[i][i] + " ");
        }
        System.out.print("\nSecondary Diagonal: ");
        for (int j = 0; j < matrix.length; j++) {
            System.out.print( matrix[j][matrix.length-1-j] + " ");
        }
    }
}
