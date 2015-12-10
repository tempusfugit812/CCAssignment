//refer from Cracking the coding interview

package ch3;

import java.util.LinkedList;

public class Solution06 {
	abstract class Species {

		private int order;
		protected String name;

		public Species(String n) {
			name = n;
		}

		public void setOrder(int ord) {
			order = ord;
		}

		public int getOrder() {
			return order;
		}

		public boolean isOlderThan(Species s) {
			return this.order < s.getOrder();
		}

	}

	public class Dog extends Species {
		public Dog(String n) {
			super(n);
		}
	}

	public class Cat extends Species {
		public Cat(String n) {
			super(n);
		}
	}

	class AnimalQ {
		LinkedList<Dog> dog = new LinkedList<Dog>();
		LinkedList<Cat> cat = new LinkedList<Cat>();
		private int order = 0;

		public void enQ(Species t){
			t.setOrder(order);
			order++;
		if (t instanceof Dog){
			dog.addLast((Dog) t);		
		
		}else if (t instanceof Cat){
			cat.add((Cat) t);
		}
			
		}
		public Species deQ(){
			if(dog.size()==0){
				return deQCat();
			}else if(cat.size()==0){
				return deQDog();
			}
			
			Dog dogs = dog.peek();
			Cat cats = cat.peek();
			
			if(dogs.isOlderThan(cats)){
				return deQDog();
			}else{
				return deQCat();
			}
		}
		public Dog deQDog(){
			return dog.poll();
			
		}
		public Cat deQCat(){
			return cat.poll();
			
		}
	}

}
