//refer from Cracking the coding interview

import java.io.FileReader;
import java.util.Scanner;


public class Solution07 {

	
long numInt = ((long) Integer.MAX_VALUE)+1;
byte[] bytes = new byte[(int)(numInt / 8)];

void findInt() throws FileNotFoundException{
	
	Scanner sc = new Scanner (new FileReader(file.txt));
	
	while(sc.hasNextInt()){
		int i = sc.nextInt();
		bytes[i/8] |= 1 << (i%8);
	}
	
	for (int j = 0; j <bytes.length; j++){
		for(int k = 0; k < 8; k++){
			if ((bytes[j] & (1 << k)) == 0){
				
				System.out.println(j*8+k);
				return;
			}
		}
	}
}

	
	
}
