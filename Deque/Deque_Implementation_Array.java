package Dequeue;

import java.util.Deque;
//Normal approach
class Mydequeue {
	static int arr[];
	static int cap, size;

	public Mydequeue(int x) {
		arr = new int[x];
		cap=x;
		size = 0;
	}
	static boolean isEmpty()
	{
		return size==0;
	}
    static boolean isFull()
	{
		return size==cap;
	}
	static void insertrear(int x)
	{
		if(isFull())return;
		arr[size++]=x;
	}
	static int deleterear() throws Exception
	{
		if(isEmpty())throw new Exception("empty");
		int x=arr[size];
		size--;
		return x;
	}
	static boolean insertFront(int x) throws Exception
	{
		if(isFull())throw new Exception("It is full");
		for(int i=size-1;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=x;
		size++;
		return true;
	}
	static int deleteFront() throws Exception
	{
		if(isEmpty())throw new Exception("It is empty");
		int x=arr[0];
		for(int i=0;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		size--;
		return x;
		
	}
	static void print()
	{
		if (isEmpty())return ;
		for(int i=0;i<cap;i++)
		{ 
			if(arr[i]!=0)
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

public class Deque_Implementation_Array {

	public static void main(String[] args) throws Exception {
		Mydequeue d=new Mydequeue(10);
		d.insertFront(5);
		d.insertrear(6);
		d.print();
		

	}

}
