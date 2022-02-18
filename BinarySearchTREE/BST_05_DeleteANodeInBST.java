package binarySearchTree;

public class BST_05_DeleteANodeInBST {
	public static TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(key>root.val){
        	// call function for right side
            root.right = deleteNode(root.right,key);
        }else if(key<root.val){
        	// call function for left side
            root.left = deleteNode(root.left,key);
        }else{
            if(root.left==null){
            	// direct point to right side
                return root.right;
            }else if(root.right==null){
            	// direct point to left side
                return root.left;
            }else{
                TreeNode minNode = findMin(root.right);//Find left most node of the right subtree!
                root.val = minNode.val;//Change the value of the root to be deleted to the target value;
                root.right = deleteNode(root.right, minNode.val);//delete the left most node of the right subtree!
            }                     
            
        }
        
        return root;
    }
    
    
    
    private static TreeNode findMin(TreeNode node){
        while(node.left != null){
         node = node.left;
        }
        return node;
}
	public static void main(String[] args) {
		int arr[]= {3,2,5,4,10,8,15,7};
		TreeNode root=null;
		for(int a:arr)
		{
		 root= insert(root, a);
		}
		inorder(root);
		System.out.println();
		root=deleteNode(root, 5);
		inorder(root);

	}
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
	 public static void inorder(TreeNode root)
	    {
	        if (root == null) {
	            return;
	        }
	 
	        inorder(root.left);
	        System.out.print(root.val + " ");
	        inorder(root.right);
	    }
}
