package stackk;
// hint : pop all the elements lesser than previous one:
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StockSpan {
	public static int[] solve(int[] arr){
		int res[]=new int[arr.length];
		Stack<Integer>s=new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
			while(!s.isEmpty()&& arr[s.peek()]<arr[i])
			{
				s.pop();
			}
			res[i]=(s.isEmpty()?i+1:i-s.peek());
			s.push(i);
		}
		return res;
	}
	static int [] stockSpan(int arr[])
	{
		int res[]=new int [arr.length];
	    Deque<Integer>d=new ArrayDeque<>();
	    for(int i=0;i<arr.length;i++)
	    {
	    	while(!d.isEmpty()&&arr[d.peek()]<arr[i])
	    	{
	    		d.pop();
	    	}
	    	res[i]=(d.isEmpty()?i+1:i-d.peek());
	    	d.push(i);
	    }
	    
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {2, 5, 9, 3, 1, 12, 6, 8, 7};
		int res[]=solve(arr);
		int res1[]=stockSpan(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(res1[i]+" ");
		}
		

	}

}
