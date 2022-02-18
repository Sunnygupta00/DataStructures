package tree;
import java.util.*;
public class Tree_23_ChildrenSumProperty {
	// basic idea:
    //	           WE ARE CHEKING IF SUM OF CHILD NODE IS GRETER THAN PARENT UPDATE PARENT ELSE UPDATE KIDS WITH PARENT VALUE
	//             AT LAST PUT THE SUM OF VALUES OF KIDS TO ITS PARENT NODE 
     static void childsum(Node root)
     {
    	 if(root==null)return;
    	 // CALCULATING CHILD SUM
    	 int childS=0;
    	 if(root.Left!=null)childS+=root.Left.key;
    	 if(root.Right!=null)childS+=root.Right.key;
    	 //IF CHILDSUM IS GREATER MEANS WE HAVE TO UPDATE ROOT
    	 if(childS>root.key)root.key=childS;
    	 //ELSE UPDATE CHILD
    	 else {
    		 if(root.Left!=null)root.Left.key=root.key;
    		 else if(root.Right!=null)root.Right.key=root.key;
    	 }
    	 // TRAVERSE LEFT
    	 childsum(root.Left);
    	 // TRAVERSE RIGHT
    	 childsum(root.Right);
    	 // CALCULATE CHILD SUM
    	 int totalS=0;
    	 if(root.Left!=null)totalS+=root.Left.key;
    	 if(root.Right!=null)totalS+=root.Right.key;
    	 // NOW REPLACE ROOT VALUE WITH TOTAL CHILDSUM
    	 if(root.Left!=null||root.Right!=null)root.key=totalS;
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
childsum(root);
bfs(root);


	}
	private static void bfs(Node root) {

		if(root==null)return;
		Queue<Node>q=new ArrayDeque<>();
		List<List<Integer>>ans=new ArrayList<>();
		q.offer(root);
		while(q.size()>0)
		{
			int size=q.size();
			List<Integer>level=new ArrayList<>();
			for(int i=0;i<size;i++)
			{
				Node curr=q.poll();
				level.add(curr.key);
				if(curr.Left!=null)q.offer(curr.Left);
				if(curr.Right!=null)q.offer(curr.Right);
			}
			ans.add(level);
		}
		for(List<Integer>s:ans)
		{
			System.out.println(s);
		}
		
	
	}

}
