package heap;

public class Heap_04_DeleteAndBuildHeap {
	// time O(log n);
	static int size=5;
//================= DECREASING THE VALUE =========================	
	static void decreaseKey(int arr[],int i,int val) {
		arr[i]=val;
		// we are swaping till our tree is not balanced;
		while(i!=0 && arr[i]<arr[parent(i)]) {// if parent is greater
			swap(arr, i, parent(i));
			i=parent(i);
		}
	}
//=================== DELETE =====================================
	static void delete(int arr[],int i,int size) {
		// moving value up
		decreaseKey(arr, i, Integer.MIN_VALUE);
		int x=Minextract(arr);
//		System.out.println(x);
	}
	
	static int  Minextract(int arr[]) {
		if(size==0) {
			return Integer.MIN_VALUE;
		}
		if(size==1) {
			size--;
			return arr[size];
		}
		// SWAPING TOP AND LAST ELEMENT
		swap(arr, 0, size);
		// DECREASING THE SIZE
		size--;
		minheapify(arr, 0);
		return arr[size+1];
	}
//======================Build Heap================================
//============= TIME COMPLEXITY O(N)==============================
	static void buildHeap(int arr[],int size) {
	   int i=(size-2)/2;
	   while(i>=0) {
		   minheapify(arr, i--);
	   }
	}
	public static void main(String[] args) {
		int arr[]= {10,20,40,80,100,70};
		int i=3,x=5;
		for(int a:arr)System.out.print(a+" ");
		System.out.println();
//		decreaseKey(arr,i,x);
		delete(arr, 3, size);
		for(int k=0;k<=size;k++) {
			System.out.print(arr[k]+" ");
		}

	}
	
static int parent(int n) { return (n-1)/2;} 
static void swap(int arr[],int a,int b) { int temp=arr[a];arr[a]=arr[b]; arr[b]=temp;}	
public static int left(int i) { return 2*i+1;}
public static int right(int i) {return 2*i+2;}

	public static void minheapify(int arr[],int i) {//TIME O(LOGN)
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

 
	 
	  
	 

		
	
	
		
	
}
