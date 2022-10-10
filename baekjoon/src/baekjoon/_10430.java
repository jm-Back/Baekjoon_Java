package baekjoon;

import java.util.Scanner;

public class _10430 {

	public static void main(String[] args) {
		// 나머지
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int n1 = (a+b)%c;
		int n2 = ((a%c) + (b%c))%c;
		int n3 = (a*b)%c;
		int n4 = ((a%c)*(b%c))%c;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);

		sc.close();

	}

}
