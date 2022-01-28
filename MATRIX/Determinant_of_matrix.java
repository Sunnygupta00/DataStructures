package matrix;

public class Determinant_of_matrix {

	static int determinant(int arr[][],int n)
	{
		int num1,num2,det=1,index,total=1;
		// for storing row
		int []temp=new int [n+1];
		for(int i=0;i<n;i++)
		{
			index=i;
			while(arr[index][i]==0&&index<n)
			{
				index++;
			}
			if(index==n)
			{
				continue;
			}
			if(index!=i)
			{
				for(int j=0;j<n;j++)
				{
					swap(arr,index,j,i,j);
				}
				det=(int)(det*Math.pow(-1,index-i));
			}
			for(int j=0;j<n;j++)
			{
				temp[j]=arr[i][j];
			}
			for(int j=i+1;j<n;j++)
			{
				num1=temp[i];
				num2=arr[j][i];
				
			}
		}
	}
	
	private static void swap(int[][] arr, int index, int j, int i, int j2) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		

	}

}
