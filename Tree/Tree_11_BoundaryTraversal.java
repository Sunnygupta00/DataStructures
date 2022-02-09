package tree;
//https://leetcode.com/discuss/interview-question/275467/uber-phone-screen-boundary-of-the-perfect-binary-tree
import java.util.*;

public class Tree_11_BoundaryTraversal {
	static boolean isleaf(Node root)
	{
		return root.Left==null	&& root.Right==null;
	}
	static void left(Node root,List<Integer> ans)
	{
		if(root==null||isleaf(root))return;
		ans.add(root.key);
		if(root.Left!=null)left(root.Left,ans);
		else left(root.Right,ans);
	}
	private static void boundary(Node root) {
		if(root==null)return;
		List<Integer>ans=new ArrayList<>();
		ans.add(root.key);
		left(root.Left,ans);
		 leaf(root,ans);
		 right(root.Right,ans);
		 System.out.println(ans);
	}
	private static void right(Node root, List<Integer> ans) {
		if(root==null||isleaf(root))return;
		if(root.Right!=null)right(root.Right,ans);
		else right(root.Left,ans);
		ans.add(root.key);
	}
	private static void leaf(Node root, List<Integer> ans) {
		if(root==null)return;
		if(isleaf(root))ans.add(root.key);
		leaf(root.Left,ans);
		leaf(root.Right,ans);
		
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
