package sORTING;
import java.util.*;
class Interval{
	int start,end;
	public Interval(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public static Comparator<Interval>comparestart=new Comparator<Interval>(){
		public int compare(Interval i1,Interval i2)
		{
			return i1.start-i2.start;
		}
	};
}
public class MergeInterval {
	static void mergeInterval(Interval arr[])
	{
		Arrays.sort(arr,Interval.comparestart);
		int index=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[index].end>=arr[i].start)
			{
				arr[index].end=Math.max(arr[index].end,arr[i].start);
			}
			else {
				index++;
				arr[index]=arr[i];
			}
		}
		for(int i=0;i<=index;i++)
		{
			System.out.println("["+arr[i].start+","+arr[i].end+"]");
		}
	}

	public static void main(String[] args) {
		System.out.println("I love coding");
		// TODO Auto-generated method stub
		Interval arr[]= {new Interval(6,8),new Interval(1,9),new Interval(2,4),new Interval(6,7)};
          mergeInterval(arr);
	}

}
