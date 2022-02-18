package binarySearchTree;
import java.util.*;
public class BST_08_ValidateBST {
	// recursive
	public boolean isValidBST(TreeNode root) {
        long max=Long.MAX_VALUE;
        long min=Long.MIN_VALUE;
        return check(root,min,max);
    }
    public boolean check(TreeNode root,long min,long max){
        if(root==null)return true;
        if(root.val>=max||root.val<=min)return false;
        return check(root.left,min,root.val)&&check(root.right,root.val,max);
    }
    // iterative
    // we are doing inorder means our element will be visited smaller to greater if this order breaks return false;
    public boolean isValid(TreeNode root) {
    	Stack<TreeNode>s=new Stack<>();
    	TreeNode prev=null;
    	TreeNode curr=root;
    	while(curr!=null||s.size()>0) {
    		if(curr!=null) {
    			s.push(curr);
    			curr=curr.left;
    		}
    		else {
    			TreeNode pop=s.pop();
    			if(prev!=null&&pop.val<=prev.val) {
    				return false;
    			}
    			prev=pop;
    			curr=pop.right;
    		}
    	}
    	return true;
    }
	public static void main(String[] args) {
		

	}

}
