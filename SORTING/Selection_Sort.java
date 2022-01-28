package sORTING;

public class Selection_Sort {
 static void SelectionSort(int arr[])
 {
	 for(int i=0;i<arr.length;i++)
	 {
		 int min=i;
		 for(int j=i+1;j<arr.length;j++)
		 {
			 if(arr[j]<arr[min])
			 {
				 min=j;
			 }
		 }
		 swap(arr,i,min);
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
		SelectionSort(arr);
//		Arrays.toString(arr);
	for(int i:arr)
	{
		System.out.print(i+" ");
	}
	}

}
