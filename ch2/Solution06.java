//base rule
//1. list from first and from last must be the same
//2. make reversed version of original list
//3. compare


package answer;

public class HW1_2_6 {

	public static void main(String[] args) {

		LinkedListNode a = new LinkedListNode(0);
		a.appendToTail(1);
		a.appendToTail(2);
		a.appendToTail(3);
		a.appendToTail(2);
		a.appendToTail(1);
		a.appendToTail(0);
		
		System.out.println(checkPal(a));
		
	}

	static boolean checkPal(LinkedListNode a) {

		LinkedListNode n = a;		// Node n gets a 
		LinkedListNode s = new LinkedListNode(a.data); // Node s gets the data of a

		while (n.next != null) {
			LinkedListNode buffer = new LinkedListNode(n.next.data); //indicate n's next data into temporary buffer's head
			buffer.next = s; //buffer's next value becomes s
			s = buffer; //s gains value in buffer
			n = n.next;// n moves to the next node
		}

		LinkedListNode ordered = a;  //original node list has a
		LinkedListNode reversed = s; //reversed node list has s

		while (ordered != null) {		

			if (ordered.data != reversed.data)		//data comparison
				return false;

			ordered = ordered.next;				//each node iterates until ends
			reversed = reversed.next;
		}

		return true;

	}

}
