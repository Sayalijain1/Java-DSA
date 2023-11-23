public class prc_removeFirst {
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

    public void print(){
        if(head==null){
            System.out.println("ll is empty");
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public void affFirst(int data){
        node newNode = new node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public int remove(){
        if(size==0){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
        }
        int val = head.data;
        head=head.next;
        size--;
        return val;

    }
    public static void main(String[] args) {
        prc_removeFirst ll = new prc_removeFirst();
        ll.affFirst(1);
        ll.affFirst(2);
        ll.affFirst(3);
        ll.remove();
        ll.print();

    }
}
