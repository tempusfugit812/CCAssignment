//Base Rule
//1. find zero in matrix
//2. check the row and column that contains zero
//3. fill entire row and column with zero 

package answer;

public class HW1_1_8 {
	
public static void main(String[] args){
		
		makeZero();
		
		
	}
	
	public static void makeZero(){
		int[][] original ={ {2,1,2,0},{4,1,6,7},{8,9,1,7},{6,5,4,3} };//input matrix
		int i,j= 0;
		int[] row = new int[16],col=new int[16]; //each 16 data point for both row and column
		int cnt = 0;
		
		for(i=0; i<4; i++){				//loop for searching
			for(j=0; j<4; j++){
				if(original[i][j] == 0){		//if 0 exists
					row[cnt] = i;		// count each index for zero in both row and column
					col[cnt] = j;
					cnt++;			
				}
				System.out.print(original[i][j]+","); //print the original matrix
			}
			System.out.println();	
		}
		System.out.println();
		
		for(i=0;i<cnt; i++){		//loop for the number of zero founded
			for(j=0; j<4; j++){
				original[row[i]][j] = 0;	//change data in the row where zero was/were founded
				original[j][col[i]] = 0;	//change data in the column where zero was/were founded
			}
		}
		
		for(i=0; i<4; i++){
			for(j=0; j<4; j++){			//print out changed matrix
				System.out.print(original[i][j]+",");
			}
			System.out.println();	
		}
		
	}
}
