package tree;

public class Tree_08_BinaryTreeMaximumPathSum {
	static int max;
	static int maximumPathsum(Node root )
	{
		if(root==null)return 0;
		max=Integer.MIN_VALUE;
		maximumPath(root);
		return max;
	}
	// this will calculate maximum path
	static int maximumPath(Node root)
	{
		if(root==null)return 0;
		// taking maximum left path
		int left=Math.max(maximumPath(root.Left),0);
		// taking maximum right path
		int right=Math.max(maximumPath(root.Right),0);
		// updating maximum path sum with max maximum path sum
		max=Math.max(max, left+right+root.key);
		// returning maximum path
		return Math.max(left, right)+root.key;
	}
	

	public static void main(String[] args) {

		Node root = new Node(1);
		root.Left = new Node(2);
		root.Right = new Node(3);
		root.Left.Left = new Node(4);
		root.Left.Right = new Node(5);
		root.Right.Right = new Node(8);
		root.Right.Left = new Node(7);
		root.Left.Right.Right = new Node(6);
		root.Right.Right.Left = new Node(9);
		root.Right.Right.Right = new Node(10);
		System.out.println(maximumPathsum(root));
       
	}

}
