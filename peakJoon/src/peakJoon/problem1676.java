package peakJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1676 {

	
	public static void main(String[] args) throws IOException {
		
		long beforeTime = System.currentTimeMillis();
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
	
		int num5 = n/5;
		int num25 = n/25;
		int num125 = n/125;
		
		System.out.println(num5 + num25 + num125);
		
		long afterTime = System.currentTimeMillis();
		long secDiffTime = (afterTime - beforeTime)/1000;
		System.out.println(secDiffTime);
	}

	
}
