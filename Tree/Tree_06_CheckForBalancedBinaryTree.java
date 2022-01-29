package tree;
import java.util.*;
public class Tree_06_CheckForBalancedBinaryTree {
// DFS
	
	public static boolean solDFS(Node root)
	{
		// check for balance
		return isBal(root)!=-1;
	}
	
private static int isBal(Node root) {
	if(root==null)return 0;
	// go to left
	int leftHight=isBal(root.Left);
	// if left is unbalanced return -1;
	if(leftHight==-1)
	{
		return -1;
	}
	// go to right
	int rightHight=isBal(root.Right);
	// if right is unbalanced return -1;
	if(rightHight==-1)
	{
		return -1;
	}
	//if abs differece is greater means unbalanced return -1;
	if(Math.abs(rightHight-leftHight)>1)
	{
		return -1;
	}
	// other wise return hight of node;
	return Math.max(leftHight, rightHight)+1;
}

// BFS
 public static boolean solBFS(Node root)
 {
	 if(root==null)return true;
	 Queue<Node>q=new ArrayDeque<>();
	 q.offer(root);
	 
	 while(q.size()>0)
	 {
		 Node curr=q.poll();
		 int left=0;
		 int right=0;
		 if(curr.Left!=null)
		 {
			 q.offer(curr.Left);
			 left=hight(curr.Left);
		 }
		 if(curr.Right!=null)
		 {
			 q.offer(curr.Right);
			 right=hight(curr.Right);
		 }
		 if(Math.abs(right-left)>1)
		 {
			 return false;
		 }
		 
	 }
	 return true;
	 
 }
	private static int hight(Node root) {
	 if(root==null)return 0;
	 return Math.max(hight(root.Left), hight(root.Right))+1;
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

	     System.out.println(solDFS(root));
	     System.out.println(solBFS(root));

	

	}

}
