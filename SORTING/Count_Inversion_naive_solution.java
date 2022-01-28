package sORTING;

public class Count_Inversion_naive_solution {
 
	static int Inversion(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {2,4,1,3,5};
   
   System.out.println(Inversion(arr));
	}

}
