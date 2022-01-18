package stackk;
import java.util.*;
public class NextGreaterElementToTheRight {
	   
	   
	 public static int[] prevSmaller(int[] a) {
		 int r[]=new int [a.length];
		 Deque<Integer> d=new ArrayDeque<Integer>();
		 r[0]=-1;
		 d.push(a[0]);
		 for(int i=0;i<a.length;i++)
		 {
			 while(!d.isEmpty()&&d.peek()>=a[i])
			 {
				 d.pop();
			 }
			 r[i]=(d.isEmpty()?-1:d.peek());
			 d.push(a[i]);
		 }
		 return r;
	 }
	public static int[] solve(int[] arr){
		int res[]=new int[arr.length];
		Stack<Integer>s=new Stack<>();
		for(int i=arr.length-1;i>=0;i--)
		{
			while(s.size()>0&&s.peek()<=arr[i])
			{
				s.pop();
			}
			res[i]=(s.size()==0?-1:s.peek());
			s.push(arr[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int arr[]= {5, 5, 3, 8, -2, 7};
		int res[]=prevSmaller(arr);
		int rr[]=solve(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(rr[i]+" ");
		}
		
		
	}

}
