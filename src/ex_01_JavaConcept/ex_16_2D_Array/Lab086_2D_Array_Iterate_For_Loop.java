package ex_01_JavaConcept.ex_16_2D_Array;

public class Lab086_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // 3x3
        // R -> 3
        // C -> 3

        // 1,2,3
        // 4,5,6
        // 7,8,9

        for (int i = 0; i < matrix.length; i++) { // 0 to 2 -> matrix.length -> Row
            for (int j = 0; j < matrix[i].length; j++) { // matrix[i].length -> Column
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
