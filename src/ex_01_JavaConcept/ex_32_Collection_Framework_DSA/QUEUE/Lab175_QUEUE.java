package ex_01_JavaConcept.ex_32_Collection_Framework_DSA.QUEUE;

import java.util.PriorityQueue;

public class Lab175_QUEUE {
    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
        PriorityQueue q = new PriorityQueue();
        q.add("Rahul");
        q.add("Kumar");
        // PQ -> Natural - Sorting
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);

    }
}
