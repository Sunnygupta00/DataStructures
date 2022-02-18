package tree;

public class Tree_27_ConstructBinaryTreeFromInorderAndPostOrderTraversal {
	static Node BuildTree(int []inorder,int []postorder)
	{
		if(inorder.length!=postorder.length)return null;
		int length=inorder.length-1;
		return helper(inorder,0,length,postorder,0,length);
	}

	private static Node helper(int[] inorder, int inStart, int inEnd , int[] postorder, int postStart, int postEnd) {
		if(inStart>inEnd)return null;
		// in post order Last Element will always be our root;
		int rootval=postorder[postEnd];
		// converting integer to node
		Node root=new Node(rootval);
		// now finding that node in INORDER TRAVERSAL
		int rootindex= inStart;
		for(;rootindex <= inEnd; rootindex++)
		{
		    // break if we have reached at that index
			if(inorder[rootindex]==root.key) break;
		    
		}
		// Calculating left subpart
		int leftTreeSize=rootindex-inStart;
		// calculating right subpart
		int rightTreeSize=inEnd-rootindex;
		// Solving LEFT part
		root.Left=helper(inorder, inStart, rootindex-1, postorder, postStart , postStart+leftTreeSize-1);
		// Solving Right part
		root.Right=helper(inorder, rootindex+1 , inEnd, postorder, postEnd-rightTreeSize, postEnd-1);
		return root;
	}

	public static void main(String[] args) {
		int []inorder= {4,2,5,6,1,7,3,9,8,10};
		int []postorder= {4,6,5,2,7,9,10,8,3,1};
		Node root=BuildTree(inorder, postorder);
		postorder(root);
	}
	static void postorder(Node root) {

		if (root == null)
			return;

		postorder(root.Left);

		postorder(root.Right);
		System.out.print(root.key + ",");
	}

}
