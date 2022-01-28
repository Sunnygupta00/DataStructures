package sORTING;
import java.util.Scanner;
public class Partition_of_array_Lomuto {
	static void partition(int arr[],int low,int high,int p)
	{
		int i=-1; swap(arr,p,high);int pivot=arr[p];
		for(int j=0;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr,i,j);
			}
			
		}
		swap(arr,i+1,high);
		
	}
	static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		int arr[]= {10,80,30,90,100,40,50,70};
		partition(arr,0,arr.length-1,5);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}
