package ch4;
//refer from Cracking the coding interview


public class Solution04 {
	int checkDepth(TreeNode root){
		if (root == null){
			return 0; // depth of root
		}
		
		int leftDepth = checkDepth(root.left);
		if(leftDepth == -1){
			return -1; // Not Balanced
		}
		
		int rightDepth = checkDepth(root.right);
		if(rightDepth == -1){
			return -1; // Not balanced
			
		}
		
		int currentDepth = leftDepth - rightDepth;
		if(Math.abs(currentDepth)>1){
			
			return -1;
		}else {
			return Math.max(leftDepth, rightDepth)+1; // return depth
		}
	}
	
	boolean checkBalanced(TreeNode root){
		if(checkDepth(root)==-1){
			return false;
		}else{
			return true;
		}
	}
}