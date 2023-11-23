import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class binaryheight {
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

        public static int height(node root){
            if(root==null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh)+1;
        }
        
        public static int count(node root){
            if(root==null){
                return 0;
            }
            int l = count(root.left);
            int r = count(root.right);
            return l+r+1;
        }
        public static int countsum(node root){
            if(root==null){
                return 0;
            }
            int l = countsum(root.left);
            int r = countsum(root.right);
            return l+r+root.data;
        }
        public static int diameter(node root){
             if(root==null){
                return 0;
            }
            int leftdiam=diameter(root.left);
            int leftheight=height(root.left);
            int rightdiam=diameter(root.right);
            int rightheight=height(root.right);

            int selfdiam = leftheight+rightheight+1;
            return Math.max(selfdiam, Math.max(rightdiam, leftdiam));

        }
        static class Info{
            int diam;
            int ht;
            public Info(int diam,int ht){
                this.diam=diam;
                this.ht=ht;
            }
        }
        public static Info diamtr(node root){
             if(root==null){
                return new Info(0, 0);
            }
            Info leftInfo = diamtr(root.left);
            Info rightInfo = diamtr(root.right);

            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht+rightInfo.ht+1); 
            int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

            return new Info(diam, ht);
        }
        public static boolean isIdentical(node noode, node subroot){
            if(noode==null && subroot==null){
                return true;
            }
            else if(noode==null || subroot== null || noode.data!=subroot.data){
                return false;
            }
            if(!isIdentical(noode.left, subroot.left)){
                return false;
            }
             if(!isIdentical(noode.right, subroot.right)){
                return false;
            }
            return true;
        }
        public static boolean isSubtree(node root, node subroot){
             if(root==null){
                return false;
            }
             if(root.data==subroot.data){
                if(isIdentical(root,subroot)){
                    return true;
                }
             }
             isSubtree(root.left, subroot);
            

             return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }
        static class Infoo{
            node nodee;
            int hd;
            public Infoo(node nodee, int hd){
                this.nodee=nodee;
                this.hd=hd;
            }
        }
        public static void topView(node root){
            //level order
            Queue<Infoo> q = new LinkedList<>();
            HashMap<Integer,node> map = new HashMap<>();

            int min=0, max = 0;
            q.add(new Infoo(root, 0));
            q.add(null);
             
            while (!q.isEmpty()) {
                Infoo curr = q.remove();
                if (curr == null) {// initialize krne ke bad and remove krne ke bad agar quwue null hai to vo null hai
                   if (q.isEmpty()) {
                      break;
                   }
                   else{
                    q.add(null);//agar empty nhi hai to next line ke liye null add krna hai
                   }
                }
               else{
                min = Math.min(min, curr.hd);
                max = Math.max(max, curr.hd);

                 if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.nodee);//agar map me key nhi hai to add akr denge
                }
                if(curr.nodee.left != null){
                    q.add(new Infoo(curr.nodee.left, curr.hd-1));// left side ke liye values update kardenge key aur value ke liye
                    min=Math.min(min, curr.hd-1);
                }
                if (curr.nodee.right != null) {
                    q.add(new Infoo(curr.nodee.right, curr.hd+1));
                }
               }
            }
            for (int i = min; i <= max; i++) {
                System.out.println(map.get(i).data); //min to max ke bich ki values jo hasmap me hai vo print kar denge
            }
            
            System.out.println();
     
        }
        public static void Klevel(node root, int level,int k){
            if(root==null){
                return ;
            }
            if (level==k) {
                System.out.println(root.data);
            }
            Klevel(root.left, level+1, k);
            Klevel(root.right, level+1, k);
        }
        public static boolean getPath(node root, int n, ArrayList<node> path){
            if (root==null) {
                return false;
            }
            path.add(root);
            if (root.data==n) {
                return true;
            }
                boolean foundLeft = getPath(root.left, n, path);
                boolean foundRight = getPath(root.right, n, path);

                if (foundLeft || foundRight) {
                    return true;
                }
                path.remove((path.size()-1));
                return false;
            }
        
        public static node lca(node root, int n1, int n2){
            ArrayList<node> path1 = new ArrayList<>();
            ArrayList<node> path2 = new ArrayList<>();
            getPath(root,n1,path1);
            getPath(root,n2,path2);
            
            //last common ancestor
            int i = 0;
            for (; i <path1.size() && i<path2.size(); i++) {
                if (path1.get(i)!=path2.get(i)) {
                    break;
                }
                
            }
            node lca = path1.get(i-1);
            return lca;

        }
        public static int Kancesstor(node root, int n,int k){
           if (root==null) {
              return -1;
           }
           if (root.data==n) {
               return 0; //overlapping condition ,ie the rood node and its ancesstor
           }

           int leftdis = Kancesstor( root.left,  n, k);
           int rightdis = Kancesstor( root.right,  n, k);

           if (leftdis==-1 && rightdis== -1) {
                return -1;
           }
           int max = Math.max(leftdis, rightdis);
           if (max+1==n) {
             System.out.println(root.data);
           }
           return max+1;
        }

    //      1
    //     / \
    //    2   3
    //   / \ / \
    // 4   5 6  7
public static void main(String[] args) {
    node root = new node(1);
    root.left=new node(2);
    root.right=new node(3);
    root.left.left = new node(4);
    root.left.right = new node(5);
    root.right.left = new node(6);
    root.right.right = new node(7);
    // System.out.println(height(root));
    // System.out.println(count(root));
    // System.out.println(countsum(root));
    // System.out.println(diameter(root));
    // System.out.println(diamtr(root).diam);
      
        //   2
        //  / \
        // 4   5
    node subroot = new node(2);
    subroot.left=new node(4);
    subroot.right=new node(5);

    // topView(root);
    // int k =3;
    // Klevel(root, 1, k);
    // int n2=7;
    // System.out.println(lca(root, 4, 5).data);
    int n = 4, k = 2;
   System.out.println( Kancesstor(root, n, k));


}
}
