package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
/**
 * 2231번 - 어떤 자연수 n이 있을 때, 그 자연수 n의 분해합은
 * n과 n을 이루는 각 자리수의 합이다.
 * m의 분해합이 n인 경우, m을 n의 생성자라 한다.
 *
 * 245의 분해합은 256(=245+2+4+5)가 된다.
 * 따라서 245는 256의 생성자가 된다.
 * 자연수 n이 주어졌을 때, n의 가장 작은 생성자를 구해라.
 *
 * @author Back
 *
 */
public class _2231 {
 
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        for(int i=1; i<=n; i++) {
            String temp = Integer.toString(i); //1씩 늘려서 체크하기 .
            int sum = 0;
 
            for(int j=0; j<temp.length(); j++) {
                sum += Character.getNumericValue(temp.charAt(j));
            }
            sum += Integer.parseInt(temp); //자기자신 더하기.
 
            if(sum == n) {
                System.out.println(temp);
                break;
            }
            else if(i==n) {
                System.out.println(0);
            }
        }
        sc.close();
    }
}