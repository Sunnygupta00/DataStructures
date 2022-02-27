package heap;
import java.util.*;
//Question : sort array in k parts
public class Heap_07_SortaKsortedArray {
// TIME COMPLEXITY : N LOG K
	static void sortK(int arr[],int k) {
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		//INSERT K ELEMENT
		for(int i=0;i<=k;i++) {
			pq.add(arr[i]);
		}
		// MAINTAING THE INDEX
		int index=0;
		// POPING AND AND ADDING SIMULTANEOUSLY WICH WILL COST N LOG K TIME.
		for(int i=k+1;i<arr.length;i++) {
			arr[index++]=pq.poll();
			pq.add(arr[i]);
		}
		// AT LAST POPING ALL ITEMS
		while(pq.size()>0) {
			arr[index++]=pq.poll();
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {1, 4, 5, 2, 3, 7, 8, 6, 10, 9};
		int k=2;
		sortK(arr,k);
		for(int a:arr)System.out.print(a+" ");

	}

}
