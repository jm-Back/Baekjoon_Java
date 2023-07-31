package baekjoon;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * 1436번 풀이 - 영화감독 숌
 * 종말의 수란 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수를 말한다.
 * 제일 작은 종말의 수는 666이고, 그 다음으로 큰 수는 1666, 2666, 3666, .... 이다.
 *  따라서, 숌은 첫 번째 영화의 제목은 "세상의 종말 666", 두 번째 영화의 제목은 "세상의 종말 1666"와 같이 이름을 지을 것이다.
 *  숌이 만든 N번째 영화의 제목에 들어간 수를 출력하는 프로그램을 작성하시오.
 *
 * 첫 째 줄에는 n이 주어진다.
 */
public class _1436 {
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt(); //몇번째?
        int m = 0; //처음은 666부터 시작.
 
        int count = 1; // 체크 카운트.
 
        while( true ){
            m++;
 
            if ( Integer.toString(m).indexOf("666") > -1 ){
 
                if ( n == count ){
                    System.out.println(m);
                    break;
                }
                else{
                    count++;
                }
 
            }
        }
 
        sc.close();
    }
}