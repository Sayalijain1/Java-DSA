public class practicell {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;
    public static void addFirst(int data){
        node newNode = new node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void addLast(int data){
        node newNode = new node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        newNode.next=tail;
        tail=newNode;
    }
    public void print(){
        if (head==null) {
            System.out.println("ll is empty");
        }
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    } 
    public void add(int indx,int data){
        if (indx==0) {
            addFirst(data);
            return;
        }
        node newNode = new node(data);
        size++;
        node temp = head;
        int i =0;
        while (i<indx-1) {
            temp=temp.next;
            i++;

        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;

        }
        if (size==1) {
            int val = head.data;
            head=tail=null;
        }
        int val = head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if (size==0) {
            System.out.println("ll is empty");
        }
        if (size ==1) {
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int serach(int key){
        node temp = head;
        int i =0;
        while(temp!=null){
            if (temp.data==key) {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public void reveres(){
        node prev=null;
        node curr = head = tail;
        node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public boolean isCycle(){
        node slow=head;
        node fast = head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow) {
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        
    }
    public static void main(String[] args) {
        practicell ll = new practicell();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.print();

    }
    
}
