package ex_32_Collection_Framework_DSA.LIST;

import java.util.LinkedList;

public class Lab245_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();

        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        System.out.println("LinkedList: " + animals);

        System.out.println("First Element: " + animals.getFirst());
        System.out.println("Last Element: " + animals.getLast());

        animals.removeFirst();
        animals.removeLast();
        System.out.println("LinkedList after removal: " + animals);

        System.out.println("Size of LinkedList: " + animals.size());

    }
}
