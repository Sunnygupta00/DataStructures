package stackk;

 class node{
		int data;
		node next;
		public node(int x) {
			data=x;
			next=null;
		}
	}

    class my{
	static node top;
	static int size;
	public static void push(int x)
	{
		node temp=new node (x);
		temp.next=top;
		top=temp;
	}
	public static int size() {
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public static int pop()
	{
		int x=top.data;
		top=top.next;
		return x;
	}
	public static void display()
	{
		node curr=top;
		while(curr!=null)
		{
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.println();
	}
	
}
public class StackwithLinkedList {
	

	public static void main(String[] args) {
		my s=new my();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.display();
		
		
	}

}
