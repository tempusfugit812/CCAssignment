
//refer from Cracking the coding interview
package ch4;

public class Solution02 {
	static TreeNode BST(int array[]){
		return BST(array, 0, array.length-1);
	}
	
	static TreeNode BST(int arr[], int root, int end){
		if(end < root){
			return null;
		}
		int mid = (root+end)/2;
		TreeNode node = new TreeNode(arr[mid]);
		node.left = BST(arr, root, mid-1);
		node.right = BST(arr,mid+1, end);
		return node;
		
	}
	
	
	public static void main(String[] args){
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(BST(arr));
	}
}
