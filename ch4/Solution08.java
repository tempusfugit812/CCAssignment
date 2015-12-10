//refer from Cracking the coding interview

package ch4;

public class Solution08 {
	
	TreeNode CA(TreeNode a, TreeNode b){
		
		if(a==b)
			return null;
		
		
		TreeNode ancestor = a;
		while(ancestor != null){
			
			if(isPath(ancestor, b)){
				
				return ancestor;
				
			}
			ancestor = ancestor.parent;
		}
		
		return null;
	}
	
	boolean isPath(TreeNode ancestor, TreeNode node){
		while (node != ancestor && node != null){
			node = node.parent;
		}
		return node == ancestor;
	}
}	
	
