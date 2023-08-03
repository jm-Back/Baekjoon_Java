package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
 
/**
 * 2587번 풀이 - 대표값2
 * 중앙값은 주어진 수를 크기 순서대로 늘어 놓았을 때 가장 중앙에 놓인 값이다.
 * 다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오.
 * 한 줄에 하나씩 자연수가 주어진다.
 * 1. 평균 출력 2. 중앙값 출력
 *
**/
public class _2587 {
 
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(System.in);
 
        int [] arr = new int[5];
 
        int sum = 0;
        for ( int i = 0; i < arr.length; i++ ){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
 
        Arrays.sort(arr);
 
        System.out.println(sum/5);
        System.out.println(arr[2]);
 
        sc.close();
    }
}