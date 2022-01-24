package Dequeue;
import java.io.*;
import java.util.*;

import javax.xml.namespace.QName;

import java.lang.*;
public class Maximum_in_all_subArraysOF_SizeK {
	// *what we are doing?
	// we will store index just to maintain window elements. 
	// 1.first we will add our first element
	// 2. then we will check if last element of deque is small then 
	// remove it;
	// 3.then we will add it curr element
	// 4. simultaneously we will maintain the window by ((peek==i-k))
	// ex: if i have window as 3 so it means 0,1,2,3,4.. this should not be
	// the indices of respective window
	// 5 . then we will print all the posible ans after i>k-1
	
	public static void main(String[] args) {
		
     int nums[]= {1 ,2 ,3 ,1 ,4 ,5 ,2 ,3 ,6};int k=3;
     
     Deque<Integer>q=new ArrayDeque<>();
		for (int i = 0; i < nums.length; i++) {
			while(q.size()>0&&nums[q.getLast()]<=nums[i])
			{
				q.removeLast();
			}
			q.add(i);
			if(q.peekFirst()==i-k)
			{
				q.removeFirst();
			}
			if(i>=k-1)
			{
				System.out.print(nums[q.peek()]+" ");
			}
		}
		 
     
//     for (int i = 0; i < nums.length; i++) {
//         while (!q.isEmpty() && nums[q.getLast()] <= nums[i]) {
//             q.removeLast();
//         }
//         q.addLast(i);
//
//         if (q.getFirst() == i - k) {
//             q.removeFirst();
//         }
//        
//         if (i >= k - 1) {
//             System.out.print(nums[q.peek()]+" ");
//         }
//     }
//    
      
     
	}

}
