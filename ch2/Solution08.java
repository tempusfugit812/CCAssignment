//Base Rule
//node should returns to the same node while iterating
//reference: Cracking the Coding Interview

package answer;

public class HW1_2_8 {
	public static void main(String[] args) {

		LinkedListNode a = new LinkedListNode(0);
		a.appendToTail(1);
		a.appendToTail(2);
		a.appendToTail(3);
		a.appendToTail(4);
		a.appendToTail(5);
		a.appendToTail(3);

		System.out.println(checkIntersect(a));

	}

	public static boolean checkIntersect(LinkedListNode a) {
		if (a == null) {
			return false;			//if node is null return fase
		} else {
			LinkedListNode r1 = a;		//let two node indicate the same a(head)
			LinkedListNode r2 = a;
			while (r2 != null && r2.next != null) {

				r1 = r1.next;			//first node increase by 1
				r2 = r2.next.next;		//second node increase by 2

				if (r1 == r2)		//if both have the same, 
					break;			// stop looping

			}
			return true;	//return true;
		}
	}

}
