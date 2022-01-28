package sORTING;


import java.util.*;
class  Shop{
	int product;
	String name;
	public Shop(int product,String name)
	{
		this.product=product;
		this.name=name;
	}
	public static Comparator<Shop> productcompare=new Comparator<Shop>(){
		public int compare(Shop s1,Shop s2)
		{
			return s1.product-s2.product;
		}
	};
}
//class stockCompare implements Comparator<Shop>{
//
//	@Override
//	public int compare(Shop o1, Shop o2) {
//		// TODO Auto-generated method stub
////		return o1.product-o2.product;
//		return o1.name.compareTo(o2.name);
//	}
//	
//	
//}
public class Arraysort {

	public static void main(String[] args) {
//		int arr[]= {5,3,4,2,1};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		Integer arr[]= {5,4,2,1,3};
//		Arrays.sort(arr,Collections.reverseOrder());
//		System.out.println(Arrays.toString(arr));
//		//question sort a array in such a way that even
//		//number comes first and then odd numbers
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		Point a[]= {new Point(3,4),new Point(1,2),new Point(6,5)};
//		Arrays.sort(a);

		
		ArrayList<Shop> s=new ArrayList<Shop>();
		s.add(new Shop(123,"z"));
		s.add(new Shop(321,"k"));
		s.add(new Shop(456,"c"));
		s.add(new Shop(654,"d"));
		s.add(new Shop(789,"e"));
		Collections.sort(s,Shop.productcompare);
		for(Shop k:s)
		{
			System.out.println(k.product+" "+k.name);
		}

	// Choti si advice :
//		comparator:ise hame array.sort me include karna 
//		padega
//		3.is preferable aur iske andar compare method hoota hai
//			2.we can compare on the basis of various things
//			comparable: ise nahi include karna
//		3. iske andar compareTo hota hai
		

	}

}
