package ch5;

public class Solution07 {

	int swapBits(int n){
		
		return( ((n & 0xaaaaaaaa)>>> 1) | ((n&0x55555555)<<1));
	}
	
}
