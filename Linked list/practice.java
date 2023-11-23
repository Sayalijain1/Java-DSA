public class practice{
    public static class Node{
        int data;
        Node next;//object of Node class
        public Node(int data){//constructor of class node
            this.data=data;
            this.next=null;
            //  this.data = data; and this.next = null;, this is a keyword in Java that refers to the current object instance. It is used to distinguish between the instance variable data and the parameter data that is passed to the constructor of the Node class.

        }
    }
    //this are propertis of class-->
    public static Node head;
    public static Node tail;

    public static int size;
    public static void main(String[] args) {

        practice ll = new practice();//object of a class
        //new node created in head-->
        ll.head = new Node(1);//this is data of node
        //head node points to next
        ll.head.next= new Node(2);
    }
}