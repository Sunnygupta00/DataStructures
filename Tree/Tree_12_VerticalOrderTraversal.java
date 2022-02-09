package tree;
import java.util.*;
// due to java version problem you might get error but the ans is correct
class Triple{
	Node node;
	int ver;
	int levl;
	Triple(Node node,int ver,int levl)
	{
		this.node=node;
		this.ver=ver;
		this.levl=levl;
	}
}

public class Tree_12_VerticalOrderTraversal {
	// bfs
	private static List<List<Integer>> verticalorder(Node root) {
		// storing here
		// vertical,level,priorityqueue of nodes
		TreeMap<Integer,TreeMap<Integer,PriorityQueue>>map=new TreeMap<>();
		// storing ver,level,root
		Queue<Triple>q=new LinkedList<>();
	   q.offer(new Triple(root,0,0));
	   while(q.size()>0)
	   {
		   Triple temp=q.poll();
		   Node curr=temp.node;
		   int x=temp.ver;
		   int y=temp.levl;
		   // if x ka key nahi hai toh create a object of key
		   if(!map.containsKey(x))
		   {
			   map.put(x, new TreeMap<Integer,PriorityQueue>());
		   }
		   // if x ke key key y ke key nahi hai toh create a object of key
		   if(!map.get(x).containsKey(y))
		   {
			   map.get(x).put(y, new PriorityQueue<>()); 
		   }
		   // then add root key
		    map.get(x).get(y).offer(curr.key);
		    // if there is left 
		    if(curr.Left!=null)
		    {
		    	q.offer(new Triple(root,x-1,y+1));
		    }
		    // if there is right
		    if(curr.Right!=null)
		    {
		    	q.offer(new Triple(root,x+1,y+1));
		    }
		   
	   }
	   List<List<Integer>> list = new ArrayList<>();
	   // taking values of map
	   for (TreeMap<Integer, PriorityQueue> ys : map.values()) {
           list.add(new ArrayList<>());
           // taking values of priority queue
           for (PriorityQueue<Integer> nodes : ys.values()) {
               while (!nodes.isEmpty()) {
                   list.get(list.size() - 1).add(nodes.poll());
               }
           }
       }
     
		return list;
	}
	
	public static void main(String[] args) {
		/* Construct the following tree
        1
     /     \
    2       3
   / \     / \
  4   6   5   7
*/

Node root = new Node(1);
root.Left = new Node(2);
root.Right = new Node(3);
root.Right.Left = new Node(5);
root.Right.Right = new Node(7);
root.Left.Left=new Node(4);
root.Left.Right=new Node (6);

		System.out.println(verticalorder(root));
		

	}



}



//===========USING PRIORITY QUEUE AND LIST BUT FAILED ;)
//public static List<List<Integer>> verticalorder(Node root)
//{
//	List<List<Integer>>ans=new ArrayList<>();
//	if(root==null)return ans;
//	Map<Integer,PriorityQueue<Integer>>store=new TreeMap<>();
//	Queue<PP>q=new LinkedList<>();
//	int hd=0;
//	q.offer(new PP(root,hd));
//	while(q.size()>0)
//	{
//		PP temp=q.poll();
//		Node curr=temp.root;
//	    hd=temp.hDistance;
//	    PriorityQueue<Integer>element=store.get(hd);
//	    if(element==null)
//	    {
//	    	element=new PriorityQueue<Integer>();
//	    }
//	   element.add(curr.key);
//	   store.put(hd, element);
//	   if(curr.Left!=null)
//	   {
//		   q.offer(new PP(curr.Left,hd-1));
//	   }
//	   if(curr.Right!=null)
//	   {
//		   q.offer(new PP(curr.Right,hd+1));
//	   }
//	  		
//	}
//	for(Map.Entry<Integer,PriorityQueue<Integer>>it:store.entrySet())
//	{
//		List<Integer>ver=new ArrayList<>();
//		while(it.getValue().size()>0)
//		{
//			ver.add(it.getValue().poll());
//		}
//		ans.add(ver);
//	}
//	return ans;
//	
//}



