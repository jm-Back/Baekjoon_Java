package baekjoon;

import java.util.Scanner;

public class _2588 {

	public static void main(String[] args) {
		// 곱셈
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		String n2 = sc.next();
		String[] num = n2.split("");
		
		int num1 = Integer.parseInt(num[2]);
		int num2 = Integer.parseInt(num[1]);
		int num3 = Integer.parseInt(num[0]);
		
		int s1 = n1 * num1;
		int s2 = n1 * num2;
		int s3 = n1 * num3;
		
		int total = s1 + (s2*10) + (s3*100);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(total);
		
		sc.close();

	}

}
