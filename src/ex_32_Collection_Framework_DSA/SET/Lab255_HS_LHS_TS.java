package ex_32_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.Set;

public class Lab255_HS_LHS_TS {
    public static void main(String[] args) {

        Set<String> hs = new HashSet();
        //hasing mechanism to store duplicate

        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        //hs.add(123);
        hs.add(null);
        

        System.out.println(hs);

    }
}
