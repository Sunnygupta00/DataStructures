package sORTING;

public class Partition_Of_Array {
	static void partition(int arr[],int p,int low,int high)
	{
		int temp[]=new int [high-low+1];int idx=0;
		for(int i=low;i<=high;i++)
		{
			if(arr[i]<=arr[p])
			{
				temp[idx]=arr[i];
				idx++;
			}
		}
		for(int i=low;i<=high;i++)
		{
			if(arr[i]>arr[p])
			{
				temp[idx]=arr[i];
				idx++;
			}
		}
		for(int i=0;i<=high;i++)
		{
			arr[i]=temp[i];
		}
		
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,13,6,9,12,11,8};
		partition(arr,6,0,arr.length-1);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		

	}

}
