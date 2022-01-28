package matrix;
// in matrix w
public class Passing_2D_array_as_argument {
 
	static void printarr(int arr[][])
	{
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
		
int arr[][]= {{1,0},{0,1}};
printarr(arr);
	}

}
