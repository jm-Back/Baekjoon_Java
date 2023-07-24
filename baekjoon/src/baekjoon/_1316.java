package baekjoon;

import java.util.Scanner;
 
/**
 * 1316번 풀이
 * 그룹 단어란 단어에 존재하는 모든 문자에 대하여, 각 문자가 연속으로 나타나는 경우만 말한다.
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,
 * kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 *
 * 첫째줄에는 단어의 개수 n이 들어온다.
 * 둘째줄부터 n개의 줄에 단어가 들어온다.
 * = 첫째줄에 그룹 단어의 개수를 출력한다.
 *
 */
public class _1316 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int group = 0;
 
        //알파벳 -> a는 97 , z 는 122
        //97해서 계산하기
        for ( int i = 0; i < n; i++ )
        {
            int [] arr = new int[26];
            int pre = -1; //이전값
 
            String s = sc.next();
 
            for ( int j = 0; j < s.length(); j++ )
            {
                int word = s.charAt(j) - 97;
                if ( pre != word ) {
                    pre = word;
                    arr[word] ++; //word 세팅.
                }
            }
 
            for ( int k = 0; k < arr.length; k++ )
            {
                //System.out.print(arr[k] + " ");
                if (arr[k] > 1) {
                    group++;
                    break;
                }
            }
            //System.out.println();
        }
 
        System.out.println(n - group);
 
        sc.close();
    }
}