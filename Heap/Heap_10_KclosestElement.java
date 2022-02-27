package heap;
import java.util.*;
//https://leetcode.com/problems/find-k-closest-elements/discuss/106419/O(log-n)-Java-1-line-O(log(n)-%2B-k)-Ruby
public class Heap_10_KclosestElement {
	// TIME : O(NK)
	// IDEA : EXTRACTING MINIMUM CLOSEST DIFFERECE VALUE AND MARKING IT TRUE;
	static void bruteForce(int arr[],int k,int x,int n) {
		boolean visited[]=new boolean [n];
		System.out.print("[");
		for(int i=0;i<k;i++) {
			int minDif=Integer.MAX_VALUE;
			int minIndex=0;
			for(int j=0;j<n;j++) {
				if(Math.abs(arr[j]-x)<minDif && !visited[j]) {
					minDif=Math.abs(arr[j]-x);
					minIndex=j;
				}
			}
			System.out.print(arr[minIndex]+" ");
			visited[minIndex]=true;
		}
		System.out.println("]");
		
	}
	// TIME COMPLEXITY: (N-K)LOG K
	static void optimised(int arr[],int k,int x,int n) {
		// maintaing priority queue of max heap of minimum differnce value
		// we are maintaining on the basis of differece not value
		PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->Math.abs(b-x)- Math.abs(a-x));
		// adding First k element
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
		}
		// maintaing k elements 
		for(int i=k;i<arr.length;i++) {
			int dif=Math.abs(arr[i]-x);
			if(dif<Math.abs(pq.peek()-x)) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		System.out.println(pq);

	}
	//============== WITH CLASS PAIR =========================
//	static void optimised(int arr[],int k,int x,int n) {
//		// maintaing priority queue of max heap of minimum differnce value
//		// we are maintaining on the basis of differece not value
//		PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Math.abs(a.dif-x)- Math.abs(b.dif-x));
//		// adding First k element
//		for(int i=0;i<k;i++) {
//			pq.add(new Pair(Math.abs(arr[i]-x),i));
//		}
//		// maintaing k elements 
//		for(int i=k;i<arr.length;i++) {
//			int dif=Math.abs(arr[i]-x);
//			if(dif<pq.peek().dif) {
//				pq.poll();
//				pq.add(new Pair(dif,i));
//			}
//		}
//		for(Pair p:pq) {
//			System.out.println(p.dif+" "+arr[p.index]);
//		}
//
//	}
	


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= {10,15,7,3,4};
		int x=8;int k=2;
	   bruteForce(arr, k, x, arr.length);
	   optimised(arr, k, x,arr.length);
		
	

}private static class Pair{
		int dif;
		int index;
		Pair(int d,int i){
			dif=d;
			index=i;
		}
	}
}
