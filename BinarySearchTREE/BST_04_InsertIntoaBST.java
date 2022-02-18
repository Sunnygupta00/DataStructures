package binarySearchTree;
import java.util.*;
// MAIN IDEA IS TO INSERT VAL IN LEAF AT RIGHT POSITION ACCORDING TO BST
public class BST_04_InsertIntoaBST {
	// RECURSIVE
	static TreeNode insert(TreeNode root,int val)
	{
		// IF MY ROOT IS NULL CREATE ROOT AND  RETURN IT 
		if(root==null)
		{
		   root=new TreeNode(val);
		   return root;
		}
		// IF VAL IS GREATER THAN ROOT VALUE INSERT IN RIGHT
		if(val>root.val)
		{
			root.right=insert(root.right, val);
		}
		//ELSE VAL IS SMALLER THAN ROOT VALUE INSERT IN LEFT
		else {
			root.left=insert(root.left, val);
		}
		return root;
	}
	// ITERATIVE
	static TreeNode insert1(TreeNode root,int val)
	{
		// IF MY ROOT IS NULL CREATE ROOT AND RETURN IT
		if(root==null)
		{
			return new TreeNode(val);
		}
		// CREATING A POINTER ..NAHI BANAYENGE TOH BHI CHALEGA
		TreeNode curr=root;
		while(curr!=null)
		{
			
			if(val<curr.val)
			{
				// IF WE REACHED AT LEAF CRATE NODE
				if(curr.left==null)
				{
					curr.left=new TreeNode(val);
					break;
				}
				curr=curr.left;
			}
			else {
				// IF WE REACHED AT LEAF CRATE NODE
				if(curr.right==null)
				{
					curr.right=new TreeNode(val);
					break;
				}
				curr=curr.right;
			}
		}
		return root;
	}
	public static void main(String[] args) {
		 /*
	    8
      /   \    
    4      12
  /  \    /  \
 2    6  10   14
 
	  */

      TreeNode root = new TreeNode(8);
      root.left = new TreeNode(4);
      root.right = new TreeNode(12);
      root.left.left = new TreeNode(2);
      root.left.right = new TreeNode(6);
      root.right.left = new TreeNode(10);
      root.right.right = new TreeNode(14);
      insert(root, 9);
      insert1(root, 11);
     levelorder(root);

	}
	private static void levelorder(TreeNode root) {
		if(root==null)return;
		Deque<TreeNode>q=new LinkedList<>();
		q.offer(root);
		while(q.size()>0)
		{
			TreeNode curr=q.poll();
			System.out.print(curr.val+"<-");
			if(curr.left!=null)
			{
				q.offer(curr.left);
			}
			if(curr.right!=null)
			{
				q.offer(curr.right);
			}
		}
		System.out.println();
	}

}
