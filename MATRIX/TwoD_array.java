package matrix;
/* What is Matrix:
 * 
 */
public class TwoD_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},
				      {4,5,6}};
//		int arr[][]=new int [3][3];  -------> used to initialize our array
//		int arr[][]=new int[3][];------->we can use this
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		   System.out.println();
		}
		
				

	}

}
