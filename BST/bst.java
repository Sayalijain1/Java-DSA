import java.util.*;

public class bst{
        static class node{
            int data;
            node left;
            node right;
            node(int data){
                 this.data=data;
            }
        }
        public static node insert(node root, int val){
            if (root == null) {
                root = new node(val);
                return root;
            }
            if (root.data > val) {
               root.left= insert(root.left, val);
            }else{
                root.right=insert(root.right, val);
            }
            return root;
        }
        public static void inorder(node root){
            if (root==null) {
                return;
            }
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }
        public static boolean search(node root, int key){
            if (root==null) {
                return false;
            }
            if (root.data==key) {
                return true;
            }
            if(root.data>key){
                return search(root.left, key);
            }
            else{
                return search(root.right, key);
            }
          
        }
        public static void printRange(node root, int k1, int k2){
            if (root==null) {
                return;
            }
            if (root.data>=k1 && root.data<=k2) {
                printRange(root.left, k1, k2);
                System.out.println(root.data+" ");
                printRange(root.right, k1, k2);
                
            } else if(root.data<k1){
                printRange(root.left, k1, k2);
            }
            else{
                printRange(root.right, k1, k2);
            }
        }
        public static boolean isValid_bst(node root,node min, node max){
            if (root==null) {
                return true;
            }
            if (min!=null && root.data<= min.data) {
                return false;
            }
            else if(max!=null && root.data>=max.data){
                return false;
            }
            return isValid_bst(root.left, min, root)
                &&  isValid_bst(root.right, root, max);
        }
        public static node createBST(int arr[],int st,int end){
            if (end<st) {
                return null;
            }
            int mid = (st+end)/2;
            node root = new node(arr[mid]);
            root.left=createBST(arr, st, mid-1);
            root.right=createBST(arr, mid+1, end);
            return root;

        }
         public static void preorder(node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        int arr[]={3,5,6,8,10,11,12};
        // node root = null;
         
        // for (int i = 0; i < values.length; i++) {
        //     root = insert(root, values[i]);
        // }

        // inorder(root);
        // System.out.println();
        // System.out.println(search(root, 5));
        // printRange(root, 5, 11);
        // if (isValid_bst(root, null, null)) {
        //     System.out.println("valid");    
        // } else {
        //     System.out.println("invalid");
        node root = createBST(arr, 0, arr.length-1);
        preorder(root);
        }
    
}
