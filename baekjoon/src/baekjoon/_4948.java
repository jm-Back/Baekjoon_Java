package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _4948 {
	
	public static void main(String[] args) throws Exception {
		 
        //입력은 여러 개의 테스트 케이스로 이루어져 있다.
        //입력의 마지막은 0이다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        while(true){
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
 
            //n < target <= 2n
            int[] arr = new int[(2*n) + 1];
            int count = 0;
 
            for ( int i = 2; i <= 2*n; i++ ) {
                arr[i] = i;
            }
 
            for ( int i = 2; i <= Math.sqrt(2*n); i++ ){
                if (arr[i] == 0) {continue;}
 
                //특정 수 배수 지우기.
                for ( int j = i + i; j <= 2*n; j+= i ){
                    arr[j] = 0;
                }
            }
 
            for (int i = n+1; i <= 2*n; i++) {
                if (arr[i] != 0) {
                    //System.out.println(arr[i]);
                    count++;
                }
            }
 
            System.out.println(count);
 
        }
    }

}
