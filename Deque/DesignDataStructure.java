package Dequeue;
import java.io.*;
import java.util.*;
import java.lang.*;
//--------------------------------------------------------------------------------
//----------------Data Structure with min/max operations--------------------
class myDsa{
	static Deque<Integer>d=new LinkedList<>();
	static void insertMin(int x)
	{
		if(d.size()==0) 
		{
			d.offerFirst(x);
			return;
		}
		if(d.peekFirst()>x)
		{
			d.offerFirst(x);
		}
	}
	static void insertMax(int x)
	{
		
		if(d.peekLast()<x)
		{
			d.offerLast(x);
		}
	}
	static void getMin()
	{
		System.out.println(d.getFirst());
	}
	static void getMax()
	{
		System.out.println(d.getLast());
	}
	static void print()
	{
		System.out.println(d);
	}
}
public class DesignDataStructure {

	public static void main(String[] args) {
		myDsa d=new myDsa();
		d.insertMin(5);
		d.insertMax(10);
		d.insertMin(3);
		d.insertMax(15);
		d.insertMin(2);
		d.print();
		d.getMin();
		d.getMax();
		d.insertMin(8);
		d.print();
		d.getMin();
		
		
	}

}
