//Reference: Cracking the Coding Interview, pp92

package answer;

public class LinkedListNode {
	LinkedListNode hNode = null;
	LinkedListNode next = null;
	int data;
	
	
	public LinkedListNode(int d){
		
		data = d;
	}
	
	void appendToTail(int d){
		
		LinkedListNode end = new LinkedListNode(d);
		LinkedListNode n = this;
		while (n.next != null){
			
			n=n.next;
		}
		
		n.next = end;
	}
	
}
