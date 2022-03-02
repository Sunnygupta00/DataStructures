// https://www.notion.so/HEAP-56a39ed361604e0dbd651b7ba3fa33e9#e634fa67f4544c3592f33dd4d3c6698a
package heap;

class MinHeap{
	int arr[];
	int size;
	int cap;
    public MinHeap(int c) {
       arr=new int[c];
       cap=c;
       size=0;
    }
   // TIME COMPLEXITY  OF INSERT : O(LOG N)
	public void insert(int x) {
		if (size == cap) {
			return;
		}
		size++;
		arr[size - 1] = x;// inserting at last
		// now comparing node with its parent node
		for (int i = size - 1; i != 0 && arr[parent(i)] > arr[i]; i = parent(i)) {
			swap(arr, i, parent(i));

		}

	}
	public void heapify(int i) {
		int left=left(i),right=right(i);
		int smallest=i;
		// if kid is less than left side
		if(left<size&&arr[left]<arr[i]) {
			smallest=left;
		}
		// taking smallest from kids
		if(right<size&&arr[right]<arr[smallest]) {
			smallest=right;
		}
		if(smallest!=i) {
			swap(arr,i,smallest);
			heapify(smallest);
		}
	}
	public int peek() {
		return arr[0];
	}
	public int size() {
		return size;
	}
    public void print() {
    	for(int a:arr) {
    		System.out.print(a+" ");
    	}
    	System.out.println();
    }
    public void swap(int arr[],int a,int b) {
    	int temp=arr[a];
    	arr[a]=arr[b];
    	arr[b]=temp;
    }
    public int left(int i) {
    	return 2*i+1;
    }
    public int right(int i) {
    	return 2*i+2;
    }
    public int parent(int i) {
    	return (i-1)>>1;
    }
}

public class HEAP_02_MINHEAPimplementation {
	

	public static void main(String[] args) {
		/*
	     10
      /     \    
    20       30
  /   \     /  \
 40    50  60   70
 
	  */

     TreeNode root = new TreeNode(10);
      root.left = new TreeNode(20);
      root.right = new TreeNode(30);
      root.left.left = new TreeNode(40);
      root.left.right = new TreeNode(50);
      root.right.left = new TreeNode(60);
      root.right.right = new TreeNode(70);
      MinHeap mh=new MinHeap(10);
      mh.insert(10);
      mh.insert(9);
      mh.insert(8);
      mh.print();
      mh.insert(7);
      mh.insert(6);
      mh.insert(5);
      mh.insert(4);
      mh.insert(3);
      mh.insert(2);
      mh.insert(1);
      mh.print();
      
      

	}

}
