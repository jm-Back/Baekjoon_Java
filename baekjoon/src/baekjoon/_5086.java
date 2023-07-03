package baekjoon;

import java.util.Scanner;

/**
 * 배수와 약수
 * 두 수가 주어졌을 때, 3가지 중에 어떤 관계인지 구하시오.
 * 1. 첫번째 숫자가 두번째 숫자의 약수다. = factor
 * 2. 첫번째 숫자가 두번째 숫자의 배수이다. = multiple
 * 3. 첫번째 숫자가 두번째 숫자의 약수와 배수 모두 아.니.다. all = neither
 * 여러 테스트 케이스를 입력 받는다. 
 * 마지막 줄에는 0이 2개 주어진다. 두 수는 절대 같지 않다. 
 * 
 * 
 */
public class _5086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for ( int i = 0; i < 10000; i++ )
		{
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			if ( n1 == 0 && n2 == 0 )
			{
				break;
				//for 문 탈출
			}
			
			int factor = n2 % n1;
			int multiple = n1 % n2;
			
			if ( factor == 0 )
			{
				System.out.println("factor");
			}
			else if ( multiple == 0 )
			{
				System.out.println("multiple");
			}
			else
			{
				System.out.println("neither");
			}
		}
		
		
		sc.close();
	}

}
