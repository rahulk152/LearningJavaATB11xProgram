package ex_30_Execption;

import java.io.File;
import java.io.FileInputStream;

public class Lab149_Throws {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
        String s1 = null;
        s1.trim();
        int a = 10/0;
        File file = new File("");
    }

    static void t() throws Exception{
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
    }
}
