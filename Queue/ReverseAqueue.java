package queue;

import java.util.*;

public class ReverseAqueue {
	static void reverse(Queue<Integer> q) {
		Stack<Integer> s = new Stack<>();
		while (!q.isEmpty())s.push(q.remove());
			
		while (!s.isEmpty())q.offer(s.pop());
			
	}

	static void reversequeue(Queue<Integer> q) {
		if (q.isEmpty())return;
			
		int x = q.remove();
		reversequeue(q);
		q.offer(x);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		Queue<Integer> q = new ArrayDeque<Integer>();

		for (int a : arr)q.offer(a);		
		System.out.println(q);
		reversequeue(q);
		System.out.println(q);

	}
}
