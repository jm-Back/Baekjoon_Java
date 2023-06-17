package baekjoon;

import java.util.Scanner;
 
/**
 * 나머지
 * 첫째 줄부터 열번째 줄까지 한 줄에 숫자 하나가 주어진다.
 * 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다. 
 *
 */
public class _3052 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		int [] arr = new int[10];
		
		for ( int i = 0; i < arr.length; i++ )
		{
			arr[i] = sc.nextInt() % 42;
		}
		
		for ( int i = 0; i < arr.length; i++ )
		{
			int tmp = 0;
			for ( int j = i+1 ; j < arr.length; j++ )
			{
				if ( arr[i] == arr[j] ) 
				{
					tmp++;
				}
			}
			
			if ( tmp == 0 )
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		
		sc.close();
	}
}