public class prc_addnth {
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
    public void print(){
        if(head==null){
            System.out.println("ll is null");
        }
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void addFirst(int data){
        node newNode = new node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void add(int index,int data){
        node newNode = new node(data);
        if(index==0){
            addFirst(data);
            return;
        }
        int i = 0;
        node temp = head;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String[] args) {
        prc_addnth ll = new prc_addnth();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.add(2, 4);
        // ll.add(1, 5);
        ll.print();
    }
}
