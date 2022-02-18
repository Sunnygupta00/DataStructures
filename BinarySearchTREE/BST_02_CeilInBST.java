package binarySearchTree;

public class BST_02_CeilInBST {
     static int ceil(TreeNode root,int val)
     {
    	 int ceil=0;
    	 while(root!=null)
    	 {
    		 // if we got our val return it
    		 if(root.val==val)return root.val;
    		 // if our value if big go to right
    		  if(val>root.val) {
    			  root=root.right;
    		  }
    		  // STORE PARENT VAL IN LEFT SIDE BECAUSE ITS PARENT WILL BE ALWAYS GREATER
    		  else {
    			  ceil=root.val;
    			  root=root.left;
    		  }
    	 }
    	 
    	 return ceil;
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
        System.out.println(ceil(root, 11));
        

	}

}
