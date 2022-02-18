package binarySearchTree;

public class BST_09_LCAOFBST {
	//IDEA IF VALUES ARE LESSER THAN ROOT THEN SEACH IT ON LEFT IF VALUES ARE GREATER THAN ROOT SEARCH IT ON RIGH
	// OTHER WISE IT MEANS THEY LIE BELOW THEM 
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		 if(root==null)return null;
		 if(root.val>p.val&&root.val>q.val) {
			 return lowestCommonAncestor(root.left, p, q);
		 }else if(root.val<p.val&&root.val<q.val) {
			  return lowestCommonAncestor(root.right, p, q);
		 }else {
			 return root;
		 }
	 }
	public static void main(String[] args) {
		

	}

}
