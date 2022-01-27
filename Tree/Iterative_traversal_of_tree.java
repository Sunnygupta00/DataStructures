package tree;

import java.util.*;

public class Iterative_traversal_of_tree {

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
//		System.out.println();

	}

//*******************************************************************************
//----------------------PostOrderTraversal-----------------------------------------
//********************************************************************************	
//  APPROACH: Using two Stack
//	Take two stack: insert root
//  then pop it from first , store in second stack
//	then insert left and right of poped node, then again pop top() again store in stack
//	repeat until stack is empty at last pop all elements of second stack.
	private static void postorder(Node root) {
		List<Integer> post = new ArrayList<>();
		if (root == null)
			return;
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.push(root);
		while (s1.size() > 0) 
		{
			Node curr = s1.pop();
			s2.push(curr); 
			if (curr.Left != null) {
				s1.push(curr.Left);
			}
			if (curr.Right != null) {
				s1.push(curr.Right);
			}
		}
		while (s2.size() > 0) {
			post.add(s2.pop().key);
		}
		System.out.println(post);
	}

// APPROACH: using one Stack
//	
	private static void postorderonestack(Node root) {
		// creating list to store
		List<Integer> post = new ArrayList<>();
		// if null then return;
		if (root == null)
			return;
		// creating stack
		Stack<Node> s = new Stack<>();
		// storing head
		Node curr = root;
		while (s.size() > 0 || curr != null) {
			// if curr is not null
			if (curr != null) {
				s.push(curr);
				curr = curr.Left;
				// move to left
			} else {
				// if left is null then move to right
				Node temp = s.peek().Right;
				// if right is also null
				if (temp != null) {
					// right side is null, no need to visit, so pop out the node,
					// we can add to list
					temp = s.pop();
					// add to list
					post.add(temp.key);
					// checking whether the node is not visited early
					while (!s.isEmpty() && temp != s.peek().Right) {
						// if visited pop it;
						temp = s.pop();
						// add to list
						post.add(temp.key);
					}

				}
				// if not null update curr
				else {
					curr = temp;
				}

			}
		}
		System.out.println(post);
	}
//*******************************************************************************
//----------------------PREorderTraversal-----------------------------------------
//********************************************************************************	
// APPROACH:
//	In Preorder traversal we have first insert our root in stack,print it then
//  as we know stack is LIFO, so we will first insert (if Not null) right then (if not null) left; 
//	pop out top then follow second step; 

	private static void preorder(Node root) {
		List<Integer> one = new ArrayList<Integer>();
		if (root == null)
			return;
		Stack<Node> s = new Stack<>();
		s.push(root);
		while (s.size() > 0) {

			Node curr = s.pop();
			one.add(curr.key);
//			System.out.print(curr.key + "<-");
			if (curr.Right != null) {
				s.push(curr.Right);
			}
			if (curr.Left != null) {
				s.push(curr.Left);
			}
		}
		System.out.println(one);

	}

//*******************************************************************************
//----------------------InorderTraversal-----------------------------------------
//********************************************************************************	
// APPROACH:
//	In indorder traversal we have first go at last of left side then, we push node until 
//  there is no node(null) in left , then pop out last inserted node print it, then go for right side; 
	private static void inorder(Node root) {

		List<Integer> res = new ArrayList<>();
		Stack<Node> s = new Stack<>();
		Node curr = root;
		while (true) {
			if (curr != null) {
				s.push(curr);
				curr = curr.Left;
			} else {
				if (s.isEmpty())
					break;
				curr = s.pop();
				res.add(curr.key);
				curr = curr.Right;
			}
		}
		System.out.println(res);
	}

}
