//https://leetcode.com/problems/diameter-of-binary-tree/
package tree;

public class DiameterOfBinaryTree {
	// this is O(n*n)complexity
  static int max=Integer.MIN_VALUE;
	static int Diameter(Node root)
   {
	    if(root==null)return 0;
	    // calculate left node hight
	    int left=h(root.Left);
	    // calculate right node hight
	    int right=h(root.Right);
	    // update the max diameter
	    if(left+right>max)
	    {
	    	max=left+right;
	    }
	    // again do it for  left
	   Diameter(root.Left);
	   // again do it for  right
	   Diameter(root.Right);
	   // al last return max diameter
	   return max;
   }
	static int h(Node root)
	{
		if(root==null)return 0;
		return Math.max(h(root.Left), h(root.Right))+1;
	}
	// O(n)
	static int optimised(Node root)
	{
		if(root==null)return 0;
		// in java we can't pass the value by refrense that's why we are creating array
		int [] diameter=new int[1];
		hight(root,diameter);
		return diameter[0];
	}
	// basic idea is we are traversing in every node we are calculating hight
	// and also updating max diameter
	private static int hight(Node root, int diameter[]) {
		if(root ==null)return 0;
		// going for left
		int left=hight(root.Left,diameter);
		// going for right
		int right=hight(root.Right,diameter);
		 // storing max diameter
		 diameter[0]=Math.max(diameter[0], left+right);
		 // return hight of node
		return Math.max(left, right)+1;
	}
//	https://leetcode.com/problems/diameter-of-binary-tree/discuss/101132/Java-Solution-MaxDepth
//	refer this for more solution
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
		System.out.println(Diameter(root));
		System.out.println(optimised(root));


	}

}
