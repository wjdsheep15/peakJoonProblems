package peakJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1436 {

	public static void main(String[] args) throws IOException {

		/**
		 * 1. 666부터 1씩 증가시켜서 666이 겹쳐서 나오는 숫자를 카운트
		 * 2. String.valueOf(변수명) 문자열로 비교
		 * 3. 문자열.contains("문자") => boolean문으로 문자가 문자열에 있는지 확인
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int inputnum = Integer.parseInt(br.readLine());
		int endnum = 666;
		int count = 1;
		while (inputnum != count) {
			endnum++;
			if (String.valueOf(endnum).contains("666")) {
				count++;
			}
		}
		System.out.println(endnum);
		br.close();
	}

}
