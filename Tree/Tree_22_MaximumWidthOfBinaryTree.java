package tree;
import java.util.*;
// Question : Calculate maximum Width : means do end nodes ke bitch kine maximum nodes ho sakte hai

public class Tree_22_MaximumWidthOfBinaryTree {
	// created a pair
	static private class Jodi {
		Node node;
		int id;

		Jodi(Node n, int i) {
			node = n;
			id = i;
		}
}
	// logic is to give the indices to nodes at last return first-last+1
	// to maintain overflow we are using min to maintain limit;
	static int maxWidth(Node root)
	{
		if(root==null)return 0;
		int ans=0;
		Queue<Jodi>q=new LinkedList<>();
		q.offer(new Jodi(root,0));
		while(q.size()>0)
		{
			int size=q.size();
			// always min will be peek one because of FIFO
			int min=q.peek().id;
			// initializing first and last just to store the indices of first root and last root
			int first=0,last=0;
			for(int i=0;i<size;i++)
			{
				Jodi temp=q.poll();
				// maintaining overflow
				int curr_id=temp.id-min;
				Node curr=temp.node;
				if(i==0)first=curr_id;
				if(i==size-1)last=curr_id;
				if(curr.Left!=null)q.offer(new Jodi(curr.Left,curr_id*2+1));
				if(curr.Right!=null)q.offer(new Jodi(curr.Right,curr_id*2+2));
			}
			ans=Math.max(ans, last-first+1);
		}
		return ans;
	}
	// recursive one
	static int max=1;
	static int width(Node root)
	{
		if(root==null)return 0;
		List<Integer>startofLevl=new ArrayList<>();
		dfs(root,0,1,startofLevl);
		return max;
	}
	// our main logic is to store starting index of all level 
	/*
	 Ex:        1(1)
	          /   \
	         2(2)  3(3)
	        /       \
	       4(4)      5(7)
	        \        /
	         6(9)    7(10)
	      ----------------------   
	       LEVEL(i)[0][1][2][3]
   	      ----------------------
	       INDEXs  [1][2][4][9] 
  	      -----------------------
	 */
	private static void dfs(Node root, int level, int index, List<Integer> list) {
		if(root==null)return;
		if(list.size()==level)list.add(index);
		max=Math.max(max, index+1-list.get(level));
		dfs(root.Left, level+1, index*2, list);
		dfs(root.Right, level+1, index*2+1, list);
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
        // there will me 16 max width
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
System.out.println(maxWidth(root));
width(root);
System.out.println(max);

	}

}
//My Wrong Approach ;)
//static int maxWidth(Node root)
//{
//	if(root==null)return 0;
//	Queue<Node >q=new LinkedList<>();
//	q.offer(root);
//	int maxNode=0;
//	int level=0;
//    int l=0;
//	while(q.size()>0)
//	{
//		int size=q.size();
//		l++;
//		int node=0;
//		for(int i=0;i<size;i++)
//		{
//			Node curr=q.poll();
//			node++;
//			if(curr.Left!=null)
//			{
//				q.offer(curr.Left);
//			}
//			if(curr.Right!=null)
//			{
//				q.offer(curr.Right);
//			}
//		}
//		if(node>=maxNode)
//		{
//			maxNode=node;
//			level=l;
//		}
//
//	}
//	return (int) Math.pow(2, level-1);
//}
//
