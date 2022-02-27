package heap;
import java.util.PriorityQueue;
import java.util.*;
public class Heap_06_PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> min=new PriorityQueue<>((a,b)->a-b);
		// IT IS MIN HEAP IMPLEMENTATION
		min.add(10);
		min.add(9);
		min.add(8);
		min.add(7);
		min.add(6);
		System.out.println(min.peek());
		System.out.println(min);
		PriorityQueue<Integer>max=new PriorityQueue<>(Collections.reverseOrder());// THIS IS MAX HEAP 
		max.add(10);
		max.add(9);
		max.add(8);
		max.add(7);
		max.add(6);
		System.out.println(max.peek());
		System.out.println(max);
		
//PriorityQueue<Integer> min=new PriorityQueue<>((a,b)->b-a);----> reverse order---->MAXheap]
//		PriorityQueue<Integer> min=new PriorityQueue<>((a,b)->a-b); natural order ---->minheap
	}

}
