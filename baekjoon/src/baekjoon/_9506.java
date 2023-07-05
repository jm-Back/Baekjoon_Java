package baekjoon;

import java.util.Scanner;

/**
 * 약수들의 합
 * 9506번 
 * 어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같다면, 그것은 완전수라 부른다.
 * n이 완전수인지 체크하는 프로그램을 작성하라. 
 * 1. 한 줄 간격으로 n이 주어진다. 
 * 입력 마지막은 -1이 주어진다. 
 * n이 완전수라면, n이 아닌 약수들의 합으로 나타내어 출력한다. 
 * (약수들은 오름차순으로 합해야한다.)
 * n이 완전수가 아니라면 "n is NOT perfect." 을 출력한다. 
 * 
 */
public class _9506 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int sum = 0;
			int n = sc.nextInt();
			
			if ( n == -1 ) break; //끝내기
 
			
			//-1이 아니면 for문 
			for ( int i = 1; i < n; i++ )
			{
				if ( n % i == 0 )
				{
					sum += i;
				}
			}
			
			if ( sum == n )
			{
				System.out.print(n);
				for ( int i = 1; i < n; i++ )
				{
					if ( n % i == 0 && i == 1 )
					{
						System.out.print(" = " + i);
					}
					else if ( n % i == 0 )
					{
						System.out.print(" + " + i);
					}
				}
				System.out.println();
			}
			else
			{
				System.out.println(n + " is NOT perfect.");
			}
			
		}
 
		sc.close();
	}
}