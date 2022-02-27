package heap;
import java.util.*;
public class Heap_08_PurchasingMaximumItems {

	public static void main(String[] args) {
		int cost[]= {20,10,5,30,100};
		int sum=35;
		System.out.println(purchase(cost,sum));
	}

	private static int purchase(int[] cost, int sum) {
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		int count=0;
		for(int i=0;i<cost.length;i++) {
			pq.add(cost[i]);
			if(sum-pq.poll()>=0) {
				count++;
				sum-=cost[i];
			}
		}
		return count;
		
	}

}
