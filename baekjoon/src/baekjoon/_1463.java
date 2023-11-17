package baekjoon;

import java.util.Scanner;

/**
 * 1로 만들기
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 *
 * X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * X가 2로 나누어 떨어지면, 2로 나눈다.
 * 1을 뺀다.
 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를**** 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 *
 * 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
 *
 * 2
 */
public class _1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n+1];
        dp[1] = 0;

        for(int i=2; i <=n; i++) {
            dp[i] = dp[i-1] +1; //1을 빼는 연산이 가장 작다고 가정한다.
            if(i%2==0) { //2로 나누어 떨어지는지 확인
                dp[i] = Math.min(dp[i], dp[i/2]+1); //현재 저장된 연산 과정과 2로 나누는 연산 중 연산 횟수가 더 작은걸 저장한다.
                //dp[2]=1 , dp[1]+1 = 0+1 = 1 dp[2] 는 결국 1
            }
            if(i%3==0) {
                dp[i] = Math.min(dp[i], dp[i/3]+1); //현재 저장된 연산 vs 3으로 나누는 연산 비교
            }
        }

        System.out.println(dp[n]);
    }
}