package baekjoon;

import java.util.Scanner;

public class _2884 {

	public static void main(String[] args) {
		// 알람시계
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();

		m = m - 45;
		if(m < 0) {
			m = m + 60;
			h = h - 1;
			if(h < 0) {
				h = 23;
			}
		}
		
		System.out.print(h + " " + m);
			
		sc.close();

	}

}
