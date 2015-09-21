//Reference:CMU lecture (URL: http://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html)
//			tutorialpoint (URL: http://www.tutorialspoint.com/java/util/linkedlist_listiterator.htm )
//base rule
//1. each list must be shown reversely
//2. each list must be shown normally


package answer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class HW1_2_5 {
	
	public static void main(String[] args) {

		reverse();
		System.out.println();
		normal();
	}
	public static void reverse() {
		LinkedList s1 = new LinkedList();  //create two linked list
		LinkedList s2 = new LinkedList();
		ListIterator iter;					//create iterator
		ListIterator iter2;
		int sum = 0;
		String a1 = "", a2 = "";

		s1.add(7);			//add item into list
		s1.add(1);
		s1.add(6);
		
		
		s2.add(5);
		s2.add(9);
		s2.add(2);
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

		iter = s1.listIterator(s1.size()); //iterate from the last
		iter2 = s2.listIterator(s2.size());
		while (iter.hasPrevious()) {
			a1 = a1+iter.previous();  // attach previous value
			a2 = a2+iter2.previous();
		}
		System.out.println("a1 =" + a1);
		System.out.println("a2 =" + a2);
		sum = Integer.parseInt(a1) + Integer.parseInt(a2);
		System.out.println("sum =" + sum);

	}
	
	 public static void normal(){
	      LinkedList s1 = new LinkedList();
	      LinkedList s2 = new LinkedList();
	      Iterator iter;
	      Iterator iter2;
	      int sum = 0;
	      String a1 = "" , a2 = "";
	      
	      s1.add(6);s1.add(1);s1.add(7);
	      s2.add(2);s2.add(9);s2.add(5);
	      System.out.println("s1 = "+s1);
	      System.out.println("s2 = "+s2);
	      
	      iter = s1.iterator();		//iterate from the first
	      iter2 = s2.iterator();
	      
	      while(iter.hasNext()){
	         a1 = a1 + iter.next();
	         a2 = a2 + iter2.next();
	      }
	      System.out.println("a1 ="+a1);
	      System.out.println("a2 ="+a2);
	      sum = Integer.parseInt(a1) + Integer.parseInt(a2);
	      System.out.println("sum ="+sum);
	      
	   }
}
