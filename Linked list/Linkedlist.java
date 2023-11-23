// import practice.Node;
// import prc_addFiirst.node;

public class Linkedlist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
        
    public void addFirst(int data){
        //step 1-new node
        Node newNode = new Node(data);
        size++;
        //if linked list empty
        if(head==null){
            head=tail=newNode; 
            return;
        }

        //step 2-newNode next = head
        newNode.next= head;

        //step 3-head=newNode
        head=newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail = newNode;
    }
    public void print(){
        //base case
        if(head==null){
            System.out.println("ll is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public  void add(int indx,int data) {
        
        if(indx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<indx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public int removeFirst() {
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;

        }else if(size==1){
            int val = head.data;
            head=tail=null;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
        
    }
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail = null;
            size=0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        //not found
        return-1;
    }
    public void revserse(){
        Node prev = null;
        Node curr = tail=head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static boolean isCycle(){
        Node slow= head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
             slow= slow.next;//+1
             fast=fast.next.next;//+2
             if(slow==fast){
                return true;
             }
           
        }
        return false;
    }
    public static void removeCycle(){
        //step 1 detect cycle
        Node slow= head;
        Node fast = head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        // if cycle exist find meeting point
        slow=head;
        Node prev = null;//last node
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle->last.next=null
        prev.next=null;

    }
    // public Node mergeSort(Node head){
    //     if(head==null && head.next!=null){
    //         return head;
    //     }
    //     //find mid
    //     Node mid = getMid();
    //     //left & right ms
    //     Node rightHead = mid.next();
    //     mid.next=null;
    //     Node newLeft = mergeSort(head);

    // }
    public static void main(String[] args) {
        // Linkedlist ll = new Linkedlist();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.print();
        // System.out.println("the size is "+size);
        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println(ll.itrSearch(3));
        // System.out.println("the size is "+size);

        // ll.print();
        // ll.revserse();
        // ll.print();
        head = new Node(1);
        Node temp = new Node(2);
        head.next=temp;
        head.next.next= new Node(3);
        head.next.next.next=temp;
        // 1->2->3->2
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    
    }
    public int size() {
        return 0;
    }
    public String get(int slow) {
        return null;
    }
}