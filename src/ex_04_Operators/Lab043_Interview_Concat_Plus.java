package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name= "Shilpa";
        String last_name= "S";

        int a = 10;
        int b = 20;

        System.out.println(first_name + last_name + a + b);
        //ShilpaS1020 -> first operator(String) -> performed as concatenation

        System.out.println(a + b + first_name + last_name);
        //30ShilpaS -> first operator(int) -> performed as concatenation

        System.out.println(first_name + last_name + (a + b));
        // BODMAS - Brackets Open Div Multi Add Sub


    }
}
