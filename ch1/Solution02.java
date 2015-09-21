package answer;



//Base Rule
//1.String 1 and String 2 are the permutation of each other
//2.the length of string must be the same
//3.the characters of each string must be the same 
//4.but characters are in different order



import java.util.Arrays;


public class HW1_1_2 {
	
	
	public static void main(String[] args){
			System.out.println(permutationCheck("abcdefg", "cdefabg")); //set the main argument with two sets of string 
																		//each string must have the same characters in different order in order to be permutation 
	}



public static boolean permutationCheck(String s1, String s2){
		if(s1.length()==s2.length()){   // check if the lengths of two strings are the same 
		
			char[] char_s1 = s1.toCharArray();  // in order to sort characters of each string, save them into character array set.
			char[] char_s2 = s2.toCharArray();
			
			Arrays.sort(char_s1);   //use sort function of array
			Arrays.sort(char_s2);
			
			String sorted_s1 = new String(char_s1);  // store sorted string into new string
			String sorted_s2 = new String(char_s2);
			
			if(sorted_s1.equals(sorted_s2)){   //compare each other 
				
				return true; //if two strings are the same, return true (permutation)
				
			}
			
			
		}
		return false; // if the lengths of two strings or the sorted results of two strings are not the same, return false (not permutation)
}	
	
	
	
}
