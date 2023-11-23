public class prc_createll {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data= data;
            this.next=null;

        }
    }
    public static node head;
    public static node tail;
    public static void main(String[] args) {
        prc_createll ll = new prc_createll();
        ll.head = new node(1);
        ll.head.next=new node(2);
    }
}
