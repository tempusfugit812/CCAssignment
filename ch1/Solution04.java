package answer;
//Base Rule
//1. only one unique character is acceptable 
//2. non case sensitive
//3. white space can be ignored
public class HW1_1_4 {

	public static void main(String[] args){

		
		String input = "Tact Coa";
		boolean output;			 //since the result must be turned into either true and false, data type must be boolean
		
		
		output = palindromePermutation(input);
		
		System.out.println(output);
		
		
		
	}
	public static boolean palindromePermutation(String s){
		s = s.replace(" ",""); 			// remove whitespace because whitespace does not matter in this case
		s = s.toLowerCase();			 // change all characters to lowercase as it is not case sensitive
	
		boolean isPP = true;			 //set up the return value
		char c;				//variable for each character
		int cnt = 0; 			//variable for character count
		int oddCnt = 0;			 //variable for odd count
		int sLen = s.length();			 // variable for string length
		
		for(int i =0; i<sLen; i++){ 			//i needs to be checked by the number of characters 
			cnt=0; 			//reset the value in cnt for each loop
			c = s.charAt(i); 			//store character on i into c
			cnt++;			 //character on i is selected, so increase cnt by 1
			for(int j = 0; j<sLen; j++){			//each character, corresponding to i, needs to be checked with other characters corresponding to j 
				if(i != j && c == s.charAt(j)) 
					
					cnt++; 			//if each character corresponding to i and j are the same while c and character on j are the same, increase cnt
				
			}
			if(cnt == 1) oddCnt++;			 //if cnt == 1 we can keep running the loop
		}
		if(oddCnt >=2) isPP = false;			 //if oddCnt >= 2, input cannot be palindrome permutation
		
		return isPP;
	}
		
}
