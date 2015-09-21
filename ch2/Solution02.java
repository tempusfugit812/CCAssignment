//Base Rule
//1. let two nodes start from the different position
//Reference: ProgrammerInterview (URL: http://www.programmerinterview.com/index.php/data-structures/find-nth-to-last-element-in-a-linked-list/)


package answer;

public class HW1_2_2 {
	public static void main(String[] args) {

		LinkedListNode a = new LinkedListNode(0); //make linked list
		a.appendToTail(1);
		a.appendToTail(2);
		a.appendToTail(3);
		a.appendToTail(3);
		a.appendToTail(5);
		a.appendToTail(8);
		a.appendToTail(9);
		int n =2;		//nth position from the last
		System.out.println(n+"-th node from the last is:" + nthNode(a,n));
	}

	public static int nthNode(LinkedListNode a, int n) {

		LinkedListNode node1 = a;	
		LinkedListNode node2 = a;			//both nodes start at the beginning node (head)
		for (int i = 0; i < n-1; ++i) {
			node2 = node2.next;			//make second node move until reach to n-1
				
		}
		while(node2.next !=null){	    //loop for node2 gets  to the end: from n-1 to the last
			node1 = node1.next;			//each node keep storing the next node until ends
			node2 = node2.next;			//node1 has the address for n-th from the last
		
		}
		return node1.data;			
		
	}

}
