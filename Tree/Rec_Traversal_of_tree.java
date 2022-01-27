package tree;
import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

class Node {
	int key;
	Node Left, Right;

	public Node(int item) {
		key = item;
		Left = Right = null;
	}
}

public class Rec_Traversal_of_tree {

	static void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.Left);
		System.out.print(root.key + "<-");
		inorder(root.Right);
	}

	private static void preorder(Node root) {
		if (root == null)
			return;
		System.out.print(root.key + "<-");
		preorder(root.Left);
		preorder(root.Right);

	}

	static void postorder(Node root) {

		if (root == null)
			return;

		postorder(root.Left);

		postorder(root.Right);
		System.out.print(root.key + "<-");
	}
	
	private static void levelorder(Node root) {
		if(root==null)return;
		Deque<Node>q=new LinkedList<>();
		q.offer(root);
		while(q.size()>0)
		{
			Node curr=q.poll();
			System.out.print(curr.key+"<-");
			if(curr.Left!=null)
			{
				q.offer(curr.Left);
			}
			if(curr.Right!=null)
			{
				q.offer(curr.Right);
			}
		}
		System.out.println();
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

		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
		levelorder(root);
		ArrayListLEvelorder(root);

	}


	private static void ArrayListLEvelorder(Node root) {
		List<List<Integer>>res=new LinkedList<>();
		if(root==null)return;
		Queue<Node>q=new LinkedList<>();
	     q.offer(root);
	     while(q.size()>0)
	     {
	    	 List<Integer>one=new LinkedList<>();
	    	 int size=q.size();
	    	 for(int i=0;i<size;i++)
	    	 {
	    		 Node curr=q.poll();
	    		 one.add(curr.key);
	    		 if(curr.Left!=null)
	 			{
	 				q.offer(curr.Left);
	 			}
	 			if(curr.Right!=null)
	 			{
	 				q.offer(curr.Right);
	 			}
	    	 }
	    	 res.add(one);
	     }
	     System.out.println(res);
		
	}

	static void printInorder(Node Node) {
		if (Node == null)
			return;

		/* first recur on Left child */
		printInorder(Node.Left);

		/* then print the data of Node */
		System.out.print(Node.key + " ");

		/* now recur on Right child */
		printInorder(Node.Right);
	}

	static void printPreorder(Node Node) {
		if (Node == null)
			return;

		/* first print data of Node */
		System.out.print(Node.key + " ");

		/* then recur on Left subtree */
		printPreorder(Node.Left);

		/* now recur on Right subtree */
		printPreorder(Node.Right);
	}

	static void printPostorder(Node Node) {
		if (Node == null)
			return;

		// first recur on Left subtree
		printPostorder(Node.Left);

		// then recur on Right subtree
		printPostorder(Node.Right);

		// now deal with the Node
		System.out.print(Node.key + " ");
	}

}
//                            traversal
//                                |
//                     -----------------------
//                     |                     |
//                    BFS                   DFS
//     (LEVEL ORDER TRAVERSAL)               |
//                              -------------------------
//                              |          |            |
//                            INORDER    PREORDER     POSTORDER
//                            {Left}      {ROOT}        {Left} 
//                            {ROOT}      {Left}       {Right}  
//                            {Right}     {Right}       {ROOT}  