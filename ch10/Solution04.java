//refer from Cracking the coding interview

import java.util.ArrayList;

public class Solution04 {
	int findIndex(Listy listy, int value) {
		int indexCheck = 1;

		while (listy.elementAt(indexCheck) != -1
				&& listy.elementAt(indexCheck) < value) {

			indexCheck = indexCheck * 2;
		}
		return search(listy, value, indexCheck / 2, indexCheck);
	}

	public int search(Listy listy, int value, int low, int high) {
		

		
		while(low <= high){
			int mid = (low+high)/2;
			int midData = listy.elementAt(mid);
			if(midData==-1 || value <midData ){
				high = mid-1;
			}else if(midData < value){
				low = mid+1;
			}else{
				return mid;
			}
			
		}
		return -1;
	}
}
