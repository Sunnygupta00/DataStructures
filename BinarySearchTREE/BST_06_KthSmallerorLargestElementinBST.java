package binarySearchTree;

public class BST_06_KthSmallerorLargestElementinBST {
	/// Approach 1: do inorder and store in list and after that return kth element;;
	/// approach 2: do inorder while doing inorder count++ if count==k return val;
	static void ksmallest(TreeNode root,int count,int k)
	{
		if(root==null)return;
		
		ksmallest(root.right,count, k);
		count++;
		if(k==count) {
			System.out.println(root.val);
			return;
		}
		ksmallest(root.left, count, k);
		
	}
	/// Approach 1: do inorder and store in list and after that return n-kth element;;
		/// approach 2: do inorder while doing inorder count++ if count==n-k return val;
	

	 static int treSize(TreeNode root)
	 {
		 if(root==null)return 0;
		 return treSize(root.left)+treSize(root.right)+1;
	 }

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		TreeNode root=null;
		for(int a:arr)root=insert(root,a);
		ksmallest(root, 0,2);

	}
	static TreeNode insert(TreeNode root,int val)
	{
		if(root==null)return new TreeNode(val);
		if(val>root.val)root.left=insert(root.left, val);
		else if(val<root.val)root.right=insert(root.right,val);
		return root;
	}

}
