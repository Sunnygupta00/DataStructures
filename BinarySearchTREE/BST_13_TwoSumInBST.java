package binarySearchTree;
import java.util.*;
//===========================BST ITERATOR WHICH TRAVERSE BOTH LEFT AND RIGHT====================
class BST{
	
	  private Stack<TreeNode> stack = new Stack<TreeNode>();
	  // MAINTAING A FLAG 
	   // if reverse false means we are traversing from left side
		// if reverse true means we are traverseing from right side
	    boolean reverse; 
	    
	    public BST(TreeNode root, boolean isReverse) {
	        reverse = isReverse; 
	        pushAll(root);
	    }

	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        return !stack.isEmpty();
	    }

	    /** @return the next smallest number */
	    public int next() {
	        TreeNode tmpNode = stack.pop();
	        if(reverse == false) pushAll(tmpNode.right);
	        else pushAll(tmpNode.left); 
	        return tmpNode.val;
	    }
	    
	    private void pushAll(TreeNode node) {
	        while(node != null) {
	             stack.push(node);
	             if(reverse == true) {
	                 node = node.right; 
	             } else {
	                 node = node.left; 
	             }
	        }
	    }
		
	}
	

public class BST_13_TwoSumInBST {
//BRUTE FORCE : DO IN ORDER TRAVERSAL STORE IT IN LIST AND APPLY TWO POINTER APPROACH TO FIND THE VALUE
//	--->TIME COMPLEXITY: O(N)+O(N)+ SPACE{O(N)}
// BRUTE FORCE: BY USING HASHSET
	 static boolean found;
     static HashSet <Integer>set;
	 public static boolean findTarget(TreeNode root, int k) {
		 set=new HashSet<>();
		 helper(root,k);
		 return found;
	 }
	private static void helper(TreeNode root,int k) {
		if(root==null||found) {
			return ;
		}
		helper(root.left,k);
		if(set.contains(k-root.val)) {
			found=true;
			return;
		}
		set.add(root.val);
		helper(root.right,k);
		
	}
	//-----------------------^^^
 //--------------------ABOVE |||HERE MAIN IDEA WAS WE ARE STORING ELEMENT BY INORDER TRAVERSAL AND CHECKING WHETHER K-ROOTVAL IS PRESENT OR NOT
	
	public static boolean Findsum(TreeNode root, int k) {
        if(root == null) return false; 
        BST l = new BST(root, false); 
        BST r = new BST(root, true); 
        
        int i = l.next(); 
        int j = r.next(); 
        while(i<j) {
            if(i + j == k) return true; 
            else if(i + j < k) i = l.next(); 
            else j = r.next(); 
        }
        return false; 
    }
//===================================== WITHOUT CLASS==============================================================================================
	static boolean Findpairsum(TreeNode root,int k) {
		Stack<TreeNode>left=new Stack<>();
		Stack<TreeNode>right=new Stack<>();
		stackAdd(root,left,false);
		stackAdd(root,right,true);
		int i=next(left, false);
		int j=next(right,true);
		while(i<j) {
			int n=i+j;
			if(n==k)return true;
			// moving pointer ahead 
			if(n<k) {
			i=next(left, false);
			}
			else {
				j=next(right,true);
			}
		}
		return true;
	}
   
	private static void stackAdd(TreeNode root, Stack<TreeNode> stack, boolean reverse) {
		while(root!=null) {
			stack.push(root);
			if(!reverse) {
				root=root.left;
			}else {
				root=root.right;
			}
		}
	
	}
	private static  int next(Stack<TreeNode> stack, boolean reverse) {
		TreeNode temp=stack.pop();
		if(!reverse) {
			stackAdd(temp.right, stack, reverse);
		}else {
			stackAdd(temp.left, stack, reverse);
		}
		return temp.val;
	}
	public static void main(String[] args) {
		 /*
      8
    /   \    
  4      12
/  \    /  \
2    6  10   14

	  */

   TreeNode root = new TreeNode(8);
    root.left = new TreeNode(4);
    root.right = new TreeNode(12);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(6);
    root.right.left = new TreeNode(10);
    root.right.right = new TreeNode(14);
  System.out.println(findTarget(root, 12));
  System.out.println(Findsum(root, 8));
  System.out.println(Findpairsum(root,12));
  
  

	}

}
