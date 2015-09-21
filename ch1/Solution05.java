//Base Rule
//1. if the lengths of two string are the same
//	- only one character difference is acceptable
//2. if the difference of length is '1'
//	- String 1 is longer than String 2
//	- String 2 is longer than String 1


package answer;

public class HW1_1_5 {
	public static void main(String[] args) {
		String input1 = "pale";
		String input2 = "bale";
		boolean output = oneWayCheck(input1, input2);
		System.out.println(output);
	}
	public static boolean oneWayCheck(String s1 , String s2){
		boolean isCheck = true;
		int i = 0;
		int j = 0;
		int cnt = 0;
		int len = Math.abs(s1.length() - s2.length());	//simplify the condition mentioned in second Base Rule by setting absolute value
		if(len == 0){		//if the lengths are the same
			for(i=0; i<s1.length(); i++){
				if(s1.charAt(i) != s2.charAt(i)) cnt++; //compare i-th character of each string 
			}
			if(cnt >= 2) isCheck = false;		//if the number of different character is more than one, return false
		}else if(len == 1){  //if length difference is 1
			
			if(s1.length() > s2.length()){ //in case of string1 is longer than string 2
				len = s2.length(); 
				for(i=0; i<s2.length(); i++){ //the number of loop to be checked becomes shorter length
					for(j=0; j<s1.length(); j++){
					
																//check if a character of shorter string is also in longer string
						if(s2.charAt(i) == s1.charAt(j)) cnt++; //count the number of same character  
					}
				}
				if(len - cnt != 1) isCheck = false; //if there is more than one different character, return false
			}
			else{
				len =s1.length();							//in case of string1 is shorter than string2
				for(i=0; i<s1.length(); i++){				//same logic applied
					for(j=0; j<s2.length(); j++){
						
						if(s1.charAt(i) == s2.charAt(j)) cnt++;
					}
				}
				if(len - cnt != 1) isCheck = false;
			}
			cnt = 0;
			for(i=0; i<len; i++){ //when length difference is 1, increase the count when the modification was made at the last character of string
				if(s1.charAt(i) == s2.charAt(i)) cnt++;
			}
			if(len - cnt == 0) isCheck = true;
			
		}else{
			isCheck = false;
		}
		
		return isCheck;
	}
}
