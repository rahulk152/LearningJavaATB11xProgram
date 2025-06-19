package ex_01_JavaConcept.ex_19_OOPs_Inheritance.Multiple_Level_inheritance;

public class Lab098_Multiple_Level_Inheritance {
    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.gf();

        System.out.println(" ----- ");

        Father f1 = new Father();
        f1.f();
        f1.gf();

        System.out.println(" ----- ");

        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();

    }
}
