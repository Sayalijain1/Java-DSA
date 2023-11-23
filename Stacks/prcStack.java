public class prcStack {
    static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack {
      node top;
      public boolean isEmpty(){
         return top==null;
      }
      public void push(int data){
        node newNode = new node(data);
        if(isEmpty()){
            top=newNode;
        }else{
           newNode.next=top;
           top=newNode;
           System.out.println(newNode+"pushed in stack");
        }
      }
    public int pop(){
         if(isEmpty()){
           System.out.println("empty");
        }
        int poppedval=top.data;
        top=top.next;
        return poppedval;
    }
    public int peek(){
        return top.data;
    }
        
    }
}
