import java.util.PriorityQueue;
public class PriorityQueues{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}