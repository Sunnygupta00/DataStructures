package queue;
class queue
{
	static int arr[];
	static int front;
	static int size;
	static int cap;
	public queue(int x) {
        arr=new int[x];
        front=0;
        size=0;
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
	static int getFirst()
	{
		if(isEmpty())return-1;
		return front;
	}
	static int getlast()
	{
		if(isEmpty())return Integer.MAX_VALUE;
		return (front+size-1)%cap;
	}
	static boolean offer(int x)
	{
		if(isFull())return false;
		int index=getlast();
		index=(index+1)%cap;
		arr[index]=x;
		size++;
		return true;
	}
	static int poll()
	{
		if(isEmpty())return -1;
		int x=arr[front];
		front=(front+1)%cap;
		size--;
		return x;
	}
	static void print()
	{
		if(isEmpty())return;
		for(int i=front%cap;i<(size+front)%cap;i++)
		{
			System.out.print(arr[i]);
		}
	}
}
public class By {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
