package ex_01_JavaConcept.ex_28_ENUM;

public class Lab126_ENUM {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());

        System.out.println("--------------------");

        System.out.println(Colors.RED.getHexcode());
        System.out.println(Colors.GREEN.getHexcode());

        System.out.println("--------------------");

        System.out.println(APIURLs.vwo.getUrl());
        System.out.println(APIURLs.google.getUrl());
    }
}
