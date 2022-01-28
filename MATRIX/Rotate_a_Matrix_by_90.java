package matrix;

public class Rotate_a_Matrix_by_90 {
	static void naive(int arr[][])
	{
		int temp[][]=new int [arr.length][arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				temp[arr.length-j-1][i]=arr[i][j];
			}
		}
		for(int []p:temp)
		{
			for(int e:p)
			{
				System.out.print(e+" ");
			}
			System.out.println();
		}
	}
	static void optimised(int arr[][])
	{
		//Calculating transpose
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr[i].length;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		//revrse the elements
		for(int i=0;i<arr.length/2;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[arr.length-i-1][j];
				arr[arr.length-i-1][j]=temp;
			}
		}
		for(int []p:arr)
		{
			for(int e:p)
			{
				System.out.print(e+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},
			          {5,6,7,8},
			        {9,10,11,12},
			       {13,14,15,16}};
		naive(arr);
		System.out.println();
		optimised(arr);

	}
	
	
	
	


}
//Naive Solution

/*
our array should follow this..(so here we have expression)
0   0 | 3      0
0   1 | 2      0
0   2 | 1      0
0   3 | 0      0
[i][j]|[n-j-1][i]

*/
///////////////////////////////////////////////////////////////
//OPTIMISED SOLUTION
 /*
  * First we Transpose our mAtrix
  * and then reverse it(Horizontally)
  * 
  */
  


