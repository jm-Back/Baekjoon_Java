package baekjoon;

import java.util.Scanner;

/**
 * 알고리즘 수업 - 알고리즘의 수행시간 2
 * 24263번 풀이 
 * 입력 크기 n이 주어지면 해당 알고리즘 수행 시간을 출력하시오.
 *  MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        sum <- sum + A[i]; # 코드1
    return sum;
}
 *
 */
public class _24263 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		//for 문의 반복 횟수 만큼, 그러나 최고차항은 1
		System.out.println(n);
		System.out.println(1);
		
		
		sc.close();

	}

}
