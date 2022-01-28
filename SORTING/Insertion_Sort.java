package sORTING;
import java.util.Arrays;
public class Insertion_Sort {
	static void InsertionSort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];
			int j=i;
			while(j>0&&arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,3,2,1};
		InsertionSort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		

	}

}
