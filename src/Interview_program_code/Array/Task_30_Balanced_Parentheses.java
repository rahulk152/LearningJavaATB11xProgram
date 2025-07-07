package Interview_program_code.Array;

import java.util.Stack;

public class Task_30_Balanced_Parentheses {
    public static void main(String[] args) {
        String input = "()";
        System.out.println(checkParanthesis(input));



    }

    private static boolean checkParanthesis(String input) {
        char[] inputArray = input.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (char ch : inputArray) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (ch == ')'){
                    if (stack.empty()){
                        return false;
                    }else {
                        char topChar = stack.pop();
                        if (topChar != '('){
                            return false;
                        }
                    }
               }
            }
        }
        return stack.isEmpty();
    }
}
