package stackk;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Sp {
	static int [] stockSpan(int arr[])
	{
		int res[]=new int [arr.length];
		Deque<Integer>d=new ArrayDeque<>();
		for(int i=arr.length-1;i>=0;i--)
		{
			while(!d.isEmpty()&& d.peek()<arr[i])
			{
				d.pop();
			}
			res[i]=(d.isEmpty()?-1:d.peek());
		  d.push(arr[i]);	
		}
				
		return res;
	}
	
	public static void main(String[] args) {
		int arr[]= {25,20,15,10};
		int res[]=stockSpan(arr);
		for(int a:res)System.out.print(a+" ");
		
	}

}
