package ex_01_JavaConcept.ex_22_OOPs_Access_Modifer.Police;

public class Cop {
    private int gun;
    String iCard;

    // Param Con
    public Cop(int bullet){
        this.gun = bullet;
    }

    // Method / Behav
    protected void canIShoot(){
        System.out.println("Yes You can shoot!");
    }

}
