package Interview_program_code;

public class Task_04_Frequency_of_element_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] == -1) continue; // skip if already counted

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1; // mark as counted
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }

    }
}

