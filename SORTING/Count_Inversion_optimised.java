package sORTING;
//Time complexity O(nlogn)
public class Count_Inversion_optimised {
static int mergesort(int arr[],int low,int high)
{
	int inv=0;
	if(low<high)
	{
	int mid=(low+high)>>1;
	inv+=mergesort(arr,low,mid);
	inv+=mergesort(arr,mid+1,high);
	inv+=merge(arr,low,mid,high);
	}
	return inv;
}
  static int merge(int arr[],int low,int mid,int high)
  { 
	  int inv=0;
	 int n1=mid-low+1;
	 int n2=high-mid;
	 int left[]=new int[n1];
	 int right[]=new int [n2];
	 for(int i=0;i<n1;i++)
	 {
		 left[i]=arr[low+i];
	 }
	 for(int i=0;i<n2;i++)
	 {
		 right[i]=arr[mid+i+1];
	 }
	 int i=0,j=0,k=low;
	 while(i<n1&&j<n2)
	 {
		 if(left[i]<right[j])
		 {
			 arr[k]=left[i];
			 i++;
		 }
		 else
		 {
			 arr[k]=right[j];
			 // we will count no. of inversion 
			 inv+=n1-i;
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
		 j++;k++;
	 }
	 return inv;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,2,1};
System.out.println(mergesort(arr,0,arr.length-1));
	}

}
