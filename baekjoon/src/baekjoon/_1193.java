package baekjoon;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * 1193번 풀이
 * 이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 */
public class _1193 {
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        int x = sc.nextInt();
 
        int max_count = 1;
        int line = 1;
 
        //일단 x가 몇 번째 줄에 들어가는지 체크하기.
        for ( int i = 2; i <= x; i++ ){
            if ( x > max_count ){
                max_count += i;
                line++;
            }
        }
 
        x = max_count - x;
        int left = 0;
        int right = 0;
 
        if ( line % 2 == 0 ){
            left = line - x;
            right = (line+1) - left;
        }
        else {
            right = line - x;
            left = (line+1) - right;
        }
 
        System.out.println(left + "/" + right);
 
    }
}