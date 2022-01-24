package Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Deque_In_java {
public static void main(String[] args) {
//	Deque<Integer>dq=new ArrayDeque<>();
//	dq.offerFirst(10);
//	dq.offerFirst(20);
//	dq.offerFirst(30);
//	dq.offerFirst(40);
//	dq.offerFirst(50);
//	System.out.println(dq);
//	System.out.println("this is first: "+dq.getFirst());
//	System.out.println(dq.peek());
//	System.out.println(dq.peekFirst()+" "+dq.peekLast());
//	//for reverse iterator;
//	Iterator it=dq.descendingIterator();
//	while(it.hasNext())
//	{
//		System.out.print(it.next()+" ");
//	}
//	System.out.println();
//	for(int i:dq)System.out.print(i+" ");
//----------------------------------------------------------------------------
//--------------------ArrayDeque as a stack---------------------------------
	ArrayDeque<Integer>s=new ArrayDeque<>();
	s.push(5);
	s.push(6);
	s.push(7);
	s.push(8);
  System.out.println(s);
  System.out.println(s.pop());
  System.out.println(s.peek());
  System.out.println(s.pop());
  System.out.println(s.pop());
//----------------------------------------------------------------------------
//--------------------ArrayDeque as a queue---------------------------------
ArrayDeque<Integer>q=new ArrayDeque<>();
  q.offer(5);
  q.offer(6);
  q.offer(7);
  q.offer(8);
  System.out.println(q);
  System.out.println(q.poll());
  System.out.println(q.peek());
  System.out.println(q.poll());
  System.out.println(q.poll());
  






}
}
