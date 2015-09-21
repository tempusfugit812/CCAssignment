// Base Rule
// 1. each character of string must be unique


public class HW1_1_1 {

	public static void main(String[] args) {
		System.out.println(duplicateCheck("ass"));
		// Main function that checks if string is unique or not.
	}

	public static boolean duplicateCheck(String s) { //The outcome should be boolean, either True (unique) or False (Not unique) 
		for (int i = 0; i < s.length(); i++) { //i needs to be checked by the number of characters 
			for (int z = 0; z < s.length(); z++) { //each character, corresponding to i, needs to be checked with other characters corresponding to z 
				if (i != z && s.charAt(i) == s.charAt(z)) { //if each character corresponding to i and z are the same while i and z are not the same,
					return false; // return false (not unique)
									}
			}
		}
		return true; // or return true (unique)
	}
}
