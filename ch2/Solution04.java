//Base Rule
//1. node with less value than n =5, move to left
//2. node with n-th don't have to move
//3. node with the value of n goes after the nodes less than n
// REFERENCE: Cracking the Coding Interview



package answer;

public class HW1_2_4 {
	public static void main(String[] args) {
		LinkedListNode original = new LinkedListNode(3);
		original.appendToTail(5);
		original.appendToTail(8);
		original.appendToTail(5);
		original.appendToTail(10);
		original.appendToTail(2);
		original.appendToTail(1);
		
		int n = 5;

		while (original != null) {			//loop for printing input nodes list
			System.out.print(original.data);
			System.out.print(" ");
			if (original.next == null) {
				break;
			} else {
				original = original.next;
			}
		}

		partitioning(original, n);
		
		

	}

	public static LinkedListNode partitioning(LinkedListNode original, int n) {
		if(original == null) return original;
		LinkedListNode currentN = null;
		LinkedListNode nextN = original;
		while (nextN != null) {  //loop until nextN gets to the end

			if (nextN.data > n || nextN == original) {  //if value of next node is either greater than n=5 or equal original(head),

				currentN = nextN;			//save node into current N
				nextN = nextN.next;			//move to next
				
			} else {					//if value is less than n=5,
				LinkedListNode nextNN = nextN.next; //next.next Node has the value of next node
				nextN.next = original;		//next node moves back to beginning
				if (currentN != null) { // if current node is not null,
					currentN.next = nextNN;	// next node of current node has the value of next next node,
					
				}
				original = nextN;		//original has the next node value
				nextN = nextNN;	// next node value has the next next node value
				
			}
			
			if (original.next == null) { //if list node is null, end of list, break
				break;
			} else {
				original = original.next; 
			}
		}
	
		return original;
		
	}
}
