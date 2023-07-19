package baekjoon;

import java.util.Scanner;

/**
 * 24267번
 * 입력의 크기 n이 주어지면 다음 알고리즘의 수행 시간을 예제와 같이 출력해보자.
 * MenOfPassion(A[], n) {
 *     sum <- 0;
 *     for i <- 1 to n - 2
 *         for j <- i + 1 to n - 1
 *             for k <- j + 1 to n
 *                 sum <- sum + A[i] × A[j] × A[k]; # 코드1
 *     return sum;
 * }
 */
public class _24267 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        long n = sc.nextLong();
 
        //삼중 FOR 문의 수행 횟수들을 모두 곱하고,
        //이차항이니까 /2 해주고 삼차항이니까 /3 해줬다.
        //이렇게 풀어보니 정답 나와버림...ㅇㅅㅇ
        System.out.println(((n-2) * (((n-1) * n)/2))/3);
        System.out.println('3');
 
        sc.close();
    }
}