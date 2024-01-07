package peakJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem1002 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int a= Integer.parseInt(br.readLine());
		
		for(int i = 0; i< a; i++) {
			int[] cirary = new int[6];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j< 6; j++) {
				cirary[j] = Integer.parseInt(st.nextToken());
			}
			
			
			double cr = Math.sqrt(Math.pow((cirary[3] - cirary[0]),2) + Math.pow((cirary[4]- cirary[1]), 2));
			
			if(cr == 0) {
				if(cirary[2] == cirary[5]) {
					System.out.println("-1");
				}else {
					System.out.println("0");
				}
			}else if(cr < Math.max(cirary[2], cirary[5])) {
				if(cr + Math.min(cirary[2] , cirary[5])<  Math.max(cirary[2], cirary[5])) {
					System.out.println("0");
				}else if(cr + Math.min(cirary[2] , cirary[5]) > Math.max(cirary[2], cirary[5])) {
					System.out.println("2");
				}else {
					System.out.println("1");
				}
				
			}else {
				if(cr > cirary[2]+ cirary[5]) {
					System.out.println("0");
				}else if(cr == cirary[2]+ cirary[5]) {
					System.out.println("1");
				}else {
					System.out.println("2");
				}
			}
		}
		br.close();
	}

}
