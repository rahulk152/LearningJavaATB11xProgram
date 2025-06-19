package ex_01_JavaConcept.ex_08_Switch;

public class Lab045_Interview {
    public static void main(String[] args) {
        int a = 10;
        switch (a) {

        }
 //       boolean b = true;
//        switch (b) {
//        }
        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }
        long a11 = 30l;
        switch ((int) a11) {
        }
        int c = 98;
        switch (c) {
            case 98:
                System.out.println("98");
//            case 98:
//                System.out.println("98");
        }
        int d = 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
        char code = 'C';
        switch (code){
            default:
                System.out.println("Hellooooooo");
                break;
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}
