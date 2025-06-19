package ex_01_JavaConcept.ex_22_OOPs_Access_Modifer;

public class Lab107 {

}
class Father{
    private int gold =10;
    protected int bhk3 =10;
    int car =1;
}

class Son extends Father{


    void getGold(){
//        System.out.println(gold);
        System.out.println(bhk3);
    }
}