package stackk;


class Twostack
{
	static int arr[];
	static int top1;
	static int top2;
	static int cap;
	public Twostack(int x) {
	   arr=new int[x];
	  top1=-1;
	  top2=x;
	  cap=x;
	}
	public static void pushtwo(int x)
	{
		if(top1<top2-1)
		{
			top2--;
			arr[top2]=x;
		}
	}
	
	public static void pushone(int x)
	{
		if(top1<top2-1)
		{
			top1++;
			arr[top1]=x; 
		}
	}
	public static int poptwo()
	{
		
		if(top2>=cap)
		{
			return Integer.MIN_VALUE;
		}
		else {
		int x=arr[top2];
			top2++;return x;
		}
	}
	public static int peektwo()
	{
		if(top2<cap)
		{
			int x=arr[top2];
			return x;
		}
		else {
			return Integer.MAX_VALUE;
		}
	}
	
	public static int popone()
	{
		if(top1<0)
		{
			return Integer.MIN_VALUE;
		}
		else {
			int x=arr[top1];
			top1--;
			return x;
		}
	}
	public static int peekone()
	{
		if(top1>=0)
		{
			int x=arr[top1];
			return x;
		}
		else {
			return Integer.MIN_VALUE;
		}
	}
	public static boolean isEmpty()
	{
		return top1==-1&&top2==cap;
				}
	
}
//********_MY_MISTAKE_***********
//class Twoarray
//{
//	static int arr[];
//	static int one;
//	static int two;
//	static int cap;
//	public Twoarray(int x) {
//	   arr=new int[x];
//	   one=-1;
//	   two=x;
//	   cap=x;
//	}
//	public static int pushtwo(int x)
//	{
//		two--;
//		arr[two]=x;
//		cap--;
//		return x;
//	}
//	public static int poptwo()
//	{
//		
//		if(two==arr.length)return -1;
//		int x=arr[two];
//		two++;
//		cap++;
//		return x;
//	}
//	public static int peektwo()
//	{
//		if(two==arr.length)return Integer.MIN_VALUE;
//		return arr[two];
//	}
//	public static int pushone(int x)
//	{
//		if(cap==-1)return -1;
//		one++;
//		arr[one]=x;
//		cap--;
//		return x;
//	}
//	public static int popone()
//	{
//		if(one==-1)return -1;
//		int x=arr[one];
//		one--;
//		cap++;
//		return x;
//	}
//	public static int peekone()
//	{
//		if(one==-1)return Integer.MIN_VALUE;
//		cap++;
//		return arr[one];
//	}
//	public static boolean isEmpty()
//	{
//		return cap==arr.length;
//	}
//	
//}
public class TwoStackInaArray {
	public static void main(String[] args) {
		
	}

}
