//refer from Cracking the coding interview
public class Solution08 {
	
	void dupCheck(int[] arr){
		BitSet bs = new BitSet(32768);
		
		for(int i=0;i<arr.length;i++){
			
			int num1 = arr[i];
			int num2 = num1-1;
			if(bs.get(num2)){
				System.out.println(num1);
			}else{
				bs.set(num1);
			}
		}
	}
	
	class BitSet{
		int[] bitset;
		
		public BitSet(int size){
			bitset = new int[(size >> 5)+1];
		}
		boolean get(int pos){
			int wordNum = (pos >>5);
			int bitNum = (pos &0x1F);
			return (bitset[wordNum] & (1 << bitNum)) != 0;
			
		}
		void set(int pos){
			int wordNum = (pos>>5);
			int bitNum = (pos & 0x1F);
			bitset[wordNum] |= 1 << bitNum;
		}
	}
	
}
