package heap;
import java.util.*;
import binarySearchTree.TreeNode;

// HEAPIFY MEANS WE ARE EXTRACTING MINIMUM OR MAXIMUM BY COMPARING THE ROOT NODES
public class Heap_03_Heapify {
	public static int size=7;
	public static void minheapify(int arr[],int i) {
		int left=left(i);
		int right=right(i);
		int smaller=i;
		if(left<size && arr[left]<arr[i]) {
			smaller=left;
		}
		if(right<size && arr[right]<arr[smaller]) {
			smaller=right;
		}
		if(smaller!=i) {
			int temp=arr[i];
			arr[i]=arr[smaller];
			arr[smaller]=temp;
			minheapify(arr, smaller);
		}
	}
	// EXTRACTING MINIMUM FROM ARRAY TIME O(N)
	public static void min(int arr[],int size) {
	   swap(arr,0,size);
	   size--;
	   minheapify(arr, 0);
	}
	
	public static int left(int i) {
		return 2*i+1;
	}
	public static int right(int i) {
		return 2*i+2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
	    8
      /   \    
    4      12
  /  \    /  \
 2    6  10   14
 
	  */

    int arr[]= {8,4,12,2,6,10,14};
    min(arr, arr.length-1);
    for(int a:arr)System.out.print(a+" ");
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    pq.add(5);
    pq.poll();

	}
	static void swap(int arr[],int a,int b) {
		  int temp=arr[a];
		  arr[a]=arr[b];
		  arr[b]=temp;
	  }

}
