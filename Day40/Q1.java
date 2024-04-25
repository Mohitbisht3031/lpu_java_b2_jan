package Day40;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}
public class Q1 {
    int sumOfLeaf_rec(TreeNode root){
        if(root == null)return 0;
        if(root.left == null && root.right == null){
            return root.val;
        }
        int ans1 = sumOfLeaf_rec(root.left);
        int ans2 = sumOfLeaf_rec(root.right);

        return ans1+ans2;
    }

    int sunOfLeaf_level(TreeNode root){
        if(root == null)return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int s = 0;
        while(!q.isEmpty()){
            TreeNode f = q.poll();
            if(f.left == null && f.right == null){
                s+=f.val;
            }
            if(f.left != null)q.add(f.left);
            if(f.right != null)q.add(f.right);
        }
        return s;
    }
}

