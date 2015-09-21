//Base Rule
//1. s2 must be the part of s1
//2. in order to make this possible, store waterbottle twice into s1
//3. thus, the length of s2 must be half length of s1
//4. s1 must contain s2

package answer;

public class HW1_1_9 {

	public static void main(String[] args){
		String s1 = "waterbottlewaterbottle";	//watterbottle x2
		String s2 = "rbottlewate";		//any string which is rotation of s1
		
		System.out.println(isSub(s1,s2));
	}
	

	public static boolean isSub(String s1, String s2){
			
			int len = s1.length();	// set len as s1's length
			
			if (len/2 == s2.length() && s1.contains(s2)){  //check the length and check if sub-string
				
			 return true;
				
			}
			return false;
	}
	
}
