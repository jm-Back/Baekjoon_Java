package baekjoon;

import java.util.Scanner;

public class _1330 {

	public static void main(String[] args) {
		// if문 비교
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a < b) {
			System.out.println("<");
		} else if(a > b) {
			System.out.println(">");
		} else {
			System.out.println("==");
		}
		
		
		sc.close();

	}

}
