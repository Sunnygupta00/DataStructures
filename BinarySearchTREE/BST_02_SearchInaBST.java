package binarySearchTree;

public class BST_02_SearchInaBST {
// we Are Searching 9;
	public static TreeNode search(TreeNode root,int val)
	{
		// RUNNING WHILE WE AREE NOT GETING OUR VALUE
		while(root!=null&&root.val!=val)
		{
			// IF VALUE IS LESS THAT ROOT MEANS WE HAVE TO SEARCH IT ON LEFT SIDE ELSE RIGHT SIDE
			root=val<root.val?root.left :root.right;
		}
		return root;
	}
	
	public static void main(String[] args) {
		 
		
		
		TreeNode root=new TreeNode(10);
		root.left=new TreeNode(7);
		root.right=new TreeNode(12);
		root.right.left=new TreeNode(11);
		root.right.right=new TreeNode(13);
		root.left.left=new TreeNode(4);
		root.left.right=new  TreeNode(8);
		root.left.right.right=new TreeNode(9);
		System.out.println(search(root, 8)==root.left.right?true:false);

	}

}
