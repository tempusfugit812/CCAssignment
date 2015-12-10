package ch3;

//refer from Cracking the coding interview
//Since I didn't understand the actual solution, I just tried to follow it (I am still learning basic java)
//but I still get out of index error.
//I will look back code and study!




public class Solution01 {
	
	public static class arrStack{			//create an array composed of three stacks 
		private int numStack = 3;			//the number of stacks
		private static int stackCap = 90;		//stack capacity
		private static int [] stackData;		// actual data
		private static int [] sizes;			// size of stack
		
		public arrStack(int stackSize){			//constructor
			
		stackCap = stackSize;
		stackData = new int[stackSize * numStack];
		sizes = new int[numStack];
			
		}
	
	
	public static void push(int stackNum, int data){ //push method to store data in to stack
		if(isFull(stackNum)){
			System.out.println("stack is full"); //if full, print full
		} else{
		sizes[stackNum]++;
		stackData[stackNum] = data;
	}}
	
	
	
	public static int pop(int stackNum){	//pull method to get data from stack
		if(isEmpty(stackNum)){
			System.out.println("null");
		}
		
		int topIndex = tpIndex(stackNum);	//find data on the top of stack 
		int data = stackData[topIndex];
		stackData[topIndex] = 0;
		sizes[stackNum]--;				 
		return data;
		
		
	
	}
	
	public int top(int stackNum){			//return top data
		if(isEmpty(stackNum)){
			System.out.println("null");
			
		}return stackData[(tpIndex(stackNum))];
		
	}
	
	
	
	public static boolean isEmpty(int stackNum){  // if empty, return 0
		
		return sizes[stackNum]==0;
		
	}
	
	public static boolean isFull(int stackNum){	//if full, return stack capacity
		return sizes[stackNum]==stackCap;
	}
	
	
	
	
	private static int tpIndex(int stackNum){	//indicator for data on top 
		int offset = stackNum*stackCap;
		int size = sizes[stackNum];
		return offset + size - 1;
		
	}
	public static void main(String[] args){
		
		push(0,1);
		push(1,4);
		push(2,7);
		System.out.println(pop(0));
		
	}
}
	}
