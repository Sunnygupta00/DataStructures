package tree;
import java.io.*;
import java.util.*;
import java.lang.*;
// GO FOR THIS BLOG: https://takeuforward.org/data-structure/preorder-inorder-postorder-traversals-in-one-traversal/
////As we know : pre-->RoLR---WE HAVE TO PRINT AT 1
//               in-->LRoR---WE HAVE TO PRINT AT 2
//               post->LRRo---WE HAVE TO PRINT AT 3
// USING THIS TRICK WE ARE GOING TO TRAVERSE PREPOSTIN ONE TAVERSAL
// IF WE ARE DEALING WITH 1 ADD TO PREORDER ++(INCREMENT) GO FOR LEFT
// IF WE ARE DEALING WITH 2 ADD TO INORDER ++(INCREMENT) GO FOR RIGHT
// IF WE ARE DEALING WITH 3 ADD TO POST ORDER
class Pair{
	Node root;
	int key;
	Pair(Node x,int y)
	{
		root=x;
		key=y;
	}
}
public class Tree_04_Pre_In_Post_InOneTraversal {
     public static void alltraverse(Node root)
     {
    	 Stack<Pair>s=new Stack<>();
    	 List<Integer>pre=new ArrayList<>();
    	 List<Integer>in=new ArrayList<>();
    	 List<Integer>post=new ArrayList<>();
    	 s.push(new Pair(root,1));
    	 while(s.isEmpty()==false)
    	 {
    		 Pair curr=s.pop();
    		 if(curr.key==1)
    		 {
    			 pre.add(curr.root.key);
    			 curr.key++;
    			 s.push(curr);
    			 if(curr.root.Left!=null)
    			 {
    				 s.push(new Pair(curr.root.Left,1));
    			 }
    		 }
    		 else if(curr.key==2)
    		 {
    			 in.add(curr.root.key);
    			 curr.key++;
    			 s.push(curr);
    			 if(curr.root.Right!=null)
    			 {
    				 s.push(new Pair(curr.root.Right,1));
    			 }
    		 }
    		 else {
    			 post.add(curr.root.key);
    		 }

    	 }
    	 System.out.println("Inorder: "+in);
    	 System.out.println("Preorder: "+pre);
    	 System.out.println("Postorder: "+post);
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

	  alltraverse(root);

	
		

	}

}
