package tree;
import java.util.*;
public class Tree_25_MinimumTimeTakenToBurnTreeFromNode {
	// HERE BURN MEANS OUR GIVEN NODE WILL DELETE ITS LEFT,RIGHT AND PARENT NODE
	// THE MAIN IDEA: TO TRAVERSE UPWARD WE ARE CREATING MAP OF <ROOT , PARENT>
	// WE ARE ALSO MAINTAING THE VISITED NODE SO THAT WE DON'T COUNT IT AGAIN AND AGAIN
	// NOW MAINTING A FLAG WHICH MEANS WHETER WE HAVE BURNED ANY NODE OR NOT IF BURNED K++
	// AT LAST RETURN K
static int burn(Node root,Node target)
{
	if(root==null)return 0;
	Map<Node ,Node >parentmap=new HashMap<>();
	markMyParent(root,parentmap);
	Queue<Node>q=new LinkedList<>();
	q.offer(target);
	int k=0;
	HashSet<Node>visited=new HashSet<>();
	while(q.size()>0)
	{
		int size=q.size();
		// MAINTAIN FLAG BEACUSE SOME TIME WE ARE NOT BURNING ANY THING 
		int p=0;
		for(int i=0;i<size;i++)
		{
			Node curr=q.poll();
			visited.add(curr);
			// INSET WHEN LEFT NOT NULL AND ALSO NOT VISITED
			if(curr.Left!=null&&!visited.contains(curr.Left))
			{
				//MARK BURNED
				p=1;
				q.offer(curr.Left);
				visited.add(curr.Left);
			}
			if(curr.Right!=null&&!visited.contains(curr.Right))
			{
				// MARK BURNED
				p=1;
				q.offer(curr.Right);
				visited.add(curr.Right);
			}
			if(parentmap.containsKey(curr)&&!visited.contains(parentmap.get(curr)))
			{
				// MARK BURNED
				p=1;
				q.offer(parentmap.get(curr));
				visited.add(parentmap.get(curr));
			}
		}
		if(p==1)k++;
		
	}
	return k;
}
// STORING PARENT NODE OF NODES
	private static void markMyParent(Node root, Map<Node, Node> parentmap) {
	  Queue<Node >q=new LinkedList<>();
	  q.offer(root);
	  while(q.size()>0)
	  {
		  int size=q.size();
		  for(int i=0;i<size;i++)
		  {
			  Node curr=q.poll();
			  if(curr.Left!=null)
			  {
				  parentmap.put(curr.Left, curr);
				  q.offer(curr.Left);
			  }
			  if(curr.Right!=null)
			  {
				  parentmap.put(curr.Right, curr);
				  q.offer(curr.Right);
			  }
		  }
	  }
	
}
	public static void main(String[] args) {
		/*
        1
      /   \
    2       3
  /   \    /  \
 4       7     8
         

 */

	Node root = new Node(1);
	root.Left = new Node(2);
	root.Right = new Node(3);
	root.Left.Left = new Node(4);
    root.Left.Left.Right=new Node(7);
	root.Right.Right = new Node(8);
	root.Right.Left = new Node(7);


	System.out.println(burn(root, root.Left));


	}
	

}
