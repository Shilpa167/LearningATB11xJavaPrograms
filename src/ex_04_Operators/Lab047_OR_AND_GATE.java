package ex_04_Operators;

public class Lab047_OR_AND_GATE {
    public static void main(String[] args) {
        // || -> OR GATE
        // false || false -> false otherwise true

        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(true || true);
        System.out.println(false || false);

        //AND && // only true && true -> true otherwise false

        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(true && true);
        System.out.println(false && false);
    }
}
