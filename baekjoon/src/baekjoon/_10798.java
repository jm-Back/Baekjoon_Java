package baekjoon;

import java.io.IOException;
import java.util.Scanner;

/**
 * 세로읽기 
 * 알파벳, 숫자를 붙여 만든 행렬이 있다.
 * 5개의 단어들의 글자 수는 다를 수 있다. (행=5,열=바뀜)
 * 이렇게 만든 단어 5개를 세로로 읽는다. (위에서 아래로)
 * 만약, 세로로 읽을 때 해당 자리의 글자가 없으면 공백은 패스하고 다음 글자를 읽는다. 
 * 
 */
public class _10798 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		
		char [][] arr = new char[5][15];

		//5줄
		//글자수는 최소 1~최대 15개까지 
		for ( int i = 0; i < 5; i++ )
		{
			String s = sc.next();

			for ( int j = 0; j < s.length(); j++ )
			{
				arr[i][j] = s.charAt(j);
			}
		}
		
		//세로 읽기
		for ( int i = 0; i < arr[0].length; i++ )
		{
			for ( int j = 0; j < 5; j++ )
			{	
				if(arr[j][i] == '\0') continue;
				
				System.out.print(arr[j][i]);
			}
		}

		sc.close();
		
	}

}