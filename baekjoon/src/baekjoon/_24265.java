package baekjoon;

import java.util.Scanner;

/**
 * 24265번
 * 입력의 크기 n이 주어지면 다음 알고리즘의 수행 시간을 예제와 같이 출력해보자.
 * MenOfPassion(A[], n) {
 *     sum <- 0;
 *     for i <- 1 to n - 1
 *         for j <- i + 1 to n
 *             sum <- sum + A[i] × A[j]; # 코드1
 *     return sum;
 * }
 */
public class _24265 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        //이중 for 문 이지만, 범위가 1 ~ n-1 / i+1 ~ n 이네.
        // (1, (2,3,4,5,6,7)) (2, (3,4,5,6,7)) (3, (4,5,6,7)) (4, (5,6,7)) (5, (6,7)) (6, (7))
        // 일단 최고차항은 2이다. (이중 for문)
        // 6+5+4+3+2+1
        //  11 15 18

        System.out.println((n * (n - 1)) / 2);
        System.out.println('2');

        sc.close();
    }
}