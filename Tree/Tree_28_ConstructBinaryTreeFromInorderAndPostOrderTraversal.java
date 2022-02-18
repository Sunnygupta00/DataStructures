package tree;

public class Tree_28_ConstructBinaryTreeFromInorderAndPostOrderTraversal {
	static Node BuildTree(int []inorder,int []preorder)
	{
		if(inorder.length!=preorder.length)return null;
		int length=inorder.length-1;
		return helper(inorder,0,length,preorder,0,length);
	}
	private static Node helper(int[] inorder, int inStart, int inEnd , int[] preorder, int preStart, int preEnd) {
		if(inStart>inEnd)return null;
		int rootval=preorder[preStart];
		Node root=new Node (rootval);
		// 	NOW FINDING ROOT VALUE IN INORDER 
	     int rootindex=inStart;
	     for(;rootindex<inEnd+1;rootindex++)
	     {
	    	 if(inorder[rootindex]==rootval)
	    	 {
	    		 break;
	    	 }
	     }
	     root.Left=helper(inorder, inStart, rootindex-1	,preorder, preStart+1, preStart + rootindex - inStart);
	     root.Right=helper(inorder, rootindex+1, inEnd, preorder, preStart + rootindex - inStart+1, preEnd);
	  
		return root;
	}
	public static void main(String[] args) {
		int []inorder= {4,2,5,6,1,7,3,9,8,10};
		int preorder[]= {1,2,4,5,6,3,7,8,9,10};
		Node root=BuildTree(inorder, preorder);
		preorder(root);


	}
	static void preorder(Node root)
	{
		if(root==null)return ;
		System.out.print(root.key+"->");
		preorder(root.Left);
		preorder(root.Right);
	}

}
/*
        int LinS=inStart;
	    int LinE=rootindex-1;
	    int LpreS=preStart+1;
	    int LpreE=LinE-LinS+LpreS;
	    int RinS=rootindex+1;
	    int RinE=inEnd;
	    int RpreS=LpreE+1;
	    int RpreE=preEnd;
	    root.Left=helper(inorder, LinS, LinE, preorder, LpreS, LpreE);
	    root.Right=helper(inorder, RinS, RinE, preorder, RpreS, RpreE);
	    */
