package baekjoon;

import java.util.Scanner;
 
/**
 * 바구니 뒤집기
 * 바구니 총 n개를 가지고 있고 각각 1번~n번의 숫자가 적혀있다.
 * 도현이는 m번 바구니의 순서를 역순으로 만들려고 한다. 
 * 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 바구니 순서를 역순으로 만든다.
 * 첫째 줄에는 n,m이 주어진다.
 * 둘째 줄부터는 m개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다. (i,j)
 * 
 */
public class _10811 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		
		for (int i = 0; i < arr.length; i++ ) 
		{ 
			arr[i] = i + 1;
		}

		int tmp = 0;
		
		int m = sc.nextInt();
		for ( int num = 0; num < m; num++ )
		{
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			
			while (i < j)
			{
				tmp = arr[i];
				arr[i++] = arr[j];
				arr[j--] = tmp;
			}
		}
		
		for ( int q = 0; q < arr.length; q++ )
		{
			System.out.print(arr[q] + " ");
		}

		sc.close();
	}
}