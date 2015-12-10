package ch3;

import java.util.Stack;

//refer from Cracking the coding interview
//Since I didn't understand the actual solution, I just tried to follow it (I am still learning basic java)
//I will look back code and study! 
public class Solution04 {

	public class MyQueue<T>{
		
		Stack<T> fStack, sStack;
		
		public MyQueue(){
			fStack = new Stack<T>();
			sStack = new Stack<T>();
		}
		
		public int qSize(){
			
			return fStack.size() + sStack.size();
			
		}
		public void qPush(T data){
			sStack.push(data);
			
		}
		private void moveStack(){
			if(fStack.isEmpty()){
				while(!sStack.isEmpty()){
					fStack.push(sStack.pop());
				}
			}
			
		}
		public T peek(){
			moveStack();
			return fStack.peek();
		}
		
		public T remove(){
			moveStack();
			return fStack.pop();
		}
	
	
	}
	
}
