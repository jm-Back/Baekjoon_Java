package baekjoon;

import java.util.Scanner;

public class _25304 {

	/**
	 * 영수증
	 * 첫째 줄에는 영수증 총 금액 X 
	 * 둘째 줄에는 구매한 물건의 종류의 수 N
	 * 이후 N개의 줄에는 각 물건의 가격(a)와 개수(b)가 공백을 사이에 두고 주어진다. 
	 * 가격과 개수로 계산한 총 금액이 영수증 총액과 일치하면 yes, 틀리면 no가 출력된다. 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		int a = 0;
		int b = 0;
		
		int sum = 0;
		
		for (int i = 0; i < n; i ++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			
			sum += (a * b);
		}
		
		if ( sum == x )
		{
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();

	}

}
