package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab242_ArrayList {
    public static void main(String[] args) {

        ArrayList arraylist = new ArrayList();
        arraylist.add("shilpa");
        arraylist.add(null);
        arraylist.add("S");
        arraylist.add("S");// duplicate is allowed
        arraylist.add(123);

        System.out.println(arraylist);
        System.out.println(arraylist.size());

        List l = new ArrayList();//Dynamic Dispatch
        l.add("123");
        l.add("456");
        System.out.println(l);
        System.out.println(l.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());
    }
}
