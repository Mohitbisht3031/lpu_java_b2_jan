package Day41;

/*
 * given a BT root and return the sun of all the leaf nodes who are left child to there
 * parent
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}

public class Q1 {

    int dfs(TreeNode root, boolean isLeft){
        if(root == null)return 0;
        if(root.left == null && root.right == null){
            return (isLeft == true ? root.val : 0);
        }

        int ans1 = dfs(root.left , true);
        int ans2 = dfs(root.right, false);
        return ans1+ans2;        
    }

    int sumOfLeaf_rec(TreeNode root){
        if(root == null)return 0;
        return dfs(root,false);
    }
}
