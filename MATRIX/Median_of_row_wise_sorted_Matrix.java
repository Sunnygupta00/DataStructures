package matrix;
import java.util.*;
public class Median_of_row_wise_sorted_Matrix {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{2,3,3},{1,5,6},{6,6,7}};
           System.out.println(median(arr)); 
           int a[]= {1,2,3,5,4};
//           System.out.println(search(a,6));
//           System.out.println(Arrays.binarySearch(a,6));
          
           
        	}
	
	public static int median(int arr[][])
	{
		int r=arr.length;
		int c=arr[0].length;
		int max=Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
			for(int i=0;i<r;i++)
			{
				if(arr[i][0]<min)
				{
					min=arr[i][0];
				}
			}
			for(int i=0;i<c;i++)
			{
				if(arr[i][c-1]>max)
				{
					max=arr[i][c-1];
				}
			}
			int medpos=(r*c+1)/2;
			while(min<max)
			{
				int mid=min+(max-min)/2;
				int midpos=0;
				for(int i=0;i<r;i++)
				{
					int pos=Arrays.binarySearch(arr[i],mid)+1;
					midpos+=Math.abs(pos);
				}
				if(midpos<medpos)
				{
					min=mid+1;
				}
				else
				{
					max=mid;
				}
				
			}
			return min;
	}
  private static int search(int arr[],int key)
	{
		int low=0;int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)>>>1;
		if(mid<key)
		{
			low=mid+1;
		}
		else if(mid>key)
		{
			high=mid-1;
		}
		
		}
		return -(low+1);
	}
	
	
}
