package stackk;
import java.io.*;
import java.util.*;



import java.lang.*;
class cStack<t>
{
	int []data;
	int length;
	public cStack(int length) {
	    data=new int[length];
	    length=-1;
	}
	private void push(int d) {
	    length++; 
		data[length]= d;
	}
	private int pop(int d) {
		if(length==-1)
		{
			return Integer.MAX_VALUE;
		}
        int a=d;
        length--;
     return a;
	}
	private int peek() {
		// TODO Auto-generated method stub
		//what here we are doing is to increase;)
       return data[length];
	}	
	private int Length() {
		// TODO Auto-generated method stub
      return length+1;
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
          return length==-1;
	}
 
}
class cqueue<t>{

	int []data;
	int length;
	public cqueue(int length) {
	    data=new int[length];
	    length=-1;
	}
	private void push(int d) {
		data[++length]= d;
	}
	private int pop(int d) {
		if(length==-1)
		{
			return Integer.MAX_VALUE;
		}
        int a=d;
        length--;
     return a;
	}
	private int peek() {
		// TODO Auto-generated method stub
       return data[length];
	}	
	private int Length() {
		// TODO Auto-generated method stub
      return length+1;
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
          return length==-1;
	}

	
}
public class Stack_Implementation {
   
	//used to store ans for later on
	//deque--->we can insert and delete from both the sides 
	//
	public static void main(String[] args) {
     Stack<Integer> s=new Stack<>();
     ArrayDeque<Integer>ad=new ArrayDeque<Integer>();
         
	}

}
