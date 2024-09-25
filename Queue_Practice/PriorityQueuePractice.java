package Queue_Practice;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(9);
        pq.offer(34);
        pq.offer(26);
        pq.offer(44);
        pq.offer(43);
        System.out.println(pq);
    }
}
