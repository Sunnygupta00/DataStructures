package tree;

import java.util.*;

public class Tree_05_Maximum_Depth_of_Binary_Tree {
	// DFS
	static int maxdepth(Node root) {
		if (root == null)
			return 0;
		int left = maxdepth(root.Left);
		int right = maxdepth(root.Right) ;
		return Math.max(left, right)+1;
	}

	// BFS
	static int maxdepthbyBFS(Node root) {
		int res = 0;
		if (root == null)
			return res;

		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (q.isEmpty() == false) {
			res++;
			int size = q.size();
			for (int i = 0; i < size; i++) {
				Node curr = q.poll();
				if (curr.Left != null) q.offer(curr.Left);

				if (curr.Right != null)q.offer(curr.Right);
	                            }
		}
		return res;
	}

	public static void main(String[] args) {
		/*
        1
      /   \
    2       3
  /   \    /  \
 4     5  7     8
        \     /  \
         6   9    10   

 */

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
		System.out.println(maxdepth(root));
		System.out.println(maxdepthbyBFS(root));
//		System.out.println(Math.abs(-1));

	}

}
