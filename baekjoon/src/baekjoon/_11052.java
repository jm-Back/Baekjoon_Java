package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //횟수

        int [] p = new int[1001];
        int [] dp = new int[1001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            p[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++) {
            	dp[i] = Math.max(dp[i], dp[i-j] + p[j]);
            }
        }

        System.out.println(dp[n]);

    }
}