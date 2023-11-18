package baekjoon;

import java.util.Scanner;

/**
 * 2xn 타일링 2
 *
 * 2*n 크기의 직사각형을 1*2, 2*1, 2*2 타일로 채우는 방법의 수를 구하시오.
 * 첫째줄에 n이 주어진다.
 * 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 */
public class _11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] dp = new int[1001];
 
        //초기화!
        dp[2] = 3;
        dp[1] = 1;
 
        //짝수는 이전 dp[i-1]*2 + 1 / 홀수는 이전 dp[i-1]*2 - 1
        for(int i=3; i<=n; i++){
            if(i%2==0){
                dp[i] = (dp[i-1]*2 +1) % 10007;
            } else if(i%2==1) {
                dp[i] = (dp[i-1]*2 -1) % 10007;
            }
        }
 
        System.out.println(dp[n]);
 
        sc.close();
    }
}