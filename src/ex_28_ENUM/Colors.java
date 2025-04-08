package ex_28_ENUM;

public enum Colors {

    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String Hexcode;
    Colors(String hex){
        this.Hexcode = hex;

    }

    String getHexcode(){
        return  this.Hexcode;
    }
}
