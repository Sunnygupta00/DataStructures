package tree;
import java.util.*;
public class Tree_15_bottomView {
static void bottomview(Node root)
{
	if(root==null)return;
	Map<Integer,Integer>map=new TreeMap<>();
	Queue<PPP>q=new LinkedList<>();
	q.add(new PPP(root,0));
	while(q.size()>0)
	{
		PPP temp=q.poll();
		Node curr=temp.node;
		int h=temp.hight;
		map.put(h, curr.key);
		if(curr.Left!=null)q.offer(new PPP(curr.Left,h-1));
		if(curr.Right!=null)q.offer(new PPP(curr.Right,h+1));
	}
	ArrayList<Integer>ans=new ArrayList<>();
	for(int a:map.values())
	{
		ans.add(a);
	}
	System.out.println(ans);
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
bottomview(root);

	}

}
