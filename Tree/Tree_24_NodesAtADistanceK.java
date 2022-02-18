package tree;
import java.util.*;
// The main idea is to store Parent nodes of all the nodes so that we can also traverse upward
// once u reached

public class Tree_24_NodesAtADistanceK {
	
static void distanceAtK(Node root,Node target,int k)
{
	if(root==null)return;
	// storing parent nodes of node 
	Map<Node,Node>parentMap=new HashMap<>();
	markParents(root, parentMap, target);
	Queue<Node>q=new LinkedList<>();
	// maintaining visited node so that it doesn't collide or repeat
	Set<Node>visited=new HashSet<>();
	q.offer(target);
	List<Integer>ans=new ArrayList<>();
	while(q.size()>0)
	{
		int size=q.size();
		for(int i=0;i<size;i++)
		{
		     Node curr=q.poll();
		     // marking visited
		     visited.add(curr);
		     // if we reached at level then pop it;
		     if(k==0)ans.add(curr.key);
		     // if currLeft is not null and IT SHOULD not visited
		     if(curr.Left!=null&& !visited.contains(curr.Left))
		     {
		    	 q.offer(curr.Left);
		    	 // MARK VISITED
		    	 visited.add(curr.Left);
		     }
		     // if CURRENT RIGHT is not null and IT SHOULD not visited
		     if(curr.Right!=null&& !visited.contains(curr.Right))
		     {
		    	 
		    	 q.offer(curr.Right);
		    	 // MARK VISITED
		    	 visited.add(curr.Right);
		     }
		     // CHECKING IF OUR PARENT NODE EXIST IF EXIST IS IT VISITED??
		     if(parentMap.containsKey(curr)&&!visited.contains(parentMap.get(curr)))
		     {
		    	 q.offer(parentMap.get(curr));
		    	 // MARK PARENT NODE VISITED
		    	 visited.add(parentMap.get(curr));
		     }
		    
		}
		// DECREASE THE LEVEL
		 k--;
	}
	System.out.println(ans);
	
}
// Storing all the parent Nodes of node
private static void markParents(Node root, Map<Node, Node> parent_track, Node target) {
	   Queue<Node> queue = new LinkedList<Node>();
	    queue.offer(root);
	    while(!queue.isEmpty()) { 
	        Node current = queue.poll(); 
	        if(current.Left != null) {
	            parent_track.put(current.Left, current);
	            queue.offer(current.Left);
	        }
	        if(current.Right != null) {
	            parent_track.put(current.Right, current);
	            queue.offer(current.Right);
	        }
	    }
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

distanceAtK(root, root.Right, 2);

}

	  
}
