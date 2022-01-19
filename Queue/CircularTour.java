package queue;

import java.util.*;

public class CircularTour {

	static int BruteForce(int a[], int b[]) {
		Queue<Integer> q = new LinkedList<Integer>();
		int n = a.length;
		// storing only Possible Values which may Contain Cycles
		for (int i = 0; i < n; i++) {
			int temp = a[i] - b[i];
			q.offer(i);
		}
		// checking at each cases is it a perfect Cycle?
		while (!q.isEmpty()) {
			int curr = q.remove();
			int i = curr;
			int counter = 0;
			int fuel = 0;
			boolean flag = false;
			while (true) {
				// if we reached at the last and we not found any problem retrun it;
				if (counter == n) {
					flag = true;
					break;
				}
				fuel += a[i] - b[i];
				// if it is not break the loop
				if (fuel < 0) {
					break;
				}
				// using modulo operator to maintain loop
				i = (i + 1) % n;
				counter++;

			}
			if (flag)
				return curr;
		}
		return -1;
	}

	static int Optimised(int petrol[], int distance[]) {
		int start = 0;
		// how much petrol require to complete the cycle from that point 
		int required = 0;
		// how much extra petrol we have;
		int extra = 0;
       
		for (int i = 0; i < petrol.length; i++) {
			extra += (petrol[i] - distance[i]);
			//if we don't have enough petrol update the start point
			if (extra < 0) {
				start = i + 1;
				// calculating total requirement
				required += extra;
				extra = 0;
			}
		}
		// if required + extra full fill return our position else answer does'nt exist
		return (required + extra >= 0 ? start : -1);
	}

	public static void main(String[] args) {

		int petrol[] = {1,2,3,4,5};
		int distance[] = { 3,4,5,1,2};
		System.out.println(Optimised(petrol, distance));

	}

}
