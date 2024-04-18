package Day37;

import java.util.*;

public class QUEUE {
    public static void main(String[] args) {
        Queue<Integer> ll = new LinkedList<>();
        Queue<Integer> pq = new PriorityQueue<>((x,y) -> y.compareTo(x));

        pq.add(1);
        pq.add(50);
        pq.add(10);
        pq.add(3);
        pq.add(100);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.peek()+" "+pq.size()+" "+pq.isEmpty()+" "+pq.contains(2));
        for(var e:pq)System.out.println(e);
        // System.out.println(ll+" "+ll.size()+" "+ll.isEmpty());

        // System.out.println(ll.peek());
        // System.out.println(ll.poll());
        // for(var e:ll)System.out.println(e);
        // Iterator<Integer> it = ll.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
    }
}
