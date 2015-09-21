//Base Rule
//1. the number of nodes must be odd number
//2. get the length of linked list and divide it by 2
//3. length/2 becomes index of middle node

//REFERENCE: Beginner's Book (URL: http://beginnersbook.com/2013/12/linkedlist-in-java-with-example/)


package answer;

import java.util.LinkedList;

public class HW1_2_3 {
	public static void main(String[] args) {

		midCheck();
	}

	public static void midCheck() {
		LinkedList list = new LinkedList(); //create LinkedList
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(2);
		list.add(3);
		list.add(8);
		System.out.println("Input Node = " + list);	//Input node list
		if (list.size() % 2 == 0) {			//check if the number of nodes is odd
			System.out.println("The number of node must be odd");
		} else {
			list.remove(list.size() / 2);			//get the middle node index by divide length of list by 2 and remove;
		}
		System.out.println("After removed = " + list);
	}
}
