package tree;
import java.io.*;
import java.util.*;
import java.lang.*;
public class BottomView {
	// we are just updating the last value
static void bottom(Node root)
{
	if(root==null)return;
	//map of levl and rootvalue
	Map<Integer,Integer>map=new TreeMap<>();

	Queue<PPP>q=new LinkedList<>();
	q.add(new PPP(root, 0));
	while(q.size()>0)
	{
		PPP temp=q.poll();
		Node curr=temp.node;
		int hight=temp.hight;
		// updating the value // yaha array nahi hai toh extra node ka koi issue nahi :)
		map.put(hight, curr.key);
		// going for left
		if(curr.Left!=null)q.offer(new PPP(curr.Left,hight-1));
		// going for right
	    if(curr.Right!=null) q.offer(new PPP(curr.Right,hight+1));

	}
	ArrayList<Integer>ans=new ArrayList<>();
	for(int a:map.values())ans.add(a);
	System.out.println(ans);
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
	    bottom(root);

	}

}
