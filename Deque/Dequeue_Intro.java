//https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html#removeFirst()
package Dequeue;
//A linear collection that supports element insertion and removal at both ends
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
public class Dequeue_Intro {
	public static void main(String[] args) {
//		Deque<Integer>da=new ArrayDeque<>();
		Deque<Integer>dl=new LinkedList<>();
		dl.add(5);
		dl.addFirst(6);
		dl.offerFirst(6);
		dl.offerLast(7);
        dl.addLast(7);
        System.out.println(dl);
        System.out.println(dl.peekFirst());
        System.out.println(dl.peekLast());
        System.out.println(dl.peek());
        dl.removeLastOccurrence(5);
        System.out.println(dl);
        System.out.println( dl.isEmpty());
	 
	}

}
//                          Deque
//                            |
//                    ------------------
//                    |                 |
//                  LinkedList       Array  
//-------------------------------------------------------------------------------]
//  Application of deque:
//	1. A deque can be used as stack and queue
//	2. history of actions
//	3. Maximum/minimum of all subarrays of size k in an array
	
	
	
	
	
	
	

