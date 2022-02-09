package tree;
import java.util.*;
public class PrintRootToPath {
        static  public List<String> binaryTreePaths(Node root) {
        	List<String>ans=new ArrayList<>();
        	if(root==null)return ans;
        	// if is is leaf node , insert it and return
        	if(root.Left==null&&root.Right==null)
        	{  
        		ans.add(Integer.toString(root.key));
        		return ans;
        	}
        	// iterating per node
        	//ex: for below example
        	//1->2
        	//1->s
//        	     -> (3->6)
        	// 1>3>6
        	// 1>3>
        	for(String s:binaryTreePaths(root.Left))
        	{
        		ans.add(Integer.toString(root.key)+"->"+s);
        	}
        	for(String s:binaryTreePaths(root.Right))
        	{
        		ans.add(Integer.toString(root.key)+"->"+s);
        	}
        	return ans;
        }
        static void ans(Node root,ArrayList<Integer>ans)
        {
        	if(root==null)return;
        	ans.add(root.key);
        	if(root.Left==null&&root.Right==null)
        	{
        		System.out.println(ans);
        	}
          	ans(root.Left, ans);
        	ans(root.Right, ans);
        	ans.remove(ans.size()-1);
        	
        	
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
System.out.println(binaryTreePaths(root));
ArrayList<Integer>ans=new ArrayList<>();

ans(root, ans);
	}

}
