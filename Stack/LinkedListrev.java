package stackk;

class link
{
	int data;
	link next;
	link(int x)
	{
		data=x;
		next=null;
	}
}

public class LinkedListrev {
	
	static link insertbegin(link head,int data)
	{
		
		link temp=new link(data);
		if(head==null)return temp;
		temp.next=head;
		head=temp;
		return head;
	}
	static link insertend(link head,int data)
	{
		link temp=new link(data);
		if(head==null)return temp;
		link ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=temp;
		return head;
	}
   static link firstdelete(link head)
   {
	  if(head==null)return null;
	   return head.next;
   }
   static link lastdelete(link head)
   {
	   if(head==null)
	   {
		   return null;
	   }
	   if(head.next==null)
		   return null;
	   link ptr=head;
	   while(ptr.next.next!=null)
	   {
		   ptr=ptr.next;
	   }
	   ptr.next=null;
	   return head;
   }
	static void traverse(link head)
	{
		if(head==null)return;
	      link ptr=head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+"->");
			ptr=ptr.next;
		}
		System.out.println();
	}
	static int middle(link head)
	{
		if(head==null)return -1;
		link fast=head,slow=head;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}
	static link reverse(link head)
	{
		if(head==null)return null;
		 link curr=head;
		 link prev=null;
		 while(curr!=null)
		 {
			 link nx=curr.next;
			 curr.next=prev;
			 prev=curr;
			 curr=nx;
		 }
		 return prev;
	}
	public static void main(String[] args) {
		link head=null;
		head=insertbegin(head, 0);
		head=insertbegin(head, 1);
		head=insertbegin(head, 2);
		head=insertbegin(head, 3);
		head=insertbegin(head, 4);
		head=insertbegin(head, 5);
		head=insertend(head, 1);
		head=firstdelete(head);
		head=lastdelete(head);
		System.out.println(middle(head));
		traverse(head);
		head=reverse(head);
		traverse(head);
		
	}

}
