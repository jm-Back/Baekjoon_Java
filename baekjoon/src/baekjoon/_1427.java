package baekjoon;

import java.util.*;
 
/**
 *
 * 1427번 풀이 - 소트인사이드
 * 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬하자.
 * * 내림차순으로 정렬한다.
 *
**/
public class _1427 {
 
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(System.in);
 
        String n = sc.next();
        Integer [] arr = new Integer[n.length()];
 
        for ( int i = 0; i < n.length(); i++ ){
            arr[i] = Integer.parseInt(String.valueOf(n.charAt(i)));
        }
 
        Arrays.sort(arr, Collections.reverseOrder());
 
        for ( Integer i : arr){
            System.out.print(i);
        }
 
        sc.close();
 
    }
}