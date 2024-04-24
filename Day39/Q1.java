class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}
public class Q1 {
    int sumOfLeaf(TreeNode root){
        if(root == null)return 0;
        if(root.left == null && root.right == null){
            return root.val;
        }
        int ans1 = sumOfLeaf(root.left);
        int ans2 = sumOfLeaf(root.right);

        return ans1+ans2;
    }
}
