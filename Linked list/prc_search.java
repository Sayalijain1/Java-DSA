public class prc_search {
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
            System.out.println("linked list is empty");
            return;
        }
        node temp = head;
        while(temp!=null){
            System.out.print(temp.next+"->");
            temp=temp.next;
        }
    }
    public void addFirst(int data){
        node newNode = new node(data);
        if(head==null){
            head=tail=newNode;
            
        }
        newNode.next=head;
        head=newNode;

    }
    public int search(int key){
        node temp = head;
        int i =0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;

        }
        return -1;
    }
    public static void main(String[] args) {
        prc_search ll = new prc_search();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        int ans =ll.search(2);
        System.out.println("key found at :"+ans);
    }
}
