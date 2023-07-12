package baekjoon;

import java.util.Scanner;

/**
 * 삼각형 외우기
 * 10101번
 *
 *삼각형을 잘 구분하지 못하는 창영이는 삼각형의 세 각을 입력받아 이를 외우려고 한다. 
 *
 */
public class _10101 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a + b + c != 180) 
		{
            System.out.print("Error");
        } 
		else 
		{
            if (a == 60 && b == 60 && c == 60) {
                System.out.print("Equilateral");
            } else if (a == b || b == c || c == a) {
                System.out.print("Isosceles");
            } else {
                System.out.print("Scalene");
            }
        }
		
		sc.close();

	}

}
