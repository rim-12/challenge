package Day9.Challenge1;

import java.util.LinkedList;

public class Challenge5 {
    public static void main (String args[]) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println("size of the linkedlist is: " + list.size());


    }
}
