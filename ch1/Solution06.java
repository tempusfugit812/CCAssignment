//Base Rule
//1. Need to count the number of redundancy of each character in input string
//2. Need to be sorted in order to ease the comparison between character

package answer;

public class HW1_1_6 {

	public static void main(String[] args) {
		String input = " asdasfvokasd"; // store input string
		System.out.println("Input =" + input);
		input = sortInput(input); // store sorted string into input
		charCount(input); // show counted and compressed string
	}

	public static void charCount(String s) { // method for counting and
												// compressing
												// 's' here is sorted string
		int i = 0;
		int j = 0;
		int cnt = 0;
		char ch = ' ';
		StringBuffer compression = new StringBuffer(); // by using stringbuffer,
														// it is possible to
														// merge strings without
														// creating new string

		for (i = 0; i < s.length(); i++) { // repeat comparing character until
											// the loop reaches to the length of
											// string
			if (ch != s.charAt(i)) { // if character is not the same one as i-th
										// character of string,
				ch = s.charAt(i); // ch takes i-th character in it
				cnt = 0; // starting with new character, reset count number to 0
			} else
				continue; // if ch is the same character as i-th character, go
							// back to the first until ch becomes different
			for (j = 0; j < s.length(); j++) {
				if (ch == s.charAt(j)) // if ch is the same as j-th character of
					cnt++; // increase count
			}
			compression.append(ch); // for each loop, add character and count to
									// the result string to express in
									// compressed sentance
			compression.append(cnt);
		}
		System.out.println("Compressed string is: = " + compression.toString());
	}

	public static String sortInput(String s) {
		char[] ch;
		char temp;
		int i = 0;
		int j = 0;
		ch = s.toCharArray();
		for (i = 0; i < ch.length - 1; i++) { // loop for length of string
			for (j = i + 1; j < ch.length; j++) { // loop for each character to
													// be compared with i
				if (ch[i] > ch[j]) { // character can be compared due to ASCII
										// code
					temp = ch[i]; // if i-th character's ASCII value is larger
									// than (i+1)-th character, set i-th
									// character into temp
					ch[i] = ch[j]; // put (i+1)-th character into i-th ch and
									// then
					ch[j] = temp; // put value saved in temp into j-th ch
				}
			}
		}
		s = new String(ch);

		return s;
	}
}
