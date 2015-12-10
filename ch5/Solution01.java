//refer from Cracking the coding interview

package ch5;

public class Solution01 {

	int insertBit(int m, int n, int i, int j){
		int ones = ~0; //all ones
		int left = ones << (j+1); // left = 11100000
		int right = ((1 << i)-1); //right = 00000011
		int mask = left|right; //mask = 11100011
		int n_clear = n&mask; //set bits empty from j to i
		int m_insert = m << i; // insert m into between i and j
		
		return n_clear | m_insert;
	}
	
	
	
	
}
