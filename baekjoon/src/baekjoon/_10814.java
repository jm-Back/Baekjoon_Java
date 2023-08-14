package baekjoon;

import java.util.*;
import static java.lang.String.valueOf;
 
/**
 * 10814번 풀이 - 나이순 정렬
 * 온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.
 * 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 오도록 정렬하라.
 * 3
 * 21 Junkyu
 * 21 Dohyun
 * 20 Sunyoung
**/
public class _10814 {
 
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String[][] arr = new String[n][2];
 
        for ( int i = 0; i < n; i++ ){
            arr[i][0] = valueOf(sc.nextInt());
            arr[i][1] = sc.next();
        }
 
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });
 
        for ( int i = 0; i < n; i++ ){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
        sc.close();
 
    }
}