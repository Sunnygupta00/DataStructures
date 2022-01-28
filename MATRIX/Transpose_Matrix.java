package matrix;
// Naive solution is to use auxilary space.....i.e:--) aux[j][i]=arr[i][j];
public class Transpose_Matrix {
 
	static void transpose(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr[i].length;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][j];
				arr[j][i]=temp;
			}
		}
		for(int i=0;i<arr.length;i++)
		  {
			  for(int j=0;j<arr[i].length;j++)
			  {
				  System.out.print(arr[i][j]+" ");
			  }
			  System.out.println();
		  }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,1,1,1},
		              {2,2,2,2},
		              {3,3,3,3},
		              {4,4,4,4}};
	  transpose(arr);
	  

	}

}
