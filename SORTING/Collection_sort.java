package sORTING;
import java.util.*;
import java.util.List;
public class Collection_sort {

	public static void main(String[] args) {
		
	    List<Integer>list=new ArrayList<Integer>();
		list.add(12);
		list.add(1);
		list.add(0);
		
		Collections.sort(list);
		System.out.println("before: "+list);
        Collections.reverse(list);
        System.out.println("After: "+list);

	}

}
