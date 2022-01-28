package matrix;

public class Search_in_row_wise {

	static void search(int arr[][],int x)
	{
		boolean check=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==x)
				{
					System.out.println("("+i+","+j+")");
					check=true;
				}
			}
		}
		if(check==false)
		System.out.println("Not found");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},
		          {5,6,7,8},
		        {9,10,11,12},
		        {13,14,15,16}};
		int x=11;
	search(arr,x);
	optimised(arr, x);
	}
	static void optimised(int arr[][],int x)
	{
		int row=arr.length,col=arr[0].length;
		int i=0,j=col-1;
		System.out.println("Time O(row+col):");
		while(i<row&&j>=0)
		{
			if(arr[i][j]==x)
			{
				System.out.println("("+i+","+j+")");
				return;
			}
			else if(arr[i][j]>x)
			{
				j--;
			}
			else
				i++;
		}
		System.out.println("Not found");
	}

}
