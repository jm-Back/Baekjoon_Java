package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9095 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int [] dp = new int[11];
 
        dp[3] = 4;
        dp[2] = 2;
        dp[1] = 1;
        for(int j=4; j<=10; j++){
            dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
        }
 
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }
		
	}

}
