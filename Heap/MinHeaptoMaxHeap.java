package heap;

public class MinHeaptoMaxHeap {
	public static void heapifymax(int arr[],int i,int size) {
		// finding left and right index
		int left=left(i);
		int right=right(i);
		int largest=i;
		// calculating largest value amongst left and right 
		if(left<size&& arr[left]>arr[i])
		{
			largest=left;
		}
		if(left<size&& arr[right]>arr[largest]) {
			largest=right;
		}
		// after swaping recursively calling for subtree
		if(largest!=i) {
			swap(arr,i,largest);
			heapifymax(arr, largest, size);
		}
	}
	public static void mintomax(int arr[],int size) {
		int i=size-2/2;
		while(i>=0) {
			heapifymax(arr, i--, size);
		}
	}
	public static void swap(int arr[],int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static int left(int i) {
		return 2*i+1;
	}
	public static int right(int i) {
		return 2*i+2;
	}

	public static void main(String[] args) {
		/* Input: min-heap
        1

   3         4

 6   10    8   5

*/
		int arr[]= {1, 3, 4, 6, 10, 8, 5};
//		heapifymax(arr, 0, arr.length-1);
		mintomax(arr, arr.length-1);
		for(int a:arr)System.out.print(a+" ");
		
		

	}

}
