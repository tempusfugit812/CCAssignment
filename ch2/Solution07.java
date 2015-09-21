//Base Rule
//1. some nodes are different
//2. must share some other nodes
//3. compare length
//4. check if has intersecting nodes

//REFERENCE: Cracking Coding Interview
//		   : Programcreek (http://www.programcreek.com/2014/02/leetcode-intersection-of-two-linked-lists-java/)


package answer;

public class HW1_2_7 {

	public static void main(String[] args) {

		LinkedListNode a = new LinkedListNode(3);
		a.appendToTail(1);
		a.appendToTail(5);
		a.appendToTail(9);
		a.appendToTail(7);
		a.appendToTail(2);
		a.appendToTail(1);
		LinkedListNode b = new LinkedListNode(4);
		b.appendToTail(6);
		b.appendToTail(7);
		b.appendToTail(2);
		b.appendToTail(1);

		System.out.println(checkIntersect(a, b));

	}

	public static LinkedListNode checkIntersect(LinkedListNode a,
			LinkedListNode b) {

		int a_len = 0;
		int b_len = 0;

		LinkedListNode a1 = a;
		LinkedListNode b1 = b;
		if (a1 == null || b1 == null) {
			return null;
		} else {
			while (a1 != null) {
				a_len++;
				a1 = a1.next;
			}
			while (b1 != null) {
				b_len++;
				b1 = b1.next;
			}

			a1 = a;
			b1 = b;
			int sub;
			if (a_len > b_len) {
				sub = a_len - b_len;
				for (int i = 0; i < sub; i++) {

					a1 = a1.next;
				}

			} else {
				sub = b_len - a_len;
				for (int i = 0; i < sub; i++) {

					b1 = b1.next;
				}

			}

			while (a1 != null && b1 != null) {

				if (a1 == b1) {

					return a1;
				}
				a1 = a1.next;
				b1 = b1.next;
			}

		}
		System.out.println(a1);
		System.out.println(b1);
		return null;
	}

}
