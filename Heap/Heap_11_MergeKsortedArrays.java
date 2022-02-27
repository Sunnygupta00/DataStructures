package heap;
import java.util.*;
public class Heap_11_MergeKsortedArrays {
	// This is NKLOGNK APPROACH
	public static ArrayList<Integer> mergeKArrays(int[][] arr) 
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->a-b);// min heap
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                pq.offer(arr[i][j]);
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        while(pq.size()>0){
            ans.add(pq.poll());
        }
        return ans;
        
        
    }
	private static class Triple implements Comparable<Triple>{
		int val;
		int aPos;
		int vPos;
		Triple(int v,int a, int b){
			val=v;
			aPos=a;
			vPos=b;
		}
		@Override
		public int compareTo(Triple o) {
			return this.val-o.val; 
		}
		
		
	}
	public static List<Integer>mergeKarray(List<List<Integer>> arr){
		List<Integer>ans=new ArrayList<>();
		PriorityQueue<Triple>pq=new PriorityQueue<>();
		for(int i=0;i<arr.size();i++) {
			// GETING FIRST ELEMENT FROM EACH ARRAY
			pq.add(new Triple(arr.get(i).get(0),i,0));
		}
		while(pq.size()>0) {
			Triple temp=pq.poll();
			ans.add(temp.val);
			temp.vPos++;
			if(temp.vPos<arr.get(temp.aPos).size()) {
				temp.val=arr.get(temp.aPos).get(temp.vPos);	// TAKING NEXT ELEMENT FROM SAME ARRAY

				pq.add(temp);
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		int arr[][]= {{5,10},
		              {4,9},
		              {6}
		                        };
		List<List<Integer>>arrl=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			List<Integer>temp=new ArrayList<>();
			for(int j=0;j<arr[i].length;j++) {
				temp.add(arr[i][j]);
			}
			arrl.add(temp);
		}
		System.out.println(mergeKarray(arrl));
        System.out.println(mergeKArrays(arr));
	}

}
