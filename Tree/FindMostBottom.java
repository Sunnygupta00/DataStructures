package tree;

import java.util.LinkedList;
import java.util.Queue;

public class FindMostBottom {
    public static  int findBottomLeftValue(TreeNode root) {
     if(root==null)return 0;
        Queue<TreeNode>q=new LinkedList<>();
         TreeNode res=null;
        q.offer(root);
        while(q.size()>0)
        {
            int size=q.size();
           res=q.peek();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
        }
        return res.val;
    }
    public static void main(String[] args) {
    	/* Construct the following tree
        1
      /   \
     /     \
    2       3
          /   \
         /     \
        5       6
      /   \
     /     \
    7       8
          /   \
         /     \
        9      10
*/

TreeNode root = new TreeNode(1);
root.left = new TreeNode(2);
root.right = new TreeNode(3);
root.right.left = new TreeNode(5);
root.right.right = new TreeNode(6);
root.right.left.left = new TreeNode(7);
root.right.left.right = new TreeNode(8);
root.right.left.right.left = new TreeNode(9);
root.right.left.right.right = new TreeNode(10);
System.out.println(findBottomLeftValue(root));
	}
}