package ex_04_Operators;

public class Lab041_Logical_Operators {
    public static void main(String[] args) {

        boolean a = true;
        System.out.println(!a);//true -> false
        boolean b = true;
        System.out.println(!!b); // true -> false - > true

        boolean c = true || false; // OR Gate -> true OR flase -> true
        System.out.println(c);

    }
}
