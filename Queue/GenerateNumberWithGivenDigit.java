package queue;
// digit only containing 5 and 6;
import java.util.*;	
public class GenerateNumberWithGivenDigit {
	static void PrintFirstN(int n)
	{
		Queue<String>q=new ArrayDeque<String>();
		q.offer("5");
		q.offer("6"	);
		for(int i=0;i<n;i++)
		{
			String s=q.remove();
			System.out.println(s);
			q.offer(s+5);
			q.offer(s+6);
		}
	}
public static void main(String[] args) {
       PrintFirstN(5);
 }
}


/*
 * 5-pop\
 * 6-pop
 * 55
 * 56
 * 65
 * 66
 */

      
