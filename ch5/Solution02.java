//refer from Cracking the coding interview

package ch5;

import java.util.Stack;

public class Solution02 {
	public static void main(String args[]){
        
        int[] inputPreOrderArray = {1,2,3};
        System.out.println(checkBST(inputPreOrderArray));
     
        int[] inputPreOrderArray1 = {3,2,1,5,4,6};
        System.out.println(checkBST(inputPreOrderArray1));
         
        int[] inputPreOrderArray2 = {3,4,5,1,2};
        System.out.println(checkBST(inputPreOrderArray2));  
         
    }
     
    public static boolean checkBST(int[] inOrderArray){
        Stack<Integer> s = new Stack<Integer>();
        int lower = -1;
        for(int i=0;i<inOrderArray.length;i++){
            if(lower>-1 && inOrderArray[i] < lower){
                return false;
            }
            while(!s.isEmpty() && s.peek()<inOrderArray[i]){
                lower = s.pop();
            }
            s.push(inOrderArray[i]);
        }
        return true;
    }
 
	
	
	
}





