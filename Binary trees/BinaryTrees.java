import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees{
    static class node{
        int data;
        node right;
        node left;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static node buildTree(int node[]){
            idx++;
            if (node[idx]==-1) {
                return null;
            }
            node newNode = new node(node[idx]);
            newNode.left=buildTree(node);
            newNode.right=buildTree(node);
            return newNode;
        }
        public static void preoredre(node root){
            //base case
            if (root==null) {
                return;
            }
            //firt rule
            System.out.println(root.data+" ");
            preoredre(root.left);
            preoredre(root.right);

        }
        public static void inoredre(node root){
            //base case
            if (root==null) {
                return;
            }
            //firt rule
            inoredre(root.left);
            System.out.println(root.data+" ");
            inoredre(root.right);

        }
         public static void postoredre(node root){
            //base case
            if (root==null) {
                return;
            }
            //firt rule
            postoredre(root.left);
            postoredre(root.right);
             System.out.println(root.data+" ");

        }
        //level oredre travrsal
        public static void leveloredr(node root ){
            if (root==null) {
                return;
            }
            Queue<node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                node currNode = q.remove();
                if (currNode==null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                }
                else{
                    System.out.println(currNode.data  );
                    if (currNode.left!=null) {
                        q.add(currNode.left);
                    } 
                    if (currNode.right!=null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        node root = tree.buildTree(node);
        System.out.println(root.data);
        tree.preoredre(root);
        System.out.println();
        tree.inoredre(root);
        System.out.println();
        tree.postoredre(root);
        System.out.println();
        tree.leveloredr(root);

    }
}