package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 
/**
 * 2751번 풀이 - 수 정렬하기2
 * 시간 복잡도가 O(nlogn)인 정렬 알고리즘으로 풀 수 있습니다.
 * 내장된 정렬 함수를 사용하시오.
 *
 * 5
 * 5
 * 4
 * 3
 * 2
 * 1
 *
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
**/
public class _2751 {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> nums = new ArrayList<>();
 
        for ( int i = 0; i < n; i++ ){
            nums.add(Integer.parseInt(br.readLine()));
        }
 
        Collections.sort(nums);
 
        for ( int value : nums){
            sb.append(value).append("\n");
        }
 
        System.out.println(sb);
 
    }
}