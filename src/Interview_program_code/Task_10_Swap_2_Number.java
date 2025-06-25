package Interview_program_code;

public class Task_10_Swap_2_Number {
    public static void main(String[] args) {
        swapmath num1 = new swapmath();
        swapopr num2 = new swapopr();
        swapWithThirdvar num3 = new swapWithThirdvar();
        num1.mathopr();
        num2.oprator();
        num3.thridvar();

    }


}
class swapWithThirdvar{
    int a = 10;
    int b = 20;
    int temp = 0;

    public void thridvar(){
        temp = a;
        a = b;
        b = temp;
        System.out.println("=========");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
}

class swapmath{
    int a = 10;
    int b = 20;

    public void mathopr(){

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }


}
class swapopr{
    int c = 30;
    int d = 40;
    public void oprator(){
        c = c^d;
        d = c^d;
        c = c^d;
        System.out.println("======================");
        System.out.println("a = " +c);
        System.out.println("b = " +d);
    }
}