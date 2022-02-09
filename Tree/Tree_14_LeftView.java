package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val)
	{
		this.val=val;
		left=null;
		right=null;
	}
}
public class Tree_14_LeftView {
	
	//Basic logic ye ki kabhi hamara index kahli hai toh d
   static void printleftutil(TreeNode root,ArrayList list,int level)
   {
	   if(root==null)return;
	   // if i am visting first time
	   if(list.size()==level)list.add(root.val);
	   printleftutil(root.left, list, level+1);
	   printleftutil(root.right, list, level+1);
   }
   static void printleft(TreeNode root)
   {
	   ArrayList<Integer>list=new ArrayList<>();
	   printleftutil(root, list, 0);
	  
	   System.out.println(list);
   }
//   public static  int findBottomLeftValue(TreeNode root) {
//     Queue<TreeNode>q=new ArrayDeque<>();
//     q.offer(root);
//     while(q.size()>0)
//     {
//    	 root=q.poll();
//    	if(root.right!=null)q.offer(root.right); 
//    	 if(root.left!=null)q.offer(root.left);
//     }
//     return root.val;
//       
//   }

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
printleft(root);
//System.out.println(findBottomLeftValue(root));

	}

}
