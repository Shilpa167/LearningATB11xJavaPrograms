package ex_04_Operators;

public class Lab040_Relational_Operators {
    public static void main(String[] args) {
        // < Less than
        // > Greater than
        // <= Less than or equal to
        // >= Greater than or equal to
        // == Equal to (but checking)
        // != Not Equal to

        //All of them will result boolean output

        int a = 10;
        int b = 30;
        boolean c = a > b; // 10>30

        System.out.println(c);

        int age_mamta = 34;
        int age_shruti = 34;
        boolean result = age_mamta >= age_shruti;
        System.out.println(result);

        //age_shruti > age_mamta or age_shruti = age_mamta


    }
}
