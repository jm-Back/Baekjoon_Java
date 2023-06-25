package baekjoon;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * 다이얼
 * 오래된 다이얼 전화기가 있다.
 * 숫자를 누르고 돌려야한다. 
 * 숫자를 누른 뒤에는 다시 처음으로 돌아가며, 숫자 1을 걸려면 총 2초가 필요하다. 
 * 한 칸 옆에 있는 숫자를 걸기 위해서는 1초씩 더 걸린다.
 * 할머니는 전화번호를 각 숫자에 해당하는 문자로 외운다.
 * 할머니가 외운 단어가 주어졌을 때, 전화를 걸기 위해 필요한 최소 시간을 구하시오.
 */
public class _5622 {
	
	public static void main(String args[]) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		
		n = n.toUpperCase();
		
		int sum = 0;
		
		for ( int i = 0; i < n.length(); i++ )
		{
			char num = n.charAt(i);

			if ( num == 83 || num == 90 || num == 86 || num == 89 )
			{
				sum += (num-65)/3 + 2;
			}
			else
			{
				sum += (num-65)/3 + 3;
			}
			
		}

		System.out.println(sum);
		
		sc.close();
	}
}