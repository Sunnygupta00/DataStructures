package tree;
import java.util.*;
public class Tree_21_LowestCommonAncestor {
	//basic idea ye hai ki agar dono node kisi node ke andar lie karte hai toh vo hi ans hai hamara
	 public static  Node lowestCommonAncestor( Node root, Node p, Node q) {
		 // while dfs traversal if we got our root return it
		 if(root==null||root.key==p.key||root.key==q.key)return root;
		 Node left=lowestCommonAncestor(root.Left, p, q);
		 Node right=lowestCommonAncestor(root.Right, p, q);
		 //if left is null means yaha pe vo node nahi hai it may be on right
		 if(left == null) {
	            return right;
	        }
		 // if right is null means left side me vo node hai so go for left
	        else if(right == null) {
	            return left;
	        }
		//both left and right are not null, we found our result
	        else { 
	            return root;
	        }
	 }

	public static void main(String[] args) {
		/* Construct the following tree
        1
      /   \
     /     \
    2       3
          /   \
         /     \
        5       6
      /   \
     /     \
    7       8
          /   \
         /     \
        9      10
*/

Node root = new Node(1);
root.Left = new Node(2);
root.Right = new Node(3);
root.Right.Left = new Node(5);
root.Right.Right = new Node(6);
root.Right.Left.Left = new Node(7);
root.Right.Left.Right = new Node(8);
root.Right.Left.Right.Left = new Node(9);
root.Right.Left.Right.Right = new Node(10);
Node ans=lowestCommonAncestor(root, new Node(7), new Node (6));
System.out.println(ans.key);
		
	}

}
