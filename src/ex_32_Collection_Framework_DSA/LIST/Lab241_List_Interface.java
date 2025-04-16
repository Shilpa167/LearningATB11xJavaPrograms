package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab241_List_Interface {
    public static void main(String[] args) {

       //List fruits = new  List(); //Cannot create an object as List is an interface

        List fruits = List.of("orange", "apple", "banana", "mango", "watermelon");//It is a static function in the interface -> New in JAVA13
        System.out.println(fruits);
        //fruits.add(chiku);//incomplete funtion
        //fruits.add(apple);// not possible

        List l = new ArrayList();//Dynamic Dispatch
        List l2 = new ArrayList();//
        l.add("hello");
        l.add(123);
        l.add(true);
        l.add("Blah Blah");

    }
}
