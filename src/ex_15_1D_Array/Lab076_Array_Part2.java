package ex_15_1D_Array;

public class Lab076_Array_Part2 {
    public static void main(String[] args) {
        String[] names =  {"pramod","amit","lucky"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]);


        String[] name_atb11x = new String[3];
        name_atb11x[0] = "Aditi";
        name_atb11x[1] = "Jitin";
        name_atb11x[2] = "Nikita";
        System.out.println(name_atb11x.length);
        System.out.println(name_atb11x[0]);
        System.out.println(name_atb11x[2]);
        System.out.println(name_atb11x[1]);

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] =  true;
        is_male_data[1] =  false;
    }
}
