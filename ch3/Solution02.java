package ch3;

//refer from Cracking the coding interview
//Since I didn't understand the actual solution, I just tried to follow it (I am still learning basic java)
//I will look back code and study! 



import java.util.Stack;

public class Solution02 {

	class MinNode {

		public int data;			//data variable
		public int min;				//minimum data variable

		public MinNode(int data, int min) {	
			this.data = data;
			this.min = min;

		}

	}

	public class StackAndMin extends Stack<MinNode> {

		public void push(int data){			//push data into stack
			int newMin = Math.min(data, minVal());		//find minimal data from stack
			super.push(new MinNode(data, newMin));		
			
			
		}
		public int minVal(){
			if(this.isEmpty()){
				return Integer.MAX_VALUE;
			}else{
				return peek().min;				
			}			
		}
		
	}
	
	public static void main(String[] args){
		
	
		
	}

}
