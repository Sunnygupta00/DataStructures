package sORTING;
import java.util.*;
public class Merge__Sort {
	static void MergeSort(int arr[],int low,int high)
	{
		if(low>high)return;
		if(low<high)
		{
			int mid=low+(high-low)/2;
		   MergeSort(arr,low,mid);
		   MergeSort(arr,mid+1,high);
		   Merge(arr,low,mid,high);
		}
		
	}
	static void Merge(int arr[],int low,int mid,int high)
	 {
//		 int low=0;int high=arr.length;int mid=(low+high)>>1;
		 // our main moto is to divide our array into two sub array
		 // and then we will merge them
		 // Calculate size of left array and right array; 
		 int n1=mid+1-low;int n2=high-mid;
		 int left[]=new int [n1]; int right[]=new int [n2];
		 for(int i=0;i<n1;i++)
		 {
			 left[i]=arr[i+low];
		 }
		 for(int i=0;i<n2;i++)
		 {
			 right[i]=arr[mid+i+1];
			 
		 }

			int i=0,j=0,k=low;
			while(i<n1&&j<n2)
			{
				if(left[i]<=right[j])
				{
					arr[k]=left[i];
					i++;
				}
				else
				{
					arr[k]=right[j];
					j++;
				}
				k++;
			}
			while(i<n1)
			{
				arr[k]=left[i];
				i++;k++;
			}
			while(j<n2)
			{
				arr[k]=right[j];
				k++;j++;
			}
			
		
		  
	 }
	   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,4,1};
		MergeSort(arr,0,arr.length-1);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
