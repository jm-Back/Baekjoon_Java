package baekjoon;

import java.util.Scanner;

public class _9498 {

	public static void main(String[] args) {
		// 사면체
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();

		if(x > 0 && y > 0) {
			System.out.println(1);
		} else if(x > 0 && y < 0) {
			System.out.println(4);
		} else if(x < 0 && y < 0) {
			System.out.println(3);
		} else {
			System.out.println(2);
		}
			
		sc.close();

	}

}
