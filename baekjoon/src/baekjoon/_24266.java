package baekjoon;

import java.util.Scanner;

/**
 * 24266번
 * 입력의 크기 n이 주어지면 다음 알고리즘의 수행 시간을 예제와 같이 출력해보자.
 * MenOfPassion(A[], n) {
 *     sum <- 0;
 *     for i <- 1 to n
 *         for j <- 1 to n
 *             for k <- 1 to n
 *                 sum <- sum + A[i] × A[j] × A[k]; # 코드1
 *     return sum;
 * }
 */
public class _24266 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        long n = sc.nextLong();
 
        //이중 for 문이 아닌 삼중 for 문이다.
        //그렇다면 최고차항은 3일 것이다.
        //삼중 for 문의 수행 횟수 = n * n * n
        System.out.println(n * n * n);
        System.out.println('3');
 
        sc.close();
    }
}