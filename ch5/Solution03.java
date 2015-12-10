package ch5;

public class Solution03 {
int seqLen = 32;
int longestSeq(int n){
	int max=0;
	
	for(int i=0; i<seqLen; i++){
		max =  Math.max(max, longestSeq1(n,i));
	}
	return max;
}
 boolean getBit(int n, int i){
	 return ((n&(1<<i))!=0);
 }

 int longestSeq1(int n, int skipIndex){
	int max = 0;
	int cnt = 0;
	for(int i = 0; i < seqLen; i++){
		if(i == skipIndex || getBit(n,i)){
			cnt++;
			max = Math.max(cnt,  max);
		}else{
			cnt=0;
		}
	}
	 
	 
	 
	 
	 
	 return max;
 }

}
