// import java.util.LinkedList;
// import java.util.Queue;
// public class twoQuesue {
//  static class Stack{
//     static Queue<Integer> q1 = new LinkedList<>();
//     static Queue<Integer> q2 = new LinkedList<>();
     
//    public static boolean isEmpty(){
//       return q1.isEmpty() && q2.isEmpty();
//       //if both ques are empty then stack is empty

//    }
//    public static void push(int data){
//       if(!q1.isEmpty()){
//          q1.add(data);
//       }else{
//          q2.add(data);
//       }
//    }
//    public static int pop(){
//       if(isEmpty()){
//          System.out.println("empty stack!");
//          return -1;
//       }
//       int top = -1;
//       //case 1: elements rae in q1
//       if (!q1.isEmpty()) {
//          while (!q1.isEmpty()) {
//             //if q1 empty nahi hai to jab tak vo empty nahi hota tab tak
//             top = q1.remove();
//             //jo bhi element queue se remove hoga vo top me store ho jayega
//             if (q1.isEmpty()) {
//                break;
//                //if queue me ek hi elemt hoga to vo pop hoke top me store ho jayega aur ye loop vahi break ho jayega 

//             }
//             q2.add(top);
//             //if queue me 1 se jada elemnt hai to vo q2 me add ho jayenge

//          }
//       }
//       //case 2 - if elements are in q2
//       else{
//          while (!q2.isEmpty()) {
//             top = q2.remove();
          
//             q1.add(top);
//          }
//       }
//       return top;
//    }
//    public static int peek() {
//       if (isEmpty()) {
//          System.out.println("empty stack!");
//          return -1;
//       }
//       int top = -1;
//       // Case 1: Elements are in q1
//       if (!q1.isEmpty()) {
//          while (!q1.isEmpty()) {
//             top = q1.remove();
//             q2.add(top);
//          }
//       }
//       // Case 2: Elements are in q2
//       else {
//          while (!q2.isEmpty()) {
//             top = q2.remove();
//             q1.add(top);
//          }
//       }
   
//       // After restoring the elements, add the top element back to the original queue
//       if (!q1.isEmpty()) {
//          q1.add(top);
//       } else {
//          q2.add(top);
//       }
   
//       return top;
//    }
   

//  }
//   public static void main(String[] args) {
//    Stack s = new Stack();
//    s.push(1);
//    s.push(2);
//    s.push(3);
//    while(!s.isEmpty()){
//       System.out.println(s.peek());
//       s.pop();
//    }
//   }  
// }
// !for logic refer above code only and below code is just to run
import java.util.LinkedList;
import java.util.Queue;

public class  twoQuesue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            if (q1.isEmpty()) {
                q2.add(data);
            } else {
                q1.add(data);
            }
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Empty stack!");
                return -1;
            }
            int top = -1;
            // Case 1: Elements are in q1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            }
            // Case 2: Elements are in q2
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty stack!");
                return -1;
            }
            int top = -1;
            // Case 1: Elements are in q1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            }
            // Case 2: Elements are in q2
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            // After restoring the elements, add the top element back to the original queue
            if (!q1.isEmpty()) {
                q1.add(top);
            } else {
                q2.add(top);
            }

            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

