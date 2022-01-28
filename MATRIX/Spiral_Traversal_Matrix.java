package matrix;

public class Spiral_Traversal_Matrix {
    static void sipral(int arr[][])
   {
	int top=0,bottom=arr.length-1;
	int left=0,right=arr[0].length-1;
	while(top<=bottom&&left<=right)
	{
		// traverse form left to right
		for(int i=left;i<=right;i++)
		{
			System.out.print(arr[top][i]+" ");
		}
		top++;
		//traverse from top to bottom
		for(int i=top;i<=bottom;i++ )
		{
			System.out.print(arr[i][right]+" ");
		}
		right--;
		// traverse from right to left
		for(int i=right;i>=left;i--)
		{
			System.out.print(arr[bottom][i]+" ");
		}
		bottom--;
		//traverse from bottom to top
		
		for(int i=bottom;i>=top;i--)
		{
			System.out.print(arr[i][left]+" ");
		}
		left++;
	}
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},
			          {5,6,7,8},
			        {9,10,11,12},
			        {13,14,15,16}};
         sipral(arr);
	}

}


