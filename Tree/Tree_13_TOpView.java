package tree;
//https://www.techiedelight.com/print-top-view-binary-tree/
import java.util.*;
class PPP {
	Node node;
	int hight;

	PPP(Node node, int y) {
		this.node = node;
		hight = y;

	}

}
public class Tree_13_TOpView {
	// if our node is not added add to it
   static List<Integer>top(Node root)
   {
	   List<Integer>ans=new ArrayList<Integer>();
	   if(root==null)return ans;
	   Map<Integer,Integer>map=new TreeMap<>();
	   Queue<PPP>q=new LinkedList<>();
	   q.offer(new PPP(root,0));
	   while(q.size()>0)
	   {
		   PPP temp=q.poll();
		   Node curr=temp.node;
		   int level=temp.hight;
		   map.putIfAbsent(level, curr.key);
		   if(curr.Left!=null)q.offer(new PPP(curr.Left,level-1));
		   if(curr.Right!=null) q.offer(new PPP(curr.Right,level+1));
	   }
	   for(Integer v:map.values())
	   {
		   ans.add(v);
	   }
	   return ans;
}
		
	public static void main(String[] args) {
		 /* Create following Binary Tree
      1
    /   \
    2    3
    \
     4
      \
       5
        \
        6
  */
    
      Node root = new Node(1);
   root.Left = new Node(2);
    root.Right = new Node(3);
    root.Left.Right = new Node(4);
    root.Left.Right.Right = new Node(5);
    root.Left.Right.Right.Right = new Node(6);
    System.out.println(top(root));
    

	}

}
