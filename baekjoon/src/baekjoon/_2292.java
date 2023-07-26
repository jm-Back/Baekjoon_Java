package baekjoon;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * 2292번 풀이
 * 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
 * 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지
 * 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
 */
public class _2292 {
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int count = 1;
 
        //1+(무조건1)  2~7  8~19  20~37   38~61
        //              6 차이    12    18      23 (6씩 차이남)
 
        int max = 1;
        //i는 차이
        for ( int i = 6; 1000000 > i; i = i + 6){
 
            if ( n == 1 ) {
                break;
            }
 
            if ( n > max ){
                max = max + i;
                count++;
            }
            else if ( n < max ){
                break;
            }
        }
 
        System.out.println(count);
        
        sc.close();
    }
}