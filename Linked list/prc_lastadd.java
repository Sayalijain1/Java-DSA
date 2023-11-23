public class prc_lastadd {
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

    //print function
    public void print(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;//increment index
        }
    }
    public void addLast(int data){
        node newNode = new node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void main(String[] args) {
        prc_lastadd ll = new prc_lastadd();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.print();
    }
}
