//refer from Cracking the coding interview

package ch3;

import java.util.Stack;

public class Solution05 {
	
	Stack<Integer> sort(Stack<Integer> stack){
		Stack<Integer> order = new Stack<Integer>();
		
		while(!stack.isEmpty()){
			int temp = stack.pop();
			while(!order.isEmpty()&& order.peek()>temp){
				
				stack.push(order.pop());
			}
			order.push(temp);
		}
		return order;
		
	}
	
	
	
}
