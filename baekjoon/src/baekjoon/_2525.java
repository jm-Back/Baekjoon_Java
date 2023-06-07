package baekjoon;

import java.util.Scanner;

public class _2525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int need = sc.nextInt();
		
		int min = m + need;
		
		if ( min > 59 ) 
		{
			h += (min / 60); //시간 
			
			if ( h > 23 )
			{
				h = ( h % 24 );
			}

			min = (min % 60); //나머지 
		}

		System.out.println(h + " " + min);
			
		sc.close();

	}

}
