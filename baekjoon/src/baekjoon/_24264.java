package baekjoon;

import java.util.Scanner;

/**
 * 알고리즘 수업 - 알고리즘의 수행시간 3
 * 24263번 풀이 
 * 입력 크기 n이 주어지면 해당 알고리즘 수행 시간을 출력하시오.
 *  MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        for j <- 1 to n
            sum <- sum + A[i] × A[j]; # 코드1
    return sum;
}
 *
 */
public class _24264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		//이중 for 문은 제곱, 최고차항인 제곱은 2
		System.out.println(n*n);
		System.out.println(2);
		
		
		sc.close();

	}

}
