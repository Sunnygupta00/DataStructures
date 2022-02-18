package binarySearchTree;

public class BST_03_FloorInBST {
	// FLOOR MEANS STRICTLY LESS AND EQUAL
    static int floor(TreeNode root,int key)
    {
    	int floor=-1;
    	while(root!=null)
    	{
    		//if i got my key return it
    		if(root.val==key)return root.val;
    		 // STORE PARENT VAL IN RIGHT SIDE BECAUSE ITS PARENT WILL BE ALWAYS SMALLER
    		if(key>root.val)
    		{
    			floor=root.val;
    			root=root.right;
    			
    		}
    		// move to left or we can say move to smaller side
    		else {
    			root=root.left;
    		}
    	}
		return floor;
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
      System.out.println(floor(root, 13));

	}

}
