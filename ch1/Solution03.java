package answer;


//Base Rule
//1.white space must be replaced with '%20'
//2.the out come must fit in true length of string

public class HW1_1_3 {

	public static void main(String[] args) {

		String input = "Mr John Smith      "; //store input string into input
		String output = "";	// Declare output as string for later in order to store return value that will be created via spaceReplace
		int length = 13; //store true length of string into length

		output = spaceReplace(input, length);  //store the return value of spaceReplace with parameter input and length

		System.out.println(output); //show the result

	}

	public static String spaceReplace(String s, int i) {

		s = s.substring(0, i);  //cut the string by i
								//source referred, tutorialspoint (http://www.tutorialspoint.com/java/java_string_substring.htm)
		s = s.replace(" ", "%20"); // replace white space with %20
								//source referred, tutorialspoint (http://www.tutorialspoint.com/java/java_string_replace.htm)

		return s;  //return s that has the replaced string 

	}

}
