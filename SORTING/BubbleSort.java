package sORTING;
import java.util.Arrays;
public class BubbleSort {
	static void Bubble_Sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					swap(arr,j,j+1);
				}
			}
		}
	}
	static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,2,3,1};
		Bubble_Sort(arr);
//		Arrays.toString(arr);
	for(int i:arr)
	{
		System.out.print(i+" ");
	}
		

	}

}
