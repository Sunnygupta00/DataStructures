package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
// https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html
//First come First Out
public class Queue_basic {

	public static void main(String[] args) {
//		Queue<Integer>a=new ArrayDeque<>();//1 
		Queue<Integer> l = new LinkedList<>();// 2
		l.offer(1);
		l.add(2);
		System.out.println(l.add(3));// add the element//it will show exception if queue is full
		System.out.println(l.offer(4));//add the element//it will show false if queue is full
		System.out.println(l.peek());//returns top
		System.out.println(l.poll());//remove top
		System.out.println(l.size());
	    System.out.println(l.isEmpty());
	}

}
////                         QUEUE
//                             | 
//                   -----------------------
//                   |                     |
//               LINKEDLIST           ARRAYDEQUE
//            Slower in com AD          (faster) 
//            worst CaseO(1)           due to cache
//                                     Amortise O(1)
