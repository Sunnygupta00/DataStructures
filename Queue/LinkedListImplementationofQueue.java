package queue;
class Node{
	int data;
	Node next;
	Node(int x)
	{
		data=x;
		next=null;
	}
}
class MyQueue
{
	static Node front;
	static Node rear;
	static int size;
	static int cap;
	public MyQueue(int x) {
      cap=x;
      size=0;
	}
	static void offer(int x)
	{
	   Node temp=new Node(x);
		if(size==0)
		{
		   front=temp;
		   rear=temp;
		   size++;
		}
		else {
			rear.next=temp;
			  rear=temp;
			  size++;
		}
	}
	static int poll()
	{
		if(size==0) return -1;
		int x=front.data;
		front=front.next;
		size--;
		return x;
	}
	static int first()
	{
		if(size==0)return -1;
		int x=front.data;
		return x;
		
	}
	static int rear()
	{
		if(size==cap)return -1;
		int x=rear.data;
		return x;
		
	}
	static void print()
	{
		if(size==0)return;
		for(Node curr=front;curr!=null;curr=curr.next)
		{
			System.out.print(curr.data+"<-");
		}
		System.out.println();
	}
}
public class LinkedListImplementationofQueue {
public static void main(String[] args) {
     MyQueue q = new MyQueue(5);
	q.offer(1);
	q.offer(2);
	q.offer(3);
	q.offer(4);
	q.offer(5);
	q.print();
	q.poll();
	q.poll();
	q.print();
}
}
