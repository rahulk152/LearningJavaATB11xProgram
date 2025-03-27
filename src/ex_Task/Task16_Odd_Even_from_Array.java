package ex_Task;

public class Task16_Odd_Even_from_Array {
    public static void main(String[] args) {
        int [] array = {10, 56, 75, 98, 99, 53, 61, 57};
        System.out.println("For Loop : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                System.out.println("Even Number : " +array[i]);
            }else {
                System.out.println("Odd Number : " +array[i]);
            }
        }
        System.out.println("---------------------------");
        int [] arr = {5, 41, 65, 37, 23, 83, 9, 8};
        System.out.println("For Each Loop : ");
        for (int num : arr){
            if (num%2 == 0) {
                System.out.println("Even Number : " +num);
            }else {
                System.out.println("Odd Number : " +num);
            }
        }
    }
}
