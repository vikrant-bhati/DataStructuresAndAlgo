package recursion.simple;
//https://leetcode.com/problems/increasing-order-search-tree/
public class IncreasingOrderTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }
    public TreeNode increasingBST(TreeNode root) {
        if(root.left==null){
            return root;
        }
        increasingBST(root.left);
        TreeNode head = root.left;
        TreeNode right= head.right;
        if (right != null) {
            while (right.right != null) {
                right = right.right;
            }
        }
        head.right=root;
        root.left=null;
        return head;
    }

}

