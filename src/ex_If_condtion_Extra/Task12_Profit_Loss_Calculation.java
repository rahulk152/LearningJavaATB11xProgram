package ex_If_condtion_Extra;

import java.util.Scanner;

public class Task12_Profit_Loss_Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Selling Price : ");
        float sp = scanner.nextFloat();
        System.out.println("Enter the Cost price : ");
        float cp = scanner.nextFloat();
        if (sp > cp){
            float profit = sp - cp;
            System.out.println("The Profit : " +profit);
        } else if (cp > sp) {
            float loss = cp -sp;
            System.out.println("The Loss : " +loss);
        }else {
            System.out.println("No Profit No Loss");
        }

    }
}
