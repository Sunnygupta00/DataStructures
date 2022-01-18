package stackk;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Largest_Rectangular_AreainHistorgram {
	static int [] prv(int arr[])
	{
		int res[]=new int [arr.length];
		Deque<Integer>s=new ArrayDeque<>();
		for(int i=0;i<arr.length;i++)
		{
			while(s.size()>0&&s.peek()<=arr[i])
			{
				s.pop();
			}
			res[i]=(s.size()>0?s.peek():-1);
			s.push(arr[i]);
		}
		return res;
	}
	static int []nxt(int arr[])
	{
		int res[]=new int[arr.length];
		Deque<Integer>s=new ArrayDeque<>();
		for(int i=arr.length-1;i>=0;i--)
		{
			while(s.size()>0&&s.peek()<=arr[i])
			{
				s.pop();
			}
			res[i]=(s.size()>0?s.peek():-1);
			s.push(arr[i]);
		}
		return res;
	}
	static int area(int arr[])
	{
		int res=0;
		Deque<Integer>d=new ArrayDeque<>();
		for(int i=0;i<arr.length;i++)
		{
			int curr=arr[i];
			while(!d.isEmpty()&&d.peek()>arr[i])
			{
				curr+=arr[i];
				d.pop();
			}
			res=Math.max(res, curr);
			d.push(arr[i]);
		}
		return res;
		
	}
// we are calculating all area across each digit;
// by iterating both side of element.
	static int Bruteforce(int arr[])
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			int curr=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>=arr[i])
				{
					curr+=arr[i];
				}
				else {
					break;
				}
			}
			for(int j=i-1;j>0;j--)
			{
				if(arr[j]>=arr[i])
				{
					curr+=arr[i];
				}
				else {
					break;
				}
			}
			res=Math.max(res, curr);
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {6,2,5,4,1,5,6};
		System.out.println(area(arr));
		int res[]=nxt(arr);
		for(int a:res)System.out.print(a+" ");

	}

}
