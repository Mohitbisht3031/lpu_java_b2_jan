/*
 * given root of a BT and an int val , return true if there exist any path with path 
 * sum equals to val . path tarts from root and ends at leaf node.
 */
public class Q1 {
    boolean checkPathSum(TreeNode r,int val){
        if(r == null)return false;
        if(r.left == null && r.right == null){
            return r.val == val;
        }
        int v = val-r.val;
        boolean ans1 = checkPathSum(r.left, v);
        boolean ans2 = checkPathSum(r.right, v);

        return ans1 || ans2;
    }
}
