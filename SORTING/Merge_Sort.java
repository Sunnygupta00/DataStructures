package sORTING;
// Merge sort is combination of binary and sorting.
public class Merge_Sort {
 static void Mergesort(int arr[])
 {
	 int low=0;int high=arr.length;int mid=(low+high)>>1;
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
				i++;k++;
			}
			else
			{
				arr[k]=right[j];
				k++;j++;
			}
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

		// TODO Auto-generated method stub
		int arr[]= {4,3,2,1};
		Mergesort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		

	

	}

}
