package queue;
import java.util.*;
class QueueArray
{
	static int data[];
	static int front=0,rear=0,cap,size=0;
	public QueueArray(int x) {
        data=new int[x];
        cap=x;
	}
	static boolean isEmpty()
	{
		return size==0;
	}
	static boolean isFull()
	{
		return size==cap;
	}
	static boolean offer(int x)
	{
		if(isFull())return false;
		data[rear++]=x;
		rear=rear%cap;
		size++;
		return true;
	}
	static int poll()throws Exception
	{
		if(isEmpty()) throw new Exception("empty");
		int removed=data[front];
		front=(front+1)%cap;size--;
		return removed;
	}
	static void print() throws Exception
	{
		if(isEmpty())throw new Exception("Empty");
		int i=front;
		do {
			System.out.print(data[i]+"<-");
			i=(i+1)%cap;
		}
		while(i!=rear);
		System.out.println();
	}
	
	}
public class ImplementationWithArray {
	public static void main(String[] args) throws Exception {
		QueueArray q = new QueueArray(5);
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		q.print();
		q.poll();
		q.poll();
		q.print();
		Queue<Integer> qq=new ArrayDeque<>();
		qq.offer(1);
		qq.offer(2);
		qq.offer(3);
		qq.offer(4);
		qq.offer(5);
	System.out.println(qq);
		qq.poll();
		qq.poll();
		System.out.println(qq);
		
	}
	//class QueueArray {
//	static int arr[];
//	static int cap;
//	static int front;
//	static int size;
//
//	public QueueArray(int n) {
//		arr = new int[n];
//		cap = n;
//		front = 0;
//		size = 0;
//	}
//
//	public static boolean offer(int n) {
//		if (isFull())
//			return false;
//		int back = last();
//		back = (back + 1) % cap;
//		arr[back] = n;
//		size++;
//		return true;
//	}
//
//	public static void poll() {
//		if (isEmpty())
//			return;
//		front = (front + 1) % cap;
//		size--;
//	}
//
//	public static int front() {
//		if (size == 0)
//			return -1;
//		else
//			return front;
//	}
//
//	public static int last() {
//		if (size == 0)
//			return -1;
//		return (front + size - 1) % cap;
//	}
//
//	static void print() {
//		if (isEmpty())
//			return;
//		for (int i = front; i <cap; i++) {
//			System.out.print(arr[i] + "<-");
//		}
//		System.out.println();
//	}
//
//	static boolean isFull() {
//		return (cap == size);
//	}
//
//	static boolean isEmpty() {
//		return (size == 0);
//	}
//
//}

}
