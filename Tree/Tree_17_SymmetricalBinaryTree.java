package tree;

public class Tree_17_SymmetricalBinaryTree {
	// skew means mirror
      static boolean skewsymetric(Node root)
      {
    	  if(root==null)return true;
    	  return same(root.Left,root.Right);
      }
      static boolean same(Node a,Node b)
      {
    	  if(a==null||b==null)return a==b;
    	  return a.key==b.key && same(a.Left,b.Right)&& same(a.Right,b.Left);
      }
	public static void main(String[] args) {
/*
		  1
		/   \
		2    2
		 \    \
		 3     3
		 
 */
		Node root=new Node(1);
		root.Right=new Node(2);
		root.Left=new Node(2);
		root.Left.Right=new Node(3);
		root.Right.Right=new Node(3);
		System.out.println(skewsymetric(root));
		

	}

}
