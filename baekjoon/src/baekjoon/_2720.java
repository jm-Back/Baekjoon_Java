package baekjoon;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * 세탁소 사장 동혁
 * 거스름돈 액수가 주어지면, 리암이가 줘야할 쿼터 개수, 다임 개수, 니켈 개수, 페니 개수를 구해야한다.
 * 거스름돈은 항상 5.00 달러 이하이며, 동전 개수는 최소로 하려고 한다.
 * 
 */
public class _2720 {
	
	public static void main(String args[]) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스
		int test = sc.nextInt();
		
		//쿼터 = 25, 다임 = 10, 니켈 = 5, 페니 = 1
		
		for ( int i = 0; i < test; i++ )
		{
			int money = sc.nextInt(); //센트 
			
			int q = money/25;
			int d = (money%25)/10;
			int n = ((money%25)%10)/5;
			int p = (((money%25)%10)%5)/1;
			
			System.out.println(q + " " + d + " " + n + " " + p);
		}

		sc.close();
	}
}