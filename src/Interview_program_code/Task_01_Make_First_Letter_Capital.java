package Interview_program_code;

public class Task_01_Make_First_Letter_Capital {
    public static void main(String[] args) {
        String input = "my name is ram";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize first letter, make rest lowercase
                String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                result.append(capitalized).append(" ");
            }
        }

        // Trim the final result to remove trailing space
        System.out.println(result.toString().trim());
    }
}

