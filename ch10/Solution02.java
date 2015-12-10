//refer from Cracking the coding interview
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Solution02 {

	public static void main(String[] arg) {
		String[] arr = { "abc", "cat", "dog", "cba", "god", "act" };
		System.out.println(sortString(arr));

	}

	public static String sort(String str) {

		char[] ch = str.toCharArray();
		Arrays.sort(ch);

		return new String(ch);

	}

	public static ArrayList<String> sortString(String[] arr) {
		HashMap<String, ArrayList<String>> hMap = new HashMap<String, ArrayList<String>>();
		for (String str : arr) {

			String key = sort(str);
			if (hMap.containsKey(key)) {
				ArrayList<String> value = hMap.get(key);
				value.add(str);
				hMap.put(key, value);
			} else {
				ArrayList<String> value = new ArrayList<String>();
				value.add(str);
				hMap.put(key, value);
			}

		}

		Collection<ArrayList<String>> arrCollected = hMap.values();
		ArrayList<String> outerArr = new ArrayList<String>();

		Iterator<ArrayList<String>> iter = arrCollected.iterator();
		while (iter.hasNext()) {
			outerArr.addAll(iter.next());
		}
			return outerArr;
	}

}
