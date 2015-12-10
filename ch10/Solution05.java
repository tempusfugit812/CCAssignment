//refer from Cracking the coding interview
public class Solution05 {

	int findWord(String[] strs, String str, int s, int e){
		if(s>e) return -1;
		int mid = (s+e)/2;
		
		if(strs[mid].isEmpty()){
			
			int l = mid-1;
			int r = mid+1;
			
			while(true){
				if(l < s && r > e){
					
					return -1;
				}else if(r <= e && !strs[r].isEmpty()){
					mid = r;
					break;
				}else if (l >= s && !strs[l].isEmpty()){
					
					mid = l;
					break;
				}
				r++;
				l--;
				
			}
			
		}
		if(str.equals(strs[mid])){
			return mid;
			
		}else if(strs[mid].compareTo(str)<0){
			return findWord(strs, str, mid+1, e);
			
		}else {
			return findWord(strs, str, s, mid-1);
		}
		
		
		
	}
	
	int findWord(String[] strs, String str){
		if(strs == null || str ==null || str == ""){
			
			return -1;
		}
		return findWord(strs, str, 0, strs.length-1);
		
	}
	
}
