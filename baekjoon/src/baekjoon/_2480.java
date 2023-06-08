package baekjoon;

import java.util.Scanner;

public class _2480 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int money = 0;
		int tmp = 0;
		

		//같은 눈 3개 
		if (n1 == n2 && n2 == n3)
		{
			money = 10000 + n1 * 1000;
		}
		//같은 눈 2개 
		else if (n1 == n2 || n2 == n3 || n3 == n1)
		{
			if (n1 == n2)
			{
				money = 1000 + n1 * 100;
			}
			else if (n2 == n3)
			{
				money = 1000 + n2 * 100;
			}
			else if (n3 == n1)
			{
				money = 1000 + n3 * 100;
			}
		}
		//모두 다름
		else
		{
			if ( n2 > n1 )
			{
				tmp = n1;
				n1 = n2;
				n2 = tmp;
			}
			if ( n3 > n2 )
			{
				tmp = n2;
				n2 = n3;
				n3 = tmp;
			}
			if ( n3 > n1 )
			{
				tmp = n1;
				n1 = n3;
				n3 = n1;
			}
			
			if ( n2 > n1 )
			{
				tmp = n1;
				n1 = n2;
				n2 = tmp;
			}
			
			money = n1 * 100; //제일 큰 값 
		}

		System.out.println(money);
			
		sc.close();

	}

}
