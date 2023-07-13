package baekjoon;

import java.util.Scanner;

/**
 * 
 * 삼각형과 세 변
 * 5073번 풀이 
 * 
 * 세 변의 길이를 가지고 어떤 삼각형인지 정의하는 프로그램을 만든다.
 * 각 줄에는 1000을 넘지 않는 양의 정수 3개가 입력되며, 
 * 마지막 줄은 0 0 0 이며 이 줄은 계산하지 않는다. 
 * 
 */
public class _5073 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			//0이면 탈출
			if ( a == 0 && b == 0 && c == 0 ) break;
			
			
			if(a == b && b == c && c == a ){
			    System.out.println("Equilateral");  
				
		    }
		    else if(a >= b+c || b >= c + a || c >= a + b){
		      System.out.println("Invalid");  
		      
		    }
		    else if(a == b || b == c || c == a){
		      System.out.println("Isosceles");  
		      
		    }
		    else if(a != b && b != c && c != a){
		      System.out.println("Scalene");  
		      
		    }
			
			
		}

		sc.close();

	}

}
