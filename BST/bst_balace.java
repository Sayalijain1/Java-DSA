import java.util.ArrayList;

public class bst_balace {
    static class node {
        int data;
        node left;
        node right;

        public node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getInorder(node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static node createBst(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        node root = new node(inorder.get(mid));
        root.left = createBst(inorder, st, mid - 1);
        root.right = createBst(inorder, mid + 1, end); // Corrected the index here
        return root;
    }

    public static node balancebst(node root) {
        // calculate inorder sequence
        ArrayList<Integer> inorder = new ArrayList();
        getInorder(root, inorder);

        // calculating balanced bst by sorted inorder
        root = createBst(inorder, 0, inorder.size() - 1);
        return root;

    }

    public static void main(String[] args) {
        //             8
        //         6       10
        //     5               11
        // 3                       12
        node root = new node(8);
        root.left = new node(6);
        root.left.left = new node(5);
        root.left.left.left = new node(3);
        root.right = new node(10);
        root.right.right = new node(11);
        root.right.right.right = new node(12);
        //             8
        //         5       11
        //     3     6   10     12
        // expected tree
        root = balancebst(root);
        preorder(root);
    }
}
