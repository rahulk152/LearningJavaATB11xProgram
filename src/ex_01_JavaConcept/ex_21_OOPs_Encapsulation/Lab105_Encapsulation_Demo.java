package ex_01_JavaConcept.ex_21_OOPs_Encapsulation;

public class Lab105_Encapsulation_Demo {
    public static void main(String[] args) {
        VWOLogin vl = new VWOLogin("admin","12345");
        System.out.println(vl.username);
        vl.password = "47859";
        System.out.println(vl.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin", "pwd123");
//        System.out.println(vwoLogin1.password);
//        System.out.println(vwoLogin1.username);

        vwoLogin1.setUsername("Rahul");
        System.out.println(vwoLogin1.getUsername());

        System.out.println(vwoLogin1.getPassword());

        vwoLogin1.setPassword("12345",false);
        System.out.println(vwoLogin1.getPassword());

    }



}
class VWOLogin{
    public String username;
    public String password;

    VWOLogin(String usr, String pwd){
        this.username = usr;
        this.password = pwd;
    }
}

class GoodVWOLogin{
    private String username;
    private String password;

    public GoodVWOLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        }else{
            System.out.println("Not allowed to change the password!");
        }
    }
}