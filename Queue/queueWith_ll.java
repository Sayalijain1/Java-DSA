import java.util.Queue;
public class queueWith_ll {
    
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static node head = null;
        static node tail = null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        public static void add(int data){
            node newNode = new node(data);
            if (head==null) {
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        public static int remove(){
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = head.data;
            if (tail==head) {
                tail=head=null;
            }else{
                head = head.next;
            }
            return front;
        }
         public static int peek(){
              if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
              }
              return head.data;
         }
    }
    public static void main(String[] args) {
        Queue  q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
