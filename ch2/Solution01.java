//Base Rule
//1. save data in node in somewhere
//2. check the duplicates
//Reference1: Cracking the Coding Interview 
//Reference2: tutorialspoint (URL:http://www.tutorialspoint.com/java/java_hashset_class.htm)

package answer;

import java.util.HashSet;

public class HW1_2_1 {

	public static void main(String[] args) {

		LinkedListNode a = new LinkedListNode(1);	//make linked list

		a.appendToTail(1);
		a.appendToTail(2);
		a.appendToTail(3);
		a.appendToTail(3);
		a.appendToTail(2);
		a.appendToTail(3);
		a.appendToTail(4);
		a.appendToTail(5);

		duplicateCheck(a);
	}

	public static void duplicateCheck(LinkedListNode a) {
		HashSet<Integer> hSet = new HashSet<Integer>();	//create hash set

		LinkedListNode prev = null; // make another node to be used in duplicate check
		while (a != null) {			//loop until linked list has data
			if (hSet.contains(a.data)) {	//if hash set already has the data, 

				prev.next = a.next;	//save this data to the previous data - duplicates removal

			} else {
				hSet.add(a.data); //else, add this data to set
				prev = a;  //store this node into previous node 
			}
			a = a.next; // this node moves to the next node

		}

		System.out.println(hSet);	//while checking duplicates, the duplicates were already removed
									// thus, we can just print set
	}

}
