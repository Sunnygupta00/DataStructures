package heap;
import java.util.*;

public class Heap_12_MedianOfStream {
    // TIME COMPLEXITY: O(N^2LOGN)
	static void ans(int arr[]) {
		ArrayList<Double>ans=new ArrayList<>();
		ArrayList<Integer>temp=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			temp.add(arr[i]);
			Collections.sort(temp);
			if(temp.size()%2==0) {
				ans.add((double)(temp.get(temp.size()/2)+temp.get((temp.size()-1)/2))/2);
			}else {
				ans.add((double)temp.get(temp.size()/2));
			}
		}
		System.out.println(ans);
	}
	static void Optimised(int arr[]) {
		ArrayList<Integer>ans=new ArrayList<>();
		PriorityQueue<Integer>g=new PriorityQueue<>((a,b)->a-b);//MIN HEAP
		PriorityQueue<Integer>s=new PriorityQueue<>((a,b)->b-a);//MAX HEAP
		
		for(int i=0;i<arr.length;i++) {
			int x=arr[i];
			if(s.isEmpty() || s.peek()>=x) {
				s.add(x);
			}else {
				g.add(x);
			}
			// BALANCE
			if(s.size()>g.size()+1) {
				g.add(s.poll());
			}else if(s.size()<g.size()) {
				s.add(g.poll());
			}
			if(s.size()==g.size()) {
				System.out.print(s.peek()/2.0+g.peek()/2.0+",");
			}else {
				System.out.print(s.peek()+",");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]= {25,7,10,15,20};
		ans(arr);
		Optimised(arr);
     MedianOfStream ans=new MedianOfStream();
     for(int i:arr) {
    	 ans.add(i);
         System.out.println(ans.findMedian());
     }
	}

}
class MedianOfStream{
   PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());// MinimumElelemt
   PriorityQueue<Integer>minHeap=new PriorityQueue<>();// Maximum element
   public void add(int num) {
	   
	   // ADDING SMALL ELEMENTS IN MAXHEAP
	   if( maxHeap.isEmpty() || maxHeap.peek()>=num) {
		   maxHeap.add(num);
	   }else {
		   minHeap.add(num);
	   }
	   // Balance condition
	   if(maxHeap.size()>minHeap.size()+1) { // IF LEFT SIDE CONTAINER IS MORE THEN SHIFT TO RIGHT SIDE i.e.. MINHEAP
		   minHeap.add(maxHeap.poll());
	   }else if(minHeap.size()>maxHeap.size()) { // HAME MAXHEAP KE ANDAR EK ELEMENT JADA RAKHNA HAI SO THAT WE CAN EASILY GET MEDIAN
             maxHeap.add(minHeap.poll());
	   }
   }
	public double findMedian() {
		if(maxHeap.size()==minHeap.size()) {
			return maxHeap.peek()/2.0+minHeap.peek()/2.0;
		}
		else {
			return maxHeap.peek();
		}
	}
	
}
