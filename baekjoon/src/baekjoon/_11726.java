package baekjoon;

import java.util.Scanner;

/**
 * 2xn 타일링
 *
 * 2*n 크기의 직사각형을 1*2, 2*1 타일로 채우는 방법의 수를 구하시오.
 * 첫째줄에 n이 주어진다.
 * 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 *
 * 2 - > 2
 * 9 -> 55
 *
 * if n=3,
 * n=1 일 때, 1개
 * n=2 일 때, 2개
 * n=3 일 때,
 *
 */
public class _11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        // 위에서 올라가며 푸는 Bottom-Up 문제.
        // 1*2, 2*1 로 채운 결과를 dp 테이블에 저장한다.
        //2는 고정, n ...
        // 1) 1*2 로 모두 채우는 방법,
        int[] dp = new int[1001];
 
        //초기화!
        dp[2] = 2;
        dp[1] = 1; //1개 뿐.
        for(int i=3; i<=n; i++){
            //dp-1 과 dp-2 값을 합친것이 dp[i] 값!
            dp[i] = (dp[i-2] + dp[i-1]) % 10007;
            //System.out.println("dp[i] 는 " + "i값="+i + " , " + "결과는 = " + dp[i]);
        }
 
        System.out.println(dp[n]);
 
        sc.close();
    }
}