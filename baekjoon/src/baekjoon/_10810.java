package baekjoon;

import java.util.Scanner;

/**
 * 공 넣기
 * 첫째 줄에 N과 M이 주어진다.
 * m번의 공을 넣을 것이다. 
 * 둘째 줄부터는 m개의 줄에 걸쳐서 공을 넣는 방법이 주어진다. 
 * 각 방법은 세 정수 i j k 로 이뤄져있다. 
 * i번 바구니부터 j번 바구니까지에 k번 번호가 적혀있는 공을 넣는다는 뜻이다.
 * 2 5 6 은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다. 
 * 
 * 
 */
public class _10810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //1~부터 바구니 개수
		int m = sc.nextInt(); //순서
		
		int[] arr = new int[n]; //바구니
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		for ( int z = 0; z < m; z++ )
		{
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
			
			for ( int q = i; q <= j; q++ )
			{
				arr[q-1] = k;
			}
		}
		
		for ( int z = 0; z < n; z++ )
		{
			System.out.print(arr[z] + " ");
		}
		
		sc.close();
	}

}
