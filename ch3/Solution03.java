package ch3;

import java.util.ArrayList;
import java.util.Stack;



//refer from Cracking the coding interview
//Since I didn't understand the actual solution, I just tried to follow it (I am still learning basic java)
//I will look back code and study! 

public class Solution03 {

	class StackSet {
		ArrayList<Stack> stacks = new ArrayList<Stack>();
		public int cap;

		public StackSet(int cap) {
			this.cap = cap;
		}

		public void push(int d) {
			Stack last = getLastStack();
			if (last != null && !last.isFull()) {
				last.push(d);

			} else {
				Stack stack = new Stack(cap);
				stack.push(d);
				stacks.add(stack);

			}

		}

		public int pop() {

			Stack last = getLastStack();
			if (last == null)
				System.out.println("null");

			int d = last.pop();
			if (last.size() == 0)
				stacks.remove(stacks.size() - 1);
			return d;

		}

		public Stack getLastStack() {
			if (stacks.size() == 0)
				return null;
			return stacks.get(stacks.size() - 1);
		}

		public boolean isEmpty() {

			Stack last = getLastStack();
			return last == null || last.isEmpty();

		}

		public int popAt(int i) {
			return leftShift(i, true);
		}

		public int leftShift(int i, boolean removeTop) {
			Stack stack = stacks.get(i);
			int itemRemoved;
			if (removeTop) {
				itemRemoved = stack.pop();
			} else {
				itemRemoved = stack.removeBottom();
			}
			if (stack.isEmpty()) {
				stacks.remove(i);

			} else if (stacks.size() > i + 1) {
				int d = leftShift(i + 1, false);
				stack.push(d);
			}
		}

		public class Stack {
			private int cap;
			public Node top, bottom;
			public int size = 0;

			public Stack(int cap) {
				this.cap = cap;

			}

			public boolean isFull() {
				return cap == size;

			}
			public void join(Node abo, Node bel){
				if(bel != null) bel.abo = abo;
				if(abo != null)abo.bel = bel;
				
			}
			
			public boolean push(int d){
				if(size >= cap)return false;
				size++;
				Node n = new Node(d);
				if(size==1){
					bottom = n;
					join(n, top);
					top = n;
					return true;
				}
				
			}
			public int pop(){
				Node t = top;
				top = top.bel;
				size --;
				return t.data;
			}
			public boolean isEmpty(){
				return size == 0;
			}
			public int removeBottom(){
				Node bt = bottom;
				bottom = bottom.abo;
				if(bottom !=null) bottom.bel = null;
				size--;
				return bt.data;
			}
		}

	}

}

class Node