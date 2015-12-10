package ch5;

public class Solution06 {
public static int bitSwap(int b1, int b2){
	int cnt = 0;
	for(int i=b1^b2; i!=0; i=i&(i-1)){
		
		
		cnt += i&1;
	}
	return cnt;
}
}
