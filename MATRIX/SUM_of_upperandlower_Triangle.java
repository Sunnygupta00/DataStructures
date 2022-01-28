package matrix;

public class SUM_of_upperandlower_Triangle {
static void sum(int arr[][]) {
	int r=arr.length;
	int c= arr[0].length;int count =0;
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{if(i<=j)
			count+=arr[i][j];
		}
	}
	System.out.println(count);
	count=0;
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{if(i>=j)
			count+=arr[i][j];
		}
	}
	System.out.println(count);
}
		
		
		
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2},{3,4}};
	  sum(arr);
		}
}

