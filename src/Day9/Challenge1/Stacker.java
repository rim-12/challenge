package Day9.Challenge1; //challenge3

import java.util.Stack;

public class Stacker {
    public static void main(String args[]) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int poppedValue = stack.pop();
        System.out.println("element retiré de la pile " + poppedValue);
        int topValue = stack.peek();
        System.out.println("element haut de la pile :  " + topValue);
        boolean isEmpty = stack.isEmpty();
        System.out.println("la pile est vide : " + isEmpty);
        for (int element:stack) {
            System.out.println(element);
        }

    }
}
