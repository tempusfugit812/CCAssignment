//refer from Cracking the coding interview

package ch4;

public class Solution06 {
	TreeNode in_order(TreeNode node){
		if (node == null) return null;
		
		if(node.right != null){
			
			return leftMostNode(node.right);
		}else{
			
			TreeNode a = node;
			TreeNode p = a.parent;
			
			while(p !=null && p.left != a ){
				
				a = p;
				p = p.parent;
				
			}
			return p;
		}
		
	}
	
	TreeNode leftMostNode(TreeNode node){
		
		
		if(node == null){
			return null;
		}
		while (node.left != null){
			node = node.left;
			
		}
		return node;
	}
	
	
	
	
	
	
	
}