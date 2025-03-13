package ex_05_Ternary_Operator;

public class Lab025_Voter_age_P1 {
    public static void main(String[] args) {
        String age1 = args[0];
        int age = Integer.parseInt(age1);
        String canIVote = age >= 18 ? "Yes you can vote" : "No you can't vote";
        System.out.println(canIVote);

    }
}
