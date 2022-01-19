package queue;
import java.util.*;
public class ReverseFirstKelementsofQueue {
    
	static void reverse(Queue<Integer>q,int k)
	{
		Stack<Integer>s=new Stack<>();
		Queue<Integer>qq=new LinkedList<>();
		while(!q.isEmpty()&&k>0)
		{
			s.push(q.remove());
			k--;
		}
		while(!q.isEmpty())
		{
			qq.offer(q.remove());
		}
		while(s.size()>0)
		{
			q.offer(s.pop());
		}
		while(!qq.isEmpty())
		{
			q.offer(qq.remove());
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Queue<Integer>q=new LinkedList<>();
		for(int a:arr)q.add(a);
		System.out.println(q);
		reverse(q, k);
		System.out.println(q);
		
	}

}
