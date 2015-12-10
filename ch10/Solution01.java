//refer from Cracking the coding interview
public class Solution01 {
	public static void sortedMerge(int big[], int small[], int bLast, int sLast){
		int bi = bLast - 1;
		int si = sLast - 1;
		int merged = bLast + sLast -1;
		
		while(si >=0){
			if(bi >= 0&&big[bi]>small[si]){
				
				big[merged] = big[bi];
				bi--;
			}else{
				big[merged] = small[si];
				si--;
			}
				merged--;
			
			}
			
			
			
			
		}
		
	public static void main(String[] args){
		
		int bigArr[] = {1,2,4,5,7,8,10,11, 0, 0, 0, 0};
		int smallArr[] = {3,6,9};
		int bigLast = 8;
		int smallLast = 3;
		
		sortedMerge(bigArr, smallArr, bigLast, smallLast);
		for(int i=0;i<12; ++i)
		{
			System.out.print(bigArr[i]+",");
		}
		
		
	}	
	
	
	
	}

