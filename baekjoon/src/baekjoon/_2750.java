package baekjoon;

import java.util.Scanner;
 
/**
 * 2750번 : 수 정렬하기
 *  n개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *  첫째줄 : 수의 개수. 둘째줄 : n개의 수 !
 *
**/
public class _2750 {
 
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(System.in);
 
        int n  = sc.nextInt();
        int[] arr = new int[n];
 
        for ( int i = 0; i < n; i++ ){
            arr[i] = sc.nextInt();
        }
 
        /**
         * 0-1,2,3,4
         * 1-
         */
        int temp = 0;
        for ( int i = 0; i < arr.length; i++ ){
            for ( int j = i+1; j < arr.length; j++ ){
                if ( arr[i] > arr[j]){ //  5 vs 1
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; // 자리 바꾸기
                }
            }
        }
 
        for ( int i = 0; i < n; i++ ){
            System.out.println(arr[i]);
        }
 
        sc.close();
    }
}