package tree;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree_10_ZIGZAGTRAVERSAL {

	static void zig(Node root) {
		if(root==null)return ;
		List<List<Integer>>ans=new ArrayList<>();
		Queue<Node>q=new LinkedList<>();
		// maintaing flag
		boolean flag=true;
		q.offer(root);
		while(q.size()>0)
		{
			List<Integer>level=new ArrayList<>();
			int size=q.size();
			for(int i=0;i<size;i++)
			{
				Node curr=q.poll();
				if(flag)level.add(curr.key);
				else level.add(0,curr.key);
				if(curr.Left!=null)q.offer(curr.Left);
				if(curr.Right!=null)q.offer(curr.Right);
			}
			ans.add(level);
			flag=!flag;
					
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		zig(root);

	}

}
