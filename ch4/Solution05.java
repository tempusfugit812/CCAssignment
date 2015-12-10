//refer from Cracking the coding interview

package ch4;

public class Solution05 {

	Integer last;
	boolean isBST(TreeNode root){
		if (root == null){
			return true;
		}
		
		if(!isBST(root.left)){
			return false;
			
		}
		if(last !=null && root.data < last){
			return false;
		}else{
			last = root.data;
		}
		if(!isBST(root.right)){
			return false;
		}
		return true;
	}
	
	
}
