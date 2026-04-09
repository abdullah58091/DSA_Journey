package com.company.Queue;

import java.util.Stack;

public class Queue_using_2stacks {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty() {
        return s1.isEmpty();
    }

    public static void add(int data) {
        if (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(data);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public static int remove() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        return s1.pop();
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        return s1.peek();
    }


    public static void main(String[] args) {

       Queue_using_2stacks.add(1);
       Queue_using_2stacks.add(2);
       Queue_using_2stacks.add(3);

       while(!Queue_using_2stacks.isEmpty()){
           System.out.println(Queue_using_2stacks.peek());
           Queue_using_2stacks.remove();
        }
    }
}


