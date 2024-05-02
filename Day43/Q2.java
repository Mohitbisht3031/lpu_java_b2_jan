
/*
 * Given root of an BT return true if it have identical sub trees
 */
public class Q2 {
    boolean helper(TreeNode r1, TreeNode r2){
        if(r1 == null || r2 == null)return r1 == r2;
        if(r1.val != r2.val)return false;
        boolean ans1 = helper(r1.left, r2.left);
        boolean ans2 = helper(r1.right, r2.right);
        return (ans1 && ans2);
    }
    boolean identicalTree(TreeNode r){
        if(r == null)return true;
        return helper(r.left,r.right);
    }
}
