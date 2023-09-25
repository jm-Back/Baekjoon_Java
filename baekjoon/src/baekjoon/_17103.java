package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 * 골드바흐 파티션
 */
public class _17103 {
 
    static int[] primeArr = new int[1000001];
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
 
        makingPrimeArr();
 
        for ( int i = 0; i < testCase; i++ ){
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            int count = 0;
 
            for ( int j = 2; j <= n/2; j++ ){
                //j 와 n-j가 소수이면서, j+(n-j) 가 n이 되는 경우의 수 . 
                if ( primeArr[j] != 0 && primeArr[n-j] != 0 ) count++;
            }
            System.out.println(count);
        }
    }
 
    public static void makingPrimeArr(){
        for ( int i = 0; i <= 1000000; i++ ) {
            primeArr[i] = i;
        }
 
        //소수 배열 만들기. 배수 지우기
        for ( int i = 2; i < Math.sqrt(1000000); i++ ){
            if ( primeArr[i] == 0 ) continue;
 
            for ( int j = i + i; j <= 1000000; j+= i ){
                primeArr[j] = 0;
            }
        }
    }
 
 
}
