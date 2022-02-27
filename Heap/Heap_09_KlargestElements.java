package heap;
import java.util.*;
public class Heap_09_KlargestElements {

	public static void main(String[] args) {
		int arr[] = {7, 4, 6, 3, 9, 1};
				int k = 2;
			// USING MAX HEAP
			maxheap(arr,k);
			System.out.println(minHeap(arr,k));
            
	}

	private static int minHeap(int[] arr, int k) {
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++) {
			
			if(arr[i]>pq.peek()) {
			   pq.poll();
			   pq.add(arr[i]);
			   k--;
			}
			if(k==0) {
				return pq.peek();
			}
			
		}
		return pq.peek();
		
	}

	private static void maxheap(int[] arr, int k) {
		PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());// max heap
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		while(k>1) {
			pq.poll();
			k--;
		}
		System.out.println(pq.peek());

	}

}
