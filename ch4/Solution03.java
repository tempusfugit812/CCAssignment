//refer from Cracking the coding interview
package ch4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution03 {

	ArrayList<LinkedList<TreeNode>> createLL(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> l = new ArrayList<LinkedList<TreeNode>>();

		createLL(root, l, 0);
		return l;
	}

	void createLL(TreeNode root, ArrayList<LinkedList<TreeNode>> l, int lv) {

		if (root == null)
			return; // base case

		LinkedList<TreeNode> list = null;
		if (l.size() == lv) {

			list = new LinkedList<TreeNode>();
			l.add(list);

		} else {
			list = l.get(lv);
		}

		list.add(root);
		createLL(root.left, l, lv + 1);
		createLL(root.right, l, lv + 1);
	}
}