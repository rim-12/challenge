package Day9.Challenge1; //Challenge4

import java.util.ArrayList;

public class Queue {
    public static void main(String args[]) {
        ArrayList<Integer> queue = new ArrayList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        if (!queue.isEmpty()) {
            queue.remove(0);
        } else {
            System.out.println("the queue is empty");
        }
        System.out.println("la nouvelle liste est ");
        System.out.println(queue);
        System.out.println("the element at the front is : " + queue.get(0));
    }
}
