package sORTING;

import java.util.Comparator;
import java.util.Arrays;
class point implements Comparator<point>{
	int x,y;
	private point o1;

	public point(int i, int j) {
		this.x=i;this.y=j;
		// TODO Auto-generated constructor stub
	}

	public int compare( point o1, point o2) {
		
	
		return o1.x-o2.y;
	}
}

public class ss {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point arr[]= {new point(20,10),new point(30,40)};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].x+" "+arr[i].y);
		}

	}

}
