package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
/**
 * 카드 구매하기 2
 * 이번에는 돈을 최소로!! 지불해서 카드 n개를 구매한다.
 */
public class _16194 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int n = Integer.parseInt(br.readLine());
        int [] p = new int[1001];
        int [] dp = new int[1001];
 
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        for(int i=1; i<=n; i++){
            p[i] = Integer.parseInt(st.nextToken());
        }
 
        for(int i=1; i<=n; i++){
            dp[i] = p[i];
            for(int j=1; j<=i; j++){
                dp[i] = Math.min(dp[i], dp[i-j]+p[j]);
            }
        }
 
        System.out.println(dp[n]);
    }
}