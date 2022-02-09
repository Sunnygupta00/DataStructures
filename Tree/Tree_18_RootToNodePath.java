package tree;
import java.util.*;
public class Tree_18_RootToNodePath {
     static void solve(Node root,int x)
     {
    	 if(root==null)return;
    	 ArrayList<Integer>ans=new ArrayList<Integer>();
    	 path(root,ans,x);
    	 System.out.println(ans);
     }
	private static boolean path(Node root, ArrayList<Integer> ans, int x) {
	      //if it is null return false// means no path here
		  if(root==null)return false;
		  // add it to ans
	      ans.add(root.key);
	      // if we found the key return true;
	      if(root.key==x)return true;
	      // check whether left or right side contain element that element or not  
	      if(path(root.Left, ans, x)||path(root.Right, ans, x))return true;
	      // if above condition doesn't satisfy remove the element from ans
	      ans.remove(ans.size()-1);
	      // at last return false we don't find element
	      return false;
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
solve(root, 10);

	}

}
