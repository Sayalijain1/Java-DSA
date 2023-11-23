public class prc_addFiirst {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static public node head;
    static public node tail;

    public void Print(){
        if(head==null){
           System.out.println("list is null");
        }
        node temp = head;
        while(temp!=null){
           System.out.print(temp.data+"->");
           temp=temp.next;
        }
     
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
    public static void main(String[] args) {
        prc_addFiirst ll = new prc_addFiirst();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.Print();
    }
}
