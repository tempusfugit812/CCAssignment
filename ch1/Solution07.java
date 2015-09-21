//Base Rule
// 1. rotated matrix must be the same size
// 2. print original matrix
// 3. rotate
// 4. print rotated matrix


package answer;

public class HW1_1_7 {
	
	
	public static void main(String[] args){
		
		rotateMatrix();	//call the method
		
		
	}
	public static void rotateMatrix(){
		int[][] original ={ {0,1,2,3},{4,5,6,7},{8,9,8,7},{6,5,4,3} }; //input data for the matrix to be roated
		int[][] rotated = new int[4][4];	//empty matrix with the same size of the original one
		int cnt =0;
		int cnt2 = 0;
		int i,j= 0;
		
		for(i=0; i<4; i++){			//loop i and j to set the index for each data
			for(j=0; j<4; j++){
				System.out.print(original[i][j]+","); // '0' stored in [0][0], '4' stored in [1][0], '8' in[2][0] ....
			}
			System.out.println();
		}
		System.out.println();
		for(j=0; j<4; j++){
			cnt2 = 0; //j of original stored in cnt2
			for(i=3;i>=0;i--){ //start loop from backward
				rotated[cnt][cnt2] = original[i][cnt];    //during first loop, cnt =0, cnt2 = 0,1,2,3  [0][3] = 6, [0][2] = 8 ...
				System.out.print(rotated[cnt][cnt2]+",");
				cnt2++; 
			}
			System.out.println();
			cnt++; //increase cnt after fill out the first row
		}
	}
}
