package tree;

import java.util.ArrayList;

import java.util.*;

public class Tree_11_BoundaryTraversal {
	// checking for leaf node 
	static boolean isleaf(Node root)
	{
		return root.Left==null&&root.Right==null;
	}
	// printing left part here we are not printing last nodes (leaf node)
	static void left(Node root,List<Integer>ans)
	{
		// if root is null or it is leaf node then return
		if(root==null||isleaf(root))return;
		// print key
		ans.add(root.key);
		// go to left
		if(root.Left!=null)left(root.Left,ans);
		// if left not there for right
		else left(root.Right,ans);
				
	}
	// printing right part here we are not printing last nodes (leaf node)
	static void right(Node root,List<Integer>ans)
	{
		// if root is null or it is leaf node then return
		if(root==null||isleaf(root))return;
		// go to right
		if(root.Right!=null)right(root.Right,ans);
		// if right is not there go for left
	    else right(root.Left,ans);
		// print the key
       ans.add(root.key);
	}
	static void leaf(Node root,List<Integer>ans)
	{   // if root is null return
		if(root==null)return;
		// if both right and left side is empty print it
		if(isleaf(root))ans.add(root.key);
		leaf(root.Left,ans);
		leaf(root.Right,ans);
	}
	static void boundary(Node root)
	{
		if(root==null)return;
		List<Integer>ans=new ArrayList<>();
		ans.add(root.key);
		left(root.Left,ans);
		leaf(root.Left,ans);
		leaf(root.Right,ans);
		right(root.Right,ans);
		System.out.println(ans);
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
		boundary(root);
		

	}
	
	
}
