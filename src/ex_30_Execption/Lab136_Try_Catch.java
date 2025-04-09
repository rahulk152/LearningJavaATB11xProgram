package ex_30_Execption;

public class Lab136_Try_Catch {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (Exception e){
            System.out.println("ARE YOU FOOL. DIV BY ZERO?");
        }
        System.out.println("2");
    }
}
