package matrix;

public class Print_boundary_Elements {
static void boundary(int arr[][])
{
int r=arr.length;
int c=arr[1].length;
if(r==1)
{
	for(int i=0;i<c;i++)
	{
		System.out.print(arr[0][i]);
	}
	System.out.println();
}
if(c==1)
{
	for(int i=0;i<r;i++)
	{
		System.out.print(arr[i][0]+" ");
	}
	System.out.println();
}
else {
	for(int i=0;i<r;i++)
	{
		System.out.print(arr[0][i]+" ");
	}
	for(int i=1;i<c;i++)
	{
		System.out.print(arr[i][c-1]+" ");
	}
	for(int i=c-2;i>=0;i--)
	{
		System.out.print(arr[r-1][i]+" ");
	}
	for(int i=r-2;i>=1;i--)
	{
		System.out.print(arr[i][0]+" ");
	}
}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},
			      {5,6,7,8},
			      {9,10,11,12},
			      {13,14,15,16}};
		boundary(arr);
	}

}
