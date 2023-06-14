package baekjoon;

import java.util.Scanner;

/**
 * 공 바꾸기
 * 앞서 10810번 문제와 동일하다. 
 * 첫째 줄에 바구니 N개(1~N번 번호가 있다.), M이 주어진다.
 * 바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적힌 번호와 같은 번호가 적힌 공이 들어있다. 
 * (2번 바구니 안에 2번 공)
 * 앞으로 M번의 공을 바꿀 것이다. 
 * 공을 바꿀 바구니 2개를 선택하고 두 바구니에 든 공을 서로 교환할 것이다.
 * 
 */
public class _10813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //바구니 개수이자 바구니 번호
		int m = sc.nextInt(); //순서
		
		int[] arr = new int[n]; //바구니
		
		for ( int x = 0; x < n; x++ )
		{
			arr[x] = x+1;
		}
		
		int i = 0;
		int j = 0;
		int tmp = 0;
		
		for ( int change = 0; change < m; change++ )
		{
			i = sc.nextInt(); //1
			j = sc.nextInt(); //2
			
			tmp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = tmp;
		}
		
		for ( int z = 0; z < n ; z++ )
		{
			System.out.print(arr[z] + " ");
		}
		
		
		sc.close();
	}

}
